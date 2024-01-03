package com.Investiny.Investiny.controller;

import com.Investiny.Investiny.exception.ResourceNotFoundException;
import com.Investiny.Investiny.model.Paiement;
import com.Investiny.Investiny.model.Projet;
import com.Investiny.Investiny.repository.PaiementRepository;
import com.Investiny.Investiny.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PaiementController {
    @Autowired
    private PaiementRepository PaiementRepository;
    private ProjetRepository projetRepository;
    @PostMapping("/Paiements")
    public Paiement createPaiement(@RequestBody Paiement Paiement) {
        return PaiementRepository.save(Paiement);
    }

    @GetMapping("/relatedPaiement")
    public List<Projet> findByidutilisateur(@RequestParam(required = false) Long idutilisateur){
        if (idutilisateur != null) {
            // Perform filtering based on status
            return PaiementRepository.findByidutilisateur(idutilisateur);
        } else {
            // If no status is provided, return all projects
            return projetRepository.findAll();
        }
    }

}
