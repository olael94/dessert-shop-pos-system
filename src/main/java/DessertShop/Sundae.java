/*File: "Sundae.java"
 * Author: Aldo Velasquez & Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Jan 26, 2024
 * Description:Create class attributes, constructors and methods of Sundae Class
 */

package DessertShop;

public class Sundae extends IceCream{

	//Attributes
	private String toppingName;
	private double toppingPrice;

	//Default Constructor
	public Sundae() {
		super();
		toppingName = "";
		toppingPrice = 0.0;
	}

	//Parameter Constructor
	public Sundae(String aName, int aScoopCount, double aPricePerScoop, String aToppingName, double aToppingPrice) {
		super(aName, aScoopCount, aPricePerScoop);
		toppingName = aToppingName;
		toppingPrice = aToppingPrice;
	}

	//Getter Methods
	public String getToppingName() {
		return toppingName;
	}

	public double getToppingPrice() {
		return toppingPrice;
	}

	//Setter Methods
	public void setToppingName(String aToppingName) {
		toppingName = aToppingName;
	}

	public void setToppingPrice(double aToppingPrice) {
		toppingPrice = aToppingPrice;
	}

}//END of Sundae Class child to IceCream Class
