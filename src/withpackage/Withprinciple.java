package withpackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author GULE NARJIS
 */
public class Withprinciple {
    class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Order {
    private String orderId;
    private Food food; // Order "owns" Food

    public Order(String orderId, String foodName) {
        this.orderId = orderId;
        this.food = new Food(foodName); // Creator Principle Used
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Food Ordered: " + food.getName());
    }
}
   public static void main(String[] args) {
       Withprinciple outer = new Withprinciple(); // Create an instance of the outer class
        Order order1 = outer.new Order("152", "Pizza");
        order1.showOrderDetails();
    }
    
}
