package com.company;

public class App {
    public static void main(String[] args) {
        Address shippingAddress = new Address("Main St.", "n/a", "Vancouver", "BC", 20511);
        Address billingAddress = new Address("Broadway", "n/a", "Vancouver", "BC", 20511);

        Customer john = new Customer("Johnson", "Rock", "john@example.com", 12345678, billingAddress, shippingAddress, true);
//        System.out.println("Customer number one is " + john.getFirstName() + " " + john.getLastName());
        System.out.println(john.getBillingAddress());
    }

}
