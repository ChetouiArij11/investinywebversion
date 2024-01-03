package com.Investiny.Investiny.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Investiny.Investiny.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Utilisateur findByAdresseemail(String adresseemail);
}

