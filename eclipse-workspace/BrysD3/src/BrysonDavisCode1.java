import java.util.Scanner;

public class BrysonDavisCode1	 {
	
	public static void main(String args[]) {
		
		double air1, air2, air3;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the amount of the first Airline's ticket price: ");
		air1 = in.nextDouble();
		System.out.println("Enter the amount of the second Airline's ticket price: ");
		air2 = in.nextDouble();
		System.out.println("Enter the amount of the third Airline's ticket price: ");
		air3 = in.nextDouble();
		
		double total = getTotal(air1, air2, air3);
		
		System.out.printf("The average amount of all three tickets are: %f", total);
	}
	public static double getTotal(double air1, double air2, double air3) {
		double total = (air1 + air2 + air3) / 3;
		return total;
	}
}
