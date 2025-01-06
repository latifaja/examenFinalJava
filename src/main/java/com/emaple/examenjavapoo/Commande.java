package com.emaple.examenjavapoo;

import java.util.ArrayList;
import java.util.List;

class Commande {
    private List<Repas> repas = new ArrayList<>();

    public void ajouterRepas(Repas repas) {
        this.repas.add(repas);
    }

    public double calculerTotal() {
        return repas.stream().mapToDouble(Repas::calculerTotal).sum();
    }

    public List<Repas> getRepas() {
        return repas;
    }
}