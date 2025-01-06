package com.emaple.examenjavapoo;

import java.util.Map;

public class RestaurantApplication {
    public static void main(String[] args) {
        // Créer un client
        Client client = new Client(1, "Ali baba");

        // Créer des ingrédients
        Ingredient viande = new Ingredient(1, "Viande", 10.0);
        Ingredient pruneaux = new Ingredient(2, "Pruneaux", 5.0);

        // Créer des suppléments
        Supplement frites = new Supplement(1, "Frites", 11.0);
        Supplement boisson = new Supplement(2, "Boisson", 12.0);

        // Créer un plat principal
        PlatPrincipal tajineViande = new PlatPrincipal(1, "Tajine de viande & Pruneaux");
        tajineViande.ajouterIngredient(viande, 250);
        tajineViande.ajouterIngredient(pruneaux, 1);

        // Créer un repas
        Repas repas1 = new Repas(tajineViande);
        repas1.ajouterSupplement(frites);
        repas1.ajouterSupplement(boisson);

        // Créer une commande
        Commande commande = new Commande();
        commande.ajouterRepas(repas1);

        // Afficher le ticket
        System.out.println("Bienvenue " + client.getNom());
        System.out.println("\n----------------\n");
        System.out.println("\n---TICKET---\n");
        System.out.println("Nom: " + client.getNom());
        System.out.println("Nombre de repas: " + commande.getRepas().size());

        int repasNumero = 1;
        for (Repas repas : commande.getRepas()) {
            System.out.println("Repas N°: " + repasNumero++ + " " + repas.getPlat().getNom());
            System.out.println("Ingrédients:");
            for (Map.Entry<Ingredient, Double> entry : repas.getPlat().getIngredients().entrySet()) {
                System.out.println(entry.getKey().getNom() + ": " + entry.getValue() + " gramme");
            }
            System.out.println("Suppléments:");
            for (Supplement supplement : repas.getSupplements()) {
                System.out.println(supplement.getNom() + " " + supplement.getPrix());
            }
            System.out.println();
        }
        System.out.println("Total: " + commande.calculerTotal());
    }
}
