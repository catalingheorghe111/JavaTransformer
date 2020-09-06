package com.catalingh;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
    private double productPrice;
    List<Ingredient> myProduct = new ArrayList<Ingredient>();


    Product (String productName,Ingredient ... ingredients){
        double priceAcc=0;
        this.productName=productName;
        for (Ingredient i:myProduct){
            priceAcc+=i.getPrice();
        }

        setProductPrice(priceAcc);
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
        myProduct.add(i);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Ingredient> getMyProduct() {
        return myProduct;
    }

    public void setMyProduct(List<Ingredient> myProduct) {
        this.myProduct = myProduct;
    }
}
