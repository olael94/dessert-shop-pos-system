 /*File: "CandyTest.java"
 * Author: Aldo Velasquez & Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Jan 26, 2024
 * Description:Test methods of Candy Class
  */

package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {

	@Test
	void testGetCandyWeight() {
		Candy c1 = new Candy("Push pop", 0.5, 0.99);
		assertEquals(c1.getCandyWeight(), 0.5,0.001);
	}

	@Test
	void testGetPricePerPound() {
		Candy c1 = new Candy("Push pop", 0.5, 0.99);
		assertEquals(c1.getPricePerPound(), 0.99,0.01);
	}

	@Test
	void testSetCandyWeight() {
		Candy c1 = new Candy("Push pop", 0.5, 0.99);
		c1.setCandyWeight(0.8);
		assertEquals(c1.getCandyWeight(), 0.8,0.001);
	}

	@Test
	void testSetPricePerPound() {
		Candy c1 = new Candy("Push pop", 0.5, 0.99);
		c1.setPricePerPound(0.79);
		assertEquals(c1.getPricePerPound(), 0.79,0.01);
	}

}//END of CandyTest
