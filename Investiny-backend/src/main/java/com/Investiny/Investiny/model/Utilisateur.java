package com.Investiny.Investiny.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "utilisateurs")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;

    @Column(name = "adresseemail")
    private String adresseemail;
    @Column(name = "motdepasse")
    private String motdepasse; // Champ Mot de passe

    @Column(name = "imagedeprofil")
    private String imagedeprofil;

    public Utilisateur() {

    }


    public Utilisateur(Long id, String nom, String prenom, String adresseemail, String motdepasse, String imagedeprofil) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresseemail = adresseemail;
        this.motdepasse = motdepasse;
        this.imagedeprofil = imagedeprofil;
    }
    public Utilisateur( String nom, String prenom, String adresseemail, String motdepasse, String imagedeprofil) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresseemail = adresseemail;
        this.motdepasse = motdepasse;
        this.imagedeprofil = imagedeprofil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresseemail() {
        return adresseemail;
    }

    public void setAdresseemail(String adresseemail) {
        this.adresseemail = adresseemail;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getImagedeprofil() {
        return imagedeprofil;
    }

    public void setImagedeprofil(String imagedeprofil) {
        this.imagedeprofil = imagedeprofil;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresseemail='" + adresseemail + '\'' +
                ", motdepasse='" + motdepasse + '\'' +
                ", imagedeprofil='" + imagedeprofil + '\'' +
                '}';
    }
}

