package com.Investiny.Investiny.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Investiny.Investiny.model.Projet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
    List<Projet> findByCreateur(Long createur);
}
