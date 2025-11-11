 /*File: "DessertItemTest.java"
 * Author: Aldo Velasquez & Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Jan 26, 2024
 * Description:Test methods of the Parent Class
  */

package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DessertItemTest {

	@Test
	void testGetName() {
		DessertItem d1 = new DessertItem("Test Dessert");
		assertEquals(d1.getName(), "Test Dessert");
	}

	@Test
	void testSetName() {
		DessertItem d1 = new DessertItem("Test Dessert");
		d1.setName("Updated Dessert");
		assertEquals(d1.getName(), "Updated Dessert");
	}

}//END of DessertItemTest