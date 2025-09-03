package org.example;

public class ShopService {


    void addNewOrder(Order order){
        for (Product product : order.orderedProducts()){
            if(!ProductRepo.products.contains(product) ){
                System.out.println("Product with id " + product.id() + " is not available.");
            }
        }
        OrderListRepo.orders.add(order);
    }
}
