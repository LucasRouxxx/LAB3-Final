package org.example;

public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getTotalQuantity() > 5) {
            order.setShippingCost(0);
        } else {
            order.setShippingCost(10);
        }
    }
}
