 /*File: "DessertItem.java"
  * Author: Aldo Velasquez & Oliver Rivera
  * Course: CS-115-01
  * Instructor: Barbara Chamberlin
  * Date: Feb 2, 2024
  * Description:
  * 		* convert DessertItem Class in abstract class.
  * 		* Add a getter and setter method for new variable taxPercent.
  * 		* Declare abstract method calculateCost() which will be override on all subclasses.
  * 		* Create a new Calculate Tax() Method.
  */

 package DessertShop;

 public abstract class DessertItem {

     // Attributes
     private String name;
     private double taxPercent = 7.25;

     //Default Constructor
     public DessertItem() {
         name = "";
     }

     //Constructor with One Parameter
     public DessertItem(String aName) {
         name = aName;
     }

     //Getter Method for name
     public String getName() {
         return name;
     }

     //Added
     public double getTaxPercent() {
         return taxPercent;
     }

     //Setter method for name
     public void setName(String aName) {
         name = aName;
     }

     //Added
     public void setTaxPercent(double aTaxPercent) {
         taxPercent = aTaxPercent;
     }

     //Abstract method override in all the other classes it will be called.
     public abstract double calculateCost();

     public double calculateTax() {
         return calculateCost() * (taxPercent / 100);
     }

 }//END of DessertItem Class
