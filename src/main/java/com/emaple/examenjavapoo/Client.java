package com.emaple.examenjavapoo;

class Client {
    private int id;
    private String nom;

    public Client(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
}