package com.catalingh;

public class Tomato implements Ingredient {

    private double price = 5.5d;
    private String ingredientName = "Tomato";
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
