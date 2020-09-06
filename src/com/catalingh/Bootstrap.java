package com.catalingh;

public class Bootstrap {

    public static void main(String[] args) {

        Meniu myMeniu = new Meniu();
        myMeniu.addProduct(new Product("Chicken Salad",new Chicken(),new Salad()));
        myMeniu.addProduct(new Product("Cheese Salad",new Cheese(),new Salad()));
        myMeniu.addProduct(new Product("Greek Salad",new Cheese(),new Salad(),new Onions()));

    }


}
