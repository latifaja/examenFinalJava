package com.emaple.examenjavapoo;

import java.util.ArrayList;
import java.util.List;

class Repas {
    private PlatPrincipal plat;
    private List<Supplement> supplements = new ArrayList<>();

    public Repas(PlatPrincipal plat) {
        this.plat = plat;
    }

    public void ajouterSupplement(Supplement supplement) {
        supplements.add(supplement);
    }

    public double calculerTotal() {
        double totalSupplements = supplements.stream().mapToDouble(Supplement::getPrix).sum();
        return plat.calculerPrix() + totalSupplements;
    }

    public PlatPrincipal getPlat() {
        return plat;
    }

    public List<Supplement> getSupplements() {
        return supplements;
    }
}

