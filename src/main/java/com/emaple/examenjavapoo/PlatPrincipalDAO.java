package com.emaple.examenjavapoo;

import java.util.ArrayList;
import java.util.List;

class PlatPrincipalDAO {
    private List<PlatPrincipal> plats = new ArrayList<>();

    public void create(PlatPrincipal plat) {
        plats.add(plat);
    }

    public PlatPrincipal read(int id) {
        return plats.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void update(PlatPrincipal plat) {
        for (int i = 0; i < plats.size(); i++) {
            if (plats.get(i).getId() == plat.getId()) {
                plats.set(i, plat);
                break;
            }
        }
    }

    public void delete(int id) {
        plats.removeIf(p -> p.getId() == id);
    }
}
