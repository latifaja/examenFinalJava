package com.emaple.examenjavapoo;

import java.util.ArrayList;
import java.util.List;

class IngredientDAO {
    private List<Ingredient> ingredients = new ArrayList<>();

    public void create(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public Ingredient read(int id) {
        return ingredients.stream().filter(i -> i.getId() == id).findFirst().orElse(null);
    }

    public void update(Ingredient ingredient) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getId() == ingredient.getId()) {
                ingredients.set(i, ingredient);
                break;
            }
        }
    }

    public void delete(int id) {
        ingredients.removeIf(i -> i.getId() == id);
    }
}
