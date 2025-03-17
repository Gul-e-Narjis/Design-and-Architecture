package withoutprinciple;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author GULE NARJIS
 */
public class Withoutprinciple {

    class Order {
        private String orderId;
        private String foodName;
        private double price;
    
        public Order(String orderId, String foodName, double price) {
            this.orderId = orderId;
            this.foodName = foodName;
            this.price = price;
        }
    
        public void showOrderDetails() {
            System.out.println("Order ID: " + orderId);
            System.out.println("Food Ordered: " + foodName);
            System.out.println("Total Price: $" + price);
        }
    }
    
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
    
        public void showCustomerInfo() {
            System.out.println("Customer ID: " + customerId);
            System.out.println("Customer Name: " + name);
        }
    }
    
    public static void main(String[] args) {
        Withoutprinciple outer = new Withoutprinciple();
        
        Food pizza = outer.new Food("Pizza", 12.99);
        Order order1 = outer.new Order("152", pizza.getName(), pizza.getPrice());
        Customer customer1 = outer.new Customer("C001", "Ali Khan");
        customer1.showCustomerInfo();
        order1.showOrderDetails();
    }
}



