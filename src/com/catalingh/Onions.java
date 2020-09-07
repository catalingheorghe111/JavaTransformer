package com.catalingh;

public class Onions implements Ingredient {

    private double price = 2.0d;
    private String ingredientName = "Onions";
    private String category = "Vegetables";

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getIngredientName() {
        return ingredientName;
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
