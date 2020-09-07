package com.catalingh;

public class Bootstrap {

    public static void main(String[] args) {

        Menu myMenu = new Menu();
        myMenu.addProduct(new Product("Chicken Salad",new Chicken(),new Salad()));
        myMenu.addProduct(new Product("Cheese Salad",new Cheese(),new Salad()));
        myMenu.addProduct(new Product("Greek Salad",new Cheese(),new Salad(),new Onions()));

    myMenu.displayMenu();


    }
}
