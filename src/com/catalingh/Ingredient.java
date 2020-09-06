package com.catalingh;

public abstract class Ingredient {

    private double price;
    private String category;


    public Ingredient(double price, String category) {
        this.price = price;
        this.category = category;

    }

    public Ingredient(double price){
        this.price=price;
        this.category="Unkown";
    }

    public Ingredient(){

    }

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
