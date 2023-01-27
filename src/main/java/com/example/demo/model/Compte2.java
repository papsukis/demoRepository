package com.example.demo.model;

import com.example.demo.banque.Compte;
import lombok.Data;

@Data
public class Compte2 {

    int id;
    String nomCompte;
    long nouvelleValeur;

    public Compte2(Compte compte) {
        this.id = compte.getId();
        this.nomCompte = compte.getUtilisateur();
        this.nouvelleValeur = compte.getCompte()+10000;
    }
}
