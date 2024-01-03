package com.Investiny.Investiny.repository;

import com.Investiny.Investiny.model.Contributeur;

import com.Investiny.Investiny.model.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContributionRepository extends JpaRepository<Contributeur, Long> {
    List<Projet> findByidutilisateur(Long idutilisateur);
}
