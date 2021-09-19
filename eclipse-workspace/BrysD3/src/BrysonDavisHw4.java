/** Program header:  BrysonDavisHw4.java
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
import java.util.Scanner;

public class BrysonDavisHw4 
{
	
	public static void main(String[] args)
	{

		System.out.println("Java, Online, Bryson Davis, hw4");

		House h1 = new House(295000.0, 3395.0);

		House h2 = new House(189000.0, 1675.0);

		Scanner sc = new Scanner(System.in);

		System.out.print("\n Enter total price: ");

		double totPrice = sc.nextDouble();

		System.out.print("\n Enter total square feet: ");

		double totSqFeet= sc.nextDouble();

		House h3 = new House();

		h3.setTotalPrice(totPrice);

		h3.setTotalSquareFeet(totSqFeet);

		System.out.print("\n Enter tax percentage: ");

		double taxPer = sc.nextDouble();

		double res1 = h1.calcPricePerSqf();

		double res2 = h2.calcPricePerSqf();

		double res3 = h3.calcPricePerSqf();

		double res4 = h1.calcPropertyTax(taxPer);

		double res5 = h2.calcPropertyTax(taxPer);

		double res6 = h3.calcPropertyTax(taxPer);

		System.out.printf("\n Total square feet = %8.1f", h1.getTotalSquareFeet());

		System.out.printf("\n Total price = %8.2f", h1.getTotalPrice());

		System.out.printf("\n Average price per square feet = %8.2f", res1);

		System.out.printf("\n Property tax = %8.2f", res4);

		System.out.printf("\n Total square feet = %8.1f", h2.getTotalSquareFeet());

		System.out.printf("\n Total price = %8.2f", h2.getTotalPrice());

		System.out.printf("\n Average price per square feet = %8.2f", res2);

		System.out.printf("\n Property tax = %8.2f", res5);

		System.out.printf("\n Total square feet = %8.1f", h3.getTotalSquareFeet());

		System.out.printf("\n Total price = %8.2f", h3.getTotalPrice());

		System.out.printf("\n Average price per square feet = %8.2f", res3);

		System.out.printf("\n Property tax = %8.2f", res6);
	}
}
