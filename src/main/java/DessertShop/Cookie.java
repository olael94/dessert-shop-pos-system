/*File: "Cookie.java"
 * Author: Aldo Velasquez & Oliver Rivera
 * Course: CS-115-01
 * Instructor: Barbara Chamberlin 
 * Date: Jan 26, 2024
 * Description:Create class attributes, constructors and methods of child Cookie Class
 */

package DessertShop;

public class Cookie extends DessertItem {

	//Attributes
	private int cookieQty;
	private double pricePerDozen;

	//Default Constructor
	public Cookie() {
		super();
		cookieQty = 0;
		pricePerDozen = 0.0;
	}

	//Constructor with Three Parameters
	public  Cookie(String aName, int aCookieQty, double aPricePerDozen) {
		super(aName);
		cookieQty = aCookieQty;
		pricePerDozen = aPricePerDozen;
	}

	//Getter Methods
	public int getCookieQty() {
		return cookieQty;
	}

	public double getPricePerDozen() {
		return pricePerDozen;
	}

	//Setter Methods
	public void setCookieQty(int aCookieQty) {
		cookieQty = aCookieQty;
	}

	public void setPricePerDozen(double apricePerDozen) {
		pricePerDozen = apricePerDozen;
	}

}// End of child Cookie Class to DessertItem Parent
