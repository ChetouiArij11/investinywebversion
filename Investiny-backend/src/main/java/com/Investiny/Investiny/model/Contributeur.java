package com.Investiny.Investiny.model;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "contributeurs")
public class Contributeur {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "idutilisateur")
    private Long idutilisateur;
    @Column(name = "idprojet")
    private Long idprojet;
    @Column(name = "montantcontribution")
    private Double montantcontribution;
    @Column(name = "datecontribution")
    private Date datecontribution;

    @Column(name = "num_carte")
    private BigInteger num_carte;

    public Contributeur() {

    }

    public Contributeur(Long idutilisateur, Long idprojet, Double montantcontribution, Date datecontribution, BigInteger num_carte) {
        this.idutilisateur = idutilisateur;
        this.idprojet = idprojet;
        this.montantcontribution = montantcontribution;
        this.datecontribution = datecontribution;
        this.num_carte = num_carte;
    }

    public Contributeur(Long id, Long idutilisateur, Long idprojet, Double montantcontribution, Date datecontribution, BigInteger num_carte) {
        this.id = id;
        this.idutilisateur = idutilisateur;
        this.idprojet = idprojet;
        this.montantcontribution = montantcontribution;
        this.datecontribution = datecontribution;
        this.num_carte = num_carte;
    }

    public BigInteger getNum_carte() {
        return num_carte;
    }

    public void setNum_carte(BigInteger num_carte) {
        this.num_carte = num_carte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Long idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Long getIdprojet() {
        return idprojet;
    }

    public void setIdprojet(Long idprojet) {
        this.idprojet = idprojet;
    }

    public Double getMontantcontribution() {
        return montantcontribution;
    }

    public void setMontantcontribution(Double montantcontribution) {
        this.montantcontribution = montantcontribution;
    }

    public Date getDatecontribution() {
        return datecontribution;
    }

    public void setDatecontribution(Date datecontribution) {
        this.datecontribution = datecontribution;
    }

    @Override
    public String toString() {
        return "Contributeur{" +
                "id=" + id +
                ", idutilisateur=" + idutilisateur +
                ", idprojet=" + idprojet +
                ", montantcontribution=" + montantcontribution +
                ", datecontribution=" + datecontribution +
                ", num_carte=" + num_carte +
                '}';
    }
}

