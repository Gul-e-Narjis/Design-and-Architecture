package withpackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author GULE NARJIS
 */
class Food {
    private String name;
    private double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getName() { // 
        return name;
    }

    public void showCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);
    }
}
class Order {
    private String orderId;
    private Food food;
    private Customer customer;

    public Order(String orderId, Food food, Customer customer) {
        this.orderId = orderId;
        this.food = food;
        this.customer = customer;
    }

    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Food Ordered: " + food.getName());
        System.out.println("Total Price: $" + food.getPrice());
        System.out.println("Ordered by: " + customer.getName());
    }
}
class OrderFactory {  // Creator Principle Applied 
    public static Order createOrder(String orderId, Food food, Customer customer) {
        return new Order(orderId, food, customer);
    }
}

public class Withprinciple {
    public static void main(String[] args) {
        Food pizza = new Food("Pizza", 12.99);
        Customer customer1 = new Customer("C001", "Ali Khan");
        
        Order order1 = OrderFactory.createOrder("152", pizza, customer1); // Using OrderFactory to create order (Creator Principle)
        customer1.showCustomerInfo();
        order1.showOrderDetails();
    }
}


