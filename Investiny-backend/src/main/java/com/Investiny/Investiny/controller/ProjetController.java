package com.Investiny.Investiny.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Investiny.Investiny.exception.ResourceNotFoundException;
import com.Investiny.Investiny.model.Projet;
import com.Investiny.Investiny.repository.ProjetRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class ProjetController {
    @Autowired
    private ProjetRepository projetRepository;

    @GetMapping("/projets")
    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }
    @GetMapping("/relatedprojets")
    public List<Projet> findProjetsByCreateur(@RequestParam(required = false) Long createur){
        if (createur != null) {
            // Perform filtering based on status
            return projetRepository.findByCreateur(createur);
        } else {
            // If no status is provided, return all projects
            return projetRepository.findAll();
        }
    }
    @GetMapping("/projets/{id}")
    public ResponseEntity<Projet> getProjetById(@PathVariable(value = "id") Long projetId)
            throws ResourceNotFoundException {
        Projet projet = projetRepository.findById(projetId)
                .orElseThrow(() -> new ResourceNotFoundException("Projet not found for this id :: " + projetId));
        return ResponseEntity.ok().body(projet);
    }

    @PostMapping("/projets")
    public Projet createProjet(@RequestBody Projet projet) {
        return projetRepository.save(projet);
    }

    @PutMapping("/projets/{id}")
    public ResponseEntity<Projet> updateProjet(@PathVariable(value = "id") Long projetId,
                                               @RequestBody Projet projetDetails) throws ResourceNotFoundException {
        Projet projet = projetRepository.findById(projetId)
                .orElseThrow(() -> new ResourceNotFoundException("Projet not found for this id :: " + projetId));

        projet.setTitreduprojet(projetDetails.getTitreduprojet());
        projet.setDescription(projetDetails.getDescription());
        projet.setCategorie(projetDetails.getCategorie());
        projet.setStatut(projetDetails.getStatut());
        projet.setMontantcible(projetDetails.getMontantcible());
        projet.setMontantactuel(projetDetails.getMontantactuel());
        projet.setDatededebut(projetDetails.getDatededebut());
        projet.setDatedefin(projetDetails.getDatedefin());
        projet.setImageduprojet(projetDetails.getImageduprojet());
        projet.setPrix(projetDetails.getPrix());

        final Projet updatedProjet = projetRepository.save(projet);
        return ResponseEntity.ok(updatedProjet);
    }

    @DeleteMapping("/projets/{id}")
    public Map<String, Boolean> deleteProjet(@PathVariable(value = "id") Long projetId)
            throws ResourceNotFoundException {
        Projet projet = projetRepository.findById(projetId)
                .orElseThrow(() -> new ResourceNotFoundException("Projet not found for this id :: " + projetId));

        projetRepository.delete(projet);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
