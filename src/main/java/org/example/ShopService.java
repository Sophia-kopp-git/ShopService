package org.example;

public class ShopService {
    OrderMapRepo orderMapRepo = new OrderMapRepo();

    public ShopService(OrderMapRepo orderMapRepo) {
    this.orderMapRepo = orderMapRepo;
    }

    void addNewOrder(Order order){
        for (Product product : order.orderedProducts()){
            if(!ProductRepo.products.contains(product) ){
                System.out.println("Product with id " + product.id() + " is not available.");
            }
        }
        orderMapRepo.addOrder(order);
    }
}
