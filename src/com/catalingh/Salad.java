package com.catalingh;

public class Salad extends Ingredient {

    private double price = 3.0d;
    private String category = "Vegetables";

    public Salad(double price, String category) {
        this.price = price;
        this.category = category;
    }

    public Salad(double price) {
        this.price = price;
        this.category = "Unkown";
    }

    public Salad() {
    }
}
