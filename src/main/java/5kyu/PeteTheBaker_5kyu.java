package org.example;

import java.util.Map;

public class PeteTheBaker_5kyu {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {

        int possibleCakes = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> product : recipe.entrySet()) {
            String productName = product.getKey();
            if (available.get(productName) == null) {
                return 0;
            }

            int quantityNeeded = recipe.get(productName);

            if (available.containsKey(productName)) {
                int availableQuantity = available.get(productName);
                int possibleQuantity = availableQuantity / quantityNeeded;
                if (possibleQuantity < possibleCakes) {
                    possibleCakes = possibleQuantity;
                }
            }
        }

        return possibleCakes;
    }

    public static void main(String[] args) {
        System.out.println(cakes(
                Map.of(
                        "flour", 500,
                        "sugar", 200,
                        "eggs", 1),
                Map.of(
                        "flour", 1200,
                        "sugar", 1200,
                        "eggs", 5,
                        "milk", 200)));

        System.out.println(cakes(
                Map.of(
                        "flour", 500,
                        "sugar", 200,
                        "eggs", 1,
                        "cinnamon", 300),
                Map.of(
                        "flour", 1200,
                        "sugar", 1200,
                        "eggs", 5,
                        "milk", 200)));
    }
}
