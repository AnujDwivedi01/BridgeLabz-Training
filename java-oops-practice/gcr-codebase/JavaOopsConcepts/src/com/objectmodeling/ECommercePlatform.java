package com.objectmodeling;

// Product class
class Product {

    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void showProduct() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }
}

// Order class
class Order {

    private int orderId;
    private Product[] products = new Product[5];
    private int count = 0;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void addProduct(Product product) {
        products[count++] = product;
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (int i = 0; i < count; i++) {
            products[i].showProduct();
        }
    }
}


class ECommerceCustomer {

    private String customerName;
    private Order order;

    public ECommerceCustomer(String customerName) {
        this.customerName = customerName;
    }

    public void placeOrder(Order order) {
        this.order = order;
        System.out.println(customerName + " placed an order.");
    }

    public void showOrders() {
        order.showOrderDetails();
    }
}

// Main class
public class ECommercePlatform {

    public static void main(String[] args) {

        ECommerceCustomer customer = new ECommerceCustomer("Amit");

        Product product1 = new Product("Laptop", 55000);
        Product product2 = new Product("Mouse", 500);

        Order order = new Order(101);
        order.addProduct(product1);
        order.addProduct(product2);

        customer.placeOrder(order);
        customer.showOrders();
    }
}
