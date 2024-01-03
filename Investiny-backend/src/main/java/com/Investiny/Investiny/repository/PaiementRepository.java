package com.Investiny.Investiny.repository;

import com.Investiny.Investiny.model.Paiement;

import com.Investiny.Investiny.model.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
    List<Projet> findByidutilisateur(Long idutilisateur);
}
