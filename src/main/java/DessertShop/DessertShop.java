 /*File: "DessertShop.java"
 * Author: Aldo Velasquez & Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Jan 27, 2024
 * Description:DessertShop Class with Main method to run the entire program calling classes from Order and all the other classes created.
  */

package DessertShop;

public class DessertShop {

	public static void main(String[] args) {
		
		// Create a new instance of the Order class
        Order order = new Order();

        // Add items to the order
        order.addDessertItem(new Candy("Candy Corn", 1.5, 0.25));
        order.addDessertItem(new Candy("Gummy Bears", 0.25, 0.35));
        order.addDessertItem(new Cookie("Chocolate Chip", 6, 3.99));
        order.addDessertItem(new IceCream("Pistachio", 2, 0.79));
        order.addDessertItem(new Sundae("Vanilla", 3, 0.69, "Hot Fudge", 1.29));
        order.addDessertItem(new Cookie("Oatmeal Raisin", 2, 3.45));

        // Print the name of each DessertItem in the order
        System.out.println("Items in the order:\n");
        
        //This will print all the items in the order DessertItem Array list and stop when last item is added.
        for (int i = 0; i < order.getOrderList().size(); i++) {
            DessertItem item = order.getOrderList().get(i);
            System.out.println(item.getName());
        }

        // Print the total number of items in the order
        System.out.println("\nTotal number of items in the order: " + order.getItemCount());

	}

}
