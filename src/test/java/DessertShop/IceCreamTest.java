 /*File: "IceCreamTest.java"
 * Author: Aldo Velasquez & Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Jan 26, 2024
 * Description:Test methods of Ice Cream Class
  */

package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IceCreamTest {

	@Test
	void testGetScoopCount() {
		IceCream i1 = new IceCream("Oreo Ice Cream", 2, 2.5);
		assertEquals(i1.getScoopCount(), 2);
	}

	@Test
	void testGetPricePerScoop() {
		IceCream i1 = new IceCream("Oreo Ice Cream", 2, 2.5);
		assertEquals(i1.getPricePerScoop(), 2.5,0.01);
	}

	@Test
	void testSetScoopCount() {
		IceCream i1 = new IceCream("Oreo Ice Cream", 2, 2.5);
		i1.setScoopCount(3);
		assertEquals(i1.getScoopCount(), 3);
	}

	@Test
	void testSetPricePerScoop() {
		IceCream i1 = new IceCream("Oreo Ice Cream", 2, 2.5);
		i1.setPricePerScoop(3.5);
		assertEquals(i1.getPricePerScoop(), 3.5,0.01);
	}

}//END of IceCreamTest
