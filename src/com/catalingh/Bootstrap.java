package com.catalingh;

public class Bootstrap {

    public static void main(String[] args) {

        Menu myMenu = new Menu();
        myMenu.addProduct(new Product("Chicken Salad",new Chicken(),new Salad()));
        myMenu.addProduct(new Product("Chicken Onion Salad",new Chicken(),new Salad(),new Onions()));
        myMenu.addProduct(new Product("Cheese Salad",new Cheese(),new Salad()));
        myMenu.addProduct(new Product("Greek Salad",new Cheese(),new Salad(),new Onions(),new Tomato()));
        myMenu.addProduct(new Product("Mega Salad",new Cheese(),new Salad(),new Onions(), new Onions(), new Chicken(),new Chicken()));
        myMenu.addProduct(new Product("Chicken Cheese Heaven",new Chicken(),new Cheese(),new Onions()));

    myMenu.displayMenu();

        myMenu.searchByProductName("Chicken");



    }
}
