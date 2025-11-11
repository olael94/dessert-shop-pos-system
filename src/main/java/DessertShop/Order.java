 /*File: "Order.java"
  * Author: Aldo Velasquez & Oliver Rivera
  * Course: CS-115-01
  * Instructor: Barbara Chamberlin
  * Date: Feb 2, 2024
  * Description: Created orderCost() and orderTax to calculate cost per item and tax per item
  */

 package DessertShop;

 import java.util.ArrayList;

 public class Order {

     private ArrayList<DessertItem> order;

     // Default constructor
     public Order() {
         order = new ArrayList<DessertItem>();
     }

     // Getter method for order
     public ArrayList<DessertItem> getOrderList() {
         return order;
     }

     // Method to add a DessertItem to the order
     public void addDessertItem(DessertItem item) {
         order.add(item);
     }

     // Method to get the number of items in the order
     public int getItemCount() {
         return order.size();
     }

     //OrderCost() for all items
     public double orderCost() {
         double totalCost = 0.0;
         for (DessertItem item : order) {
             totalCost += item.calculateCost();
         }
         return totalCost;
     }

     //Calculate taxes for all items
     public double orderTax() {
         double totalTax = 0.0;
         for (DessertItem item : order) {
             totalTax += item.calculateTax();
         }
         return totalTax;
     }
 }

