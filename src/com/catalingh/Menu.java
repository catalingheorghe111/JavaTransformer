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
        System.out.println("\nMenu items names that contain the keywork '" + name+"':");
        for (Product p : myMenu) {
            if (p.toString().contains(name)) {
                System.out.println(p + " price: " + p.calculatePrice());
            }
        }

    }

}

