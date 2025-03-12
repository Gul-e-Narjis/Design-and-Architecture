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
    class Order{
    private String orderId;
    private String FoodName;
     public Order(String orderId, String FoodName ){
        this.orderId=orderId;
        this.FoodName=FoodName;
     }
     public void showOrderDetails(){
        System.out.println("Order ID " + orderId);
        System.out.println("Food Ordered "+ FoodName);
     }
}
class Food{
    private String name;
    
    public Food(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
}

    
    public static void main(String[] args) {
         Withoutprinciple outer = new Withoutprinciple(); 
        Order order1 = outer.new Order("152", "Pizza");
        order1.showOrderDetails();
    }
    }
    


