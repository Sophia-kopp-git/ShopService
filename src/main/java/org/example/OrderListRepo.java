package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderListRepo implements OrderRepo {
    static List<Order> orders = new ArrayList<>();

    @Override
    public List<Order> getAllOrders() {
        return orders;
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order);
    }

    @Override
    public Order getOrderById(String id) {
        Order searchedOrder = null;
        for (Order order : orders) {
            searchedOrder = order.orderId().equals(id) ? order : null;
        }
        return searchedOrder;
    }


    public OrderListRepo(List<Order> orders) {
        OrderListRepo.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(orders);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orders=" + orders +
                '}';
    }
}
