package com.Investiny.Investiny.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Projets")
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "titreduprojet")
    private String titreduprojet;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "categorie")
    private String categorie;

    @Column(name = "statut")
    private String statut;

    @Column(name = "montantcible")
    private Double montantcible;

    @Column(name = "montantactuel")
    private Double montantactuel;

    @Column(name = "datededebut")
    @Temporal(TemporalType.DATE)
    private Date datededebut;

    @Column(name = "datedefin")
    @Temporal(TemporalType.DATE)
    private Date datedefin;

    @Column(name = "imageduprojet")
    private String imageduprojet;

    @Column(name = "createur")
    private Long createur;
    @Column(name = "prix")
    private Long prix;

    public Projet() {
    }

    public Projet(String titreduprojet, String description, String categorie, String statut, Double montantcible, Double montantactuel, Date datededebut, Date datedefin, String imageduprojet, Long createur, Long prix) {
        this.titreduprojet = titreduprojet;
        this.description = description;
        this.categorie = categorie;
        this.statut = statut;
        this.montantcible = montantcible;
        this.montantactuel = montantactuel;
        this.datededebut = datededebut;
        this.datedefin = datedefin;
        this.imageduprojet = imageduprojet;
        this.createur = createur;
        this.prix = prix;
    }

    public Projet(Long id, String titreduprojet, String description, String categorie, String statut, Double montantcible, Double montantactuel, Date datededebut, Date datedefin, String imageduprojet, Long createur, Long prix) {
        this.id = id;
        this.titreduprojet = titreduprojet;
        this.description = description;
        this.categorie = categorie;
        this.statut = statut;
        this.montantcible = montantcible;
        this.montantactuel = montantactuel;
        this.datededebut = datededebut;
        this.datedefin = datedefin;
        this.imageduprojet = imageduprojet;
        this.createur = createur;
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitreduprojet() {
        return titreduprojet;
    }

    public void setTitreduprojet(String titreduprojet) {
        this.titreduprojet = titreduprojet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Double getMontantcible() {
        return montantcible;
    }

    public void setMontantcible(Double montantcible) {
        this.montantcible = montantcible;
    }

    public Double getMontantactuel() {
        return montantactuel;
    }

    public void setMontantactuel(Double montantactuel) {
        this.montantactuel = montantactuel;
    }

    public Date getDatededebut() {
        return datededebut;
    }

    public void setDatededebut(Date datededebut) {
        this.datededebut = datededebut;
    }

    public Date getDatedefin() {
        return datedefin;
    }

    public void setDatedefin(Date datedefin) {
        this.datedefin = datedefin;
    }

    public String getImageduprojet() {
        return imageduprojet;
    }

    public void setImageduprojet(String imageduprojet) {
        this.imageduprojet = imageduprojet;
    }

    public Long getCreateur() {
        return createur;
    }

    public void setCreateur(Long createur) {
        this.createur = createur;
    }

    public Long getPrix() {
        return prix;
    }

    public void setPrix(Long prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Projet{" +
                "id=" + id +
                ", titreduprojet='" + titreduprojet + '\'' +
                ", description='" + description + '\'' +
                ", categorie='" + categorie + '\'' +
                ", statut='" + statut + '\'' +
                ", montantcible=" + montantcible +
                ", montantactuel=" + montantactuel +
                ", datededebut=" + datededebut +
                ", datedefin=" + datedefin +
                ", imageduprojet='" + imageduprojet + '\'' +
                ", createur=" + createur +
                '}';
    }
}
