package com.catalingh;

public class Salad implements Ingredient {

    private double price = 3.0d;
    private String ingredientName = "Salad";
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
        this.price = this.price;
    }

    @Override
    public String getIngredientName() {
        return ingredientName;
    }

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
