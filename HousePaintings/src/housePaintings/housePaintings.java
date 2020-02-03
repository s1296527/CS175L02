package housePaintings;
import java.util.Scanner;
public class housePaintings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//changes to commit
		//Accept all dimensions
		System.out.println("Enter width of the house: ");
		int houseWidth = scan.nextInt();
		System.out.println("Enter length of the house: ");
		int houseLength = scan.nextInt();
		
		//Perform Computations
		
		//Print the result
		
		System.out.println("Enter height of the house: ");
		int houseHeight = scan.nextInt();
		
		double housePeak = houseLength * houseWidth + (.5 * (houseLength * (houseHeight - houseWidth)));
		int houseNormal = houseLength * houseWidth;
		double houseSqFT = 2 * housePeak + 2 * houseNormal;

		System.out.println("The sqaure footage is: " + houseSqFT);

		System.out.println("Enter length of window: ");
		int windowLength = scan.nextInt(); 
		System.out.println("Enter width of window: ");
		int windowWidth = scan.nextInt ();
		System.out.println("Enter number of windows: ");
		int windowAmount = scan.nextInt ();
		int windowSqFT = windowAmount * (windowLength * windowWidth);
		
		System.out.println("Enter length of door: ");
		int doorLength = scan.nextInt();
		System.out.println("Enter width of door: ");
		int doorWidth = scan.nextInt ();
		System.out.println("Enter number of doors: ");
		int doorAmount = scan.nextInt ();
		int doorSqFT = doorAmount * (doorLength * doorWidth);

		double houseSqFTTotal = houseSqFT - (windowSqFT + doorSqFT);
		
		System.out.println("The square footage of the house is: " + houseSqFTTotal);
		
		System.out.println("Enter cost to paint per square foot: ");
		double costPerSqFT = scan.nextInt();
		double costToPaint =  costPerSqFT * houseSqFTTotal;
		
		System.out.println("The total for price for the paint job is: " + costToPaint);
		
		
		
		
		
	}

}
