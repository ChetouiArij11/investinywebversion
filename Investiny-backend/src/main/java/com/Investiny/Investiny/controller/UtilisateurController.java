package com.Investiny.Investiny.controller;

import com.Investiny.Investiny.model.Projet;
import com.Investiny.Investiny.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import com.Investiny.Investiny.exception.ResourceNotFoundException;
import com.Investiny.Investiny.model.Utilisateur;
import com.Investiny.Investiny.repository.UtilisateurRepository;
import com.Investiny.Investiny.model.LoginRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class UtilisateurController {
    @Autowired
    private final UtilisateurRepository utilisateurRepository;
    private ProjetRepository projetRepository;

    @Autowired
    public UtilisateurController(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }
    @GetMapping("/utilisateurs")
    public ResponseEntity<List<Utilisateur>> getAllUtilisateurs() {
        List<Utilisateur> utilisateurs = utilisateurRepository.findAll();
        return ResponseEntity.ok().body(utilisateurs);
    }

    @GetMapping("/utilisateurs/{id}")
    public ResponseEntity<Utilisateur> getUtilisateurById(@PathVariable(value = "id") Long utilisateurId)
            throws ResourceNotFoundException {
        Utilisateur utilisateur = utilisateurRepository.findById(utilisateurId)
                .orElseThrow(() -> new ResourceNotFoundException("Utilisateur not found for this id :: " + utilisateurId));
        return ResponseEntity.ok().body(utilisateur);
    }

    @PostMapping("/utilisateurs")
    public ResponseEntity<Utilisateur> createUtilisateur(@RequestBody Utilisateur utilisateur) {
        Utilisateur createdUtilisateur = utilisateurRepository.save(utilisateur);
        return ResponseEntity.ok().body(createdUtilisateur);
    }

    @PutMapping("/utilisateurs/{id}")
    public ResponseEntity<Utilisateur> updateUtilisateur(@PathVariable(value = "id") Long utilisateurId,
                                                         @RequestBody Utilisateur utilisateurDetails) throws ResourceNotFoundException {
        Utilisateur utilisateur = utilisateurRepository.findById(utilisateurId)
                .orElseThrow(() -> new ResourceNotFoundException("Utilisateur not found for this id :: " + utilisateurId));

        utilisateur.setNom(utilisateurDetails.getNom());
        utilisateur.setPrenom(utilisateurDetails.getPrenom());
        utilisateur.setAdresseemail(utilisateurDetails.getAdresseemail());
        utilisateur.setMotdepasse(utilisateurDetails.getMotdepasse());
        utilisateur.setImagedeprofil(utilisateurDetails.getImagedeprofil());

        final Utilisateur updatedUtilisateur = utilisateurRepository.save(utilisateur);
        return ResponseEntity.ok(updatedUtilisateur);
    }

    @DeleteMapping("/utilisateurs/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteUtilisateur(@PathVariable(value = "id") Long utilisateurId)
            throws ResourceNotFoundException {
        Utilisateur utilisateur = utilisateurRepository.findById(utilisateurId)
                .orElseThrow(() -> new ResourceNotFoundException("Utilisateur not found for this id :: " + utilisateurId));

        utilisateurRepository.delete(utilisateur);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);


    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        String adresseemail = request.getAdresseemail();
        String motdepasse = request.getMotdepasse();

        Utilisateur user = utilisateurRepository.findByAdresseemail(adresseemail);

        if (user != null && user.getMotdepasse().equals(motdepasse)) {
            return ResponseEntity.ok().body(String.valueOf(user.getId()));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
        }
    }

}
