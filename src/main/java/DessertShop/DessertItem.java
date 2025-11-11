 /*File: "DessertItem.java"
 * Author: Aldo Velasquez & Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Jan 26, 2024
 * Description:Create class attributes, constructors, and methods of the Parent Class
  */

package DessertShop;

public class DessertItem {

	// Attributes
	private String name;

	//Default Constructor
	public DessertItem() {
		name = "";
	}
	
	//Constructor with One Parameter
	public DessertItem(String aName) {
		name = aName;
	}

	//Getter Method for name
	public String getName(){
		return name;
	}	

	//Setter method for name
	public void setName(String aName) {
		name= aName;
	}

}//END of DessertItem Class
