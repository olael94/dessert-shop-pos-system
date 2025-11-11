 /*File: "DessertItemTest.java"
  * Author: Aldo Velasquez & Oliver Rivera
  * Course: CS-115-01
  * Instructor: Barbara Chamberlin
  * Date: Feb 2, 2024
  * Description:
  * 		* Add GetTaxPercent() and SettaxPercent() to test recently created method taxPercent() on DessertItem Class.
  */

 package DessertShop;

 import static org.junit.jupiter.api.Assertions.*;

 import org.junit.jupiter.api.Test;

 class DessertItemTest {

     @Test
     void testGetName() {
         Candy d1 = new Candy("Test Dessert", 0.5, 0.99);
         assertEquals("Test Dessert", d1.getName());
     }

     @Test
     void testSetName() {
         Candy d1 = new Candy("Test Dessert", 0.5, 0.99);
         d1.setName("Updated Dessert");
         assertEquals("Updated Dessert", d1.getName());
     }

     //Added Methods
     @Test
     void testGetTaxPercent() {
         Candy d1 = new Candy("Test Dessert", 0.5, 0.99);
         assertEquals(7.25, d1.getTaxPercent(), 0.01);
     }

     @Test
     void testSetTaxPercent() {
         Candy d1 = new Candy("Test Dessert", 0.5, 0.99);
         d1.setTaxPercent(8.25);
         assertEquals(8.25, d1.getTaxPercent(), 0.01);
     }

 }//END of DessertItemTest
