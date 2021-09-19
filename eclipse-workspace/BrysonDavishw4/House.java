/** Program header:  House.java
 *
 * Author:    Bryson Davis
 * Class:     CS-2163 Java
 *
 * Brief Program Description:
 *   This sample class illustrates the correct coding sequence you need to follow 
 *     when you code OOP class, and when you draw UML class diagrams.
 *   Note: the list of sequence in this file applies to all OOP classes, except the
 *     application class that has the main method.
 */

public class House 
{
	private double totalHousePrice;

	private double totalSqFt;

	public House()
	{
		totalHousePrice = 0.0;

		totalSqFt = 0.0;
	}

	public House(double totPrice, double totalSqFeet)
	{
		totalHousePrice = totPrice;

		totalSqFt = totalSqFeet;
	}

	public double getTotalPrice()
	{
		return totalHousePrice;
	}

	public double getTotalSquareFeet()
	{
		return totalSqFt;
	}

	public void setTotalPrice(double totPrice)
	{
		totalHousePrice = totPrice;
	}

	public void setTotalSquareFeet(double totSqFeet)
	{
		totalSqFt = totSqFeet;
	}

	public double calcPricePerSqf()
	{
		return totalHousePrice / totalSqFt;
	}

	public double calcPropertyTax(double taxPercentage)
	{
		return (totalHousePrice * taxPercentage * 0.01);
	}
}
	
