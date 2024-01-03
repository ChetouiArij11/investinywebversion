package com.Investiny.Investiny.model;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "paiements")
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "montantpaiement")
    private Double montantpaiement;
    @Column(name = "datepaiement")
    private Date datepaiement;
    @Column(name = "idutilisateur")
    private Long idutilisateur;
    @Column(name = "idprojet")
    private Long idprojet;
    @Column(name = "num_carte")
    private BigInteger num_carte;

    public Paiement() {

    }

    public Paiement(Long id, Double montantpaiement, Date datepaiement, Long idutilisateur, Long idprojet, BigInteger num_carte) {
        this.id = id;
        this.montantpaiement = montantpaiement;
        this.datepaiement = datepaiement;
        this.idutilisateur = idutilisateur;
        this.idprojet = idprojet;
        this.num_carte = num_carte;
    }

    public Paiement(Double montantpaiement, Date datepaiement, Long idutilisateur, Long idprojet, BigInteger num_carte) {
        this.montantpaiement = montantpaiement;
        this.datepaiement = datepaiement;
        this.idutilisateur = idutilisateur;
        this.idprojet = idprojet;
        this.num_carte = num_carte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMontantpaiement() {
        return montantpaiement;
    }

    public void setMontantpaiement(Double montantpaiement) {
        this.montantpaiement = montantpaiement;
    }

    public Date getDatepaiement() {
        return datepaiement;
    }

    public void setDatepaiement(Date datepaiement) {
        this.datepaiement = datepaiement;
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

    public BigInteger getNum_carte() {
        return num_carte;
    }

    public void setNum_carte(BigInteger num_carte) {
        this.num_carte = num_carte;
    }

    @Override
    public String toString() {
        return "Paiement{" +
                "id=" + id +
                ", montantpaiement=" + montantpaiement +
                ", datepaiement=" + datepaiement +
                ", idutilisateur=" + idutilisateur +
                ", idprojet=" + idprojet +
                ", num_carte=" + num_carte +
                '}';
    }
}

