package com.company.Shop;

public class IceCream {
    private double price;
    private String orderMessage;
    private String serveMessage;


    public double calculateTotal(int orderCount) {
        price = 5;
        return orderCount * price;
    }

    public String orderPlaced(String flavor) {
        orderMessage = "A new order of ice cream has been placed and is being prepared for flavor: " + flavor;
        return orderMessage;
    }

    public String served(String flavor) {
        serveMessage = "The latest order is ready to be picked up for flavor: " + flavor;
        return serveMessage;
    }

}
