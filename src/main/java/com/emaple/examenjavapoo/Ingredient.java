package com.emaple.examenjavapoo;

class Ingredient {
    private int id;
    private String nom;
    private double prixUnitaire;

    public Ingredient(int id, String nom, double prixUnitaire) {
        this.id = id;
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }
}
