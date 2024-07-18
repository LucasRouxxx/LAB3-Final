package org.example;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.addObserver(priceObserver);
        order.addObserver(quantityObserver);

        Item item1 = new Item(100, 2);
        Item item2 = new Item(150, 4);

        order.addItem(item1);
        order.addItem(item2);

        System.out.println("Total Price: " + order.getTotalPrice());
        System.out.println("Total Quantity: " + order.getTotalQuantity());
        System.out.println("Shipping Cost: " + order.getShippingCost());
    }
}