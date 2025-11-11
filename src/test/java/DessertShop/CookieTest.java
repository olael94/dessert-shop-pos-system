 /*File: "CookieTest.java"
 * Author: Aldo Velasquez & Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Jan 26, 2024
 * Description:Test methods of Cookie Class
  */

package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {

	@Test
	void testGetCookieQty() {
		Cookie c1 = new Cookie("Oreos", 3, 3.5);
		assertEquals(c1.getCookieQty(), 3);
	}

	@Test
	void testGetPricePerDozen() {
		Cookie c1 = new Cookie("Oreos", 3, 3.5);
		assertEquals(c1.getPricePerDozen(), 3.5);
	}

	@Test
	void testSetCookieQty() {
		Cookie c1 = new Cookie("Oreos", 3, 3.5);
		c1.setCookieQty(5);
		assertEquals(c1.getCookieQty(), 5);
	}

	@Test
	void testSetPricePerDozen() {
		Cookie c1 = new Cookie("Oreos", 3, 3.5);
		c1.setPricePerDozen(5.5);
		assertEquals(c1.getPricePerDozen(), 5.5);
	}

}//END of CookieTest
