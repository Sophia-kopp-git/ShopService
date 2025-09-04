package org.example;

public class Main {
    public static void main(String[] args) {

        OrderMapRepo orderMapRepo = new OrderMapRepo();
        ShopService shopService = new ShopService(orderMapRepo);
    }
}