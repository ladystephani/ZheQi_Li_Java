package com.company;

import com.company.Shop.IceCream;

public class App {
    public static void main(String[] args) {
        //shop
        IceCream icecreamInStore = new IceCream();
        String order = icecreamInStore.orderPlaced("vanilla");
        System.out.println(order);
    }
}
