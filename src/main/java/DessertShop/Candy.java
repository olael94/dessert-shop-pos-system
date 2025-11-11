 /*File: "Candy.java"
  * Author: Aldo Velasquez & Oliver Rivera
  * Course: CS-115-01
  * Instructor: Barbara Chamberlin
  * Date: Feb 2, 2024
  * Description: Override calculateCost() abstract method used in DessertItem
  */

 package DessertShop;

 public class Candy extends DessertItem {

     //Attributes
     private double candyWeight;
     private double pricePerPound;

     //Default Constructor
     public Candy() {
         super();
         candyWeight = 0.0;
         pricePerPound = 0.0;
     }

     //Constructor with One Parameter
     public Candy(String aName, double aCandyWeight, double aPricePerPound) {
         super(aName);
         candyWeight = aCandyWeight;
         pricePerPound = aPricePerPound;
     }

     //Getter Methods
     public double getCandyWeight() {
         return candyWeight;
     }

     public double getPricePerPound() {
         return pricePerPound;
     }

     //Setter Methods
     public void setCandyWeight(double aCandyWeight) {
         candyWeight = aCandyWeight;
     }

     public void setPricePerPound(double aPricePerPound) {
         pricePerPound = aPricePerPound;
     }

     //calculateCost() Override
     public double calculateCost() {
         return candyWeight * pricePerPound;
     }

 }//END of child Class Candy
