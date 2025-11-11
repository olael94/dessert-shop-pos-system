 /*File: "Order.java"
 * Author: Aldo Velasquez & Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Jan 27, 2024
 * Description:Order Class to call a DessertItem ArrayList
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
}
