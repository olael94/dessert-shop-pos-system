 /*File: "CookieTest.java"
  * Author: Aldo Velasquez & Oliver Rivera
  * Course: CS-115-01
  * Instructor: Barbara Chamberlin
  * Date: Feb 2, 2024
  * Description:
  *		*Test methods of Candy Class
  *		*Test Override calculateCost() abstract method used in DessertItem
  *		*Test DessertItem class testCalculateTax() method, making use of local calculateCost() method.
  */

 package DessertShop;

 import static org.junit.jupiter.api.Assertions.*;

 import org.junit.jupiter.api.Test;

 class CookieTest {

     @Test
     void testGetCookieQty() {
         Cookie c1 = new Cookie("Oreos", 3, 3.5);
         assertEquals(3, c1.getCookieQty());
     }

     @Test
     void testGetPricePerDozen() {
         Cookie c1 = new Cookie("Oreos", 3, 3.5);
         assertEquals(3.5, c1.getPricePerDozen());
     }

     @Test
     void testSetCookieQty() {
         Cookie c1 = new Cookie("Oreos", 3, 3.5);
         c1.setCookieQty(5);
         assertEquals(5, c1.getCookieQty());
     }

     @Test
     void testSetPricePerDozen() {
         Cookie c1 = new Cookie("Oreos", 3, 3.5);
         c1.setPricePerDozen(5.5);
         assertEquals(5.5, c1.getPricePerDozen());
     }

     //Added Methods
     @Test
     public void testCalculateCost() {
         Cookie c1 = new Cookie("Oreos", 3, 3.5);
         assertEquals(0.875, c1.calculateCost(), 0.001);
     }

     @Test
     public void testCalculateTax() {
         Cookie c1 = new Cookie("Oreos", 3, 3.5);
         assertEquals(0.0634375, c1.calculateTax(), 0.0000001);
     }

 }//END of CookieTest