package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderMapRepo implements OrderRepo{
    List<Order> orders = new ArrayList<>();
    OrderListRepo orderListRepo = new OrderListRepo(orders);

    @Override
    public void addOrder(Order order) {
        orderListRepo.addOrder(order);
    }

    @Override
    public void removeOrder(Order order) {
        orderListRepo.removeOrder(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderListRepo.getAllOrders();
    }

    @Override
    public Order getOrderById(String id) {
        return orderListRepo.getOrderById(id);
    }
}
