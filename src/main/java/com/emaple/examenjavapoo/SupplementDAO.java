package com.emaple.examenjavapoo;

import java.util.ArrayList;
import java.util.List;

class SupplementDAO {
    private List<Supplement> supplements = new ArrayList<>();

    public void create(Supplement supplement) {
        supplements.add(supplement);
    }

    public Supplement read(int id) {
        return supplements.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public void update(Supplement supplement) {
        for (int i = 0; i < supplements.size(); i++) {
            if (supplements.get(i).getId() == supplement.getId()) {
                supplements.set(i, supplement);
                break;
            }
        }
    }

    public void delete(int id) {
        supplements.removeIf(s -> s.getId() == id);
    }
}
