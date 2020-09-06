package com.catalingh;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
    List<Ingredient> myProduct = new ArrayList<Ingredient>();


    Product (String productName,Ingredient ... ingredients){
        this.productName=productName;

    }

    Product(){

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
