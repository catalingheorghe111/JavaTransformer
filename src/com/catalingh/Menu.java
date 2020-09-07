package com.catalingh;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<Product> myMenu = new ArrayList<Product>();

    public void addProduct(Product product) {
        myMenu.add(product);
    }

    public void displayMenu() {
        for (Product p : myMenu) {
            System.out.println(p + " price: " + p.calculatePrice());
        }
    }

    public void searchByProductName(String name) {
        System.out.println("\nMenu items names that contain the keywork '" + name + "':");
        for (Product p : myMenu) {
            if (p.toString().contains(name)) {
                System.out.println(p + " price: " + p.calculatePrice());
            }
        }
    }

    public void searchByIngredients(String ingredientName) {
        System.out.println("\nMenu items that contain the ingredient '" + ingredientName + "':");
        int counter = 0; //use counter to display only 1 time the product that has multiple instances of the same ingredient
        for (Product p : myMenu) {
            counter = 0;
            for (Ingredient i : p.ingredientList) {
                if (i.getIngredientName().contains(ingredientName) && counter == 0) {
                    System.out.println(p + " price: " + p.calculatePrice());
                    counter++;
                }
            }
        }
    }
}

