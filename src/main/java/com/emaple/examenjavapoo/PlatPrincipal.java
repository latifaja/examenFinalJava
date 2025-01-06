package com.emaple.examenjavapoo;

import java.util.HashMap;
import java.util.Map;

class PlatPrincipal {
    private int id;
    private String nom;
    private Map<Ingredient, Double> ingredients = new HashMap<>();

    public PlatPrincipal(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public void ajouterIngredient(Ingredient ingredient, double quantite) {
        ingredients.put(ingredient, quantite);
    }

    public double calculerPrix() {
        return ingredients.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPrixUnitaire() * entry.getValue())
                .sum();
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public Map<Ingredient, Double> getIngredients() {
        return ingredients;
    }
}
