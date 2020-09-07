package com.catalingh;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
    private double productPrice;
    List<Ingredient> ingredientList = new ArrayList<Ingredient>();

    public double calculatePrice(){
        double priceAcc=0;
        for(Ingredient i: ingredientList){
            priceAcc+=i.getPrice();
        }
        return priceAcc;
    }


    Product (String productName,Ingredient ... ingredient){
        this.productName=productName;
        for (Ingredient i:ingredient){
            ingredientList.add(i);
        }
    }

    Product(){
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return this.productName;
    }

    public void addIngredient(Ingredient... ingredient) {
        for(Ingredient i:ingredient)
        ingredientList.add(i);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }
}
