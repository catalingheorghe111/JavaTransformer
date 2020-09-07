package com.catalingh;

public class Chicken implements Ingredient {
    private double price = 7.0d;
    private String category = "Meat";

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
