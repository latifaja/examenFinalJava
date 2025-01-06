package com.emaple.examenjavapoo;

class Supplement {
    private int id;
    private String nom;
    private double prix;

    public Supplement(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }
}

