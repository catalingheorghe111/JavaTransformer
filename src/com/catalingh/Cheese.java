package com.catalingh;

public class Cheese implements Ingredient {

    private double price = 6.0d;
    private String category ="Cheese";

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
