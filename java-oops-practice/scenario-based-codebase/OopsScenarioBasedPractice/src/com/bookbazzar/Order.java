package com.bookbazzar;
import java.util.ArrayList;
import java.util.List;

// Order links user to books
class Order {

    private String userName;
    private List<Book> books = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();

    // Order status restricted internally
    private String orderStatus = "CREATED";

    public Order(String userName) {
        this.userName = userName;
    }

    public void addBook(Book book, int quantity) {
        book.reduceStock(quantity); // stock update via method only
        books.add(book);
        quantities.add(quantity);
    }

    // Calculate total using polymorphism
    public double calculateTotal() {

        double total = 0;

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            int qty = quantities.get(i);

            double price = book.price * qty;
            double discount = book.applyDiscount(qty); // polymorphic call

            total += price - discount;
        }
        return total;
    }

    // Order status can be changed only internally
    private void updateStatus(String status) {
        orderStatus = status;
    }

    public void confirmOrder() {
        updateStatus("CONFIRMED");
    }

    public void displayOrder() {
        System.out.println("User: " + userName);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Total Amount: ₹" + calculateTotal());
    }
}
