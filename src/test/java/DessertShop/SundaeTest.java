 /*File: "SundaeTest.java"
 * Author: Aldo Velasquez & Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Jan 26, 2024
 * Description:Test methods of Sundae Class
  */

package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SundaeTest {

	@Test
	void testGetToppingName() {
		Sundae s1 = new Sundae("McSundae", 2, 2.5, "Dulce de Leche", 0.99);
		assertEquals(s1.getToppingName(), "Dulce de Leche");
	}

	@Test
	void testGetToppingPrice() {
		Sundae s1 = new Sundae("McSundae", 2, 2.5, "Dulce de Leche", 0.99);
		assertEquals(s1.getToppingPrice(), 0.99,0.01);
	}

	@Test
	void testSetToppingName() {
		Sundae s1 = new Sundae("McSundae", 2, 2.5, "Dulce de Leche", 0.99);
		s1.setToppingName("Chocolate Chips");
		assertEquals(s1.getToppingName(), "Chocolate Chips");
	}

	@Test
	void testSetToppingPrice() {
		Sundae s1 = new Sundae("McSundae", 2, 2.5, "Dulce de Leche", 0.99);
		s1.setToppingPrice(0.5);
		assertEquals(s1.getToppingPrice(), 0.5,0.01);
	}

}//END of SundaeTest
