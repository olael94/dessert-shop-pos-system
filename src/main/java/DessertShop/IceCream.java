/*File: "IceCream.java"
 * Author: Aldo Velasquez & Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Jan 26, 2024
 * Description:Create class attributes, constructors and methods of Ice Cream Class
 */

package DessertShop;

public class IceCream extends DessertItem {

	//Attributes
	private int scoopCount;
	private double pricePerScoop;

	//Default Constructor
	public IceCream() {
		super();
		scoopCount = 0;
		pricePerScoop = 0.0;
	}

	//Constructor with Three Parameters
	public  IceCream(String aName, int aScoopCount, double aPricePerScoop) {
		super(aName);
		scoopCount = aScoopCount;
		pricePerScoop = aPricePerScoop;
	}

	//Getter Methods
	public int getScoopCount() {
		return scoopCount;
	}

	public double getPricePerScoop() {
		return pricePerScoop;
	}

	//Setter Methods
	public void setScoopCount(int aScoopCount) {
		scoopCount = aScoopCount;
	}

	public void setPricePerScoop(double aPricePerScoop) {
		pricePerScoop = aPricePerScoop;
	}

}//End of Ice Cream Class child to DessertItem Class
