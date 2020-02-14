package carsDecision;

import java.util.Scanner;

public class carV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the cost of the Toyota Corolla : ");
		double toyC = in.nextDouble(); 
		System.out.println("Enter the miles per gallon of the Toyota Corolla : ");
		double mpgToyC = in.nextDouble();
		System.out.println("Enter the cost of the Toyota Prius : ");
		double toyP = in.nextDouble();
		System.out.println("Enter the miles per gallon of the Toyota Prius : ");
		double mpgToyP = in.nextDouble();
		System.out.println("Enter the cost of gas : ");
		double gasCost = in.nextDouble();
		System.out.println("Enter the number of miles traveled in one year : ");
		double milesTraveled = in.nextDouble();
		double toyPCost = toyP + (milesTraveled/mpgToyP) * (gasCost); 
		double carCost = toyC + (milesTraveled/mpgToyP) * (gasCost); 
		int year = 1;
		 
	for (int a=0; a<5; a++)
	{	
		if (toyPCost < carCost) {
			System.out.println("The cost after " + year + ( " years is Toyota Corolla:" + carCost + (". Toyota Prius" + toyPCost)));
			System.out.println("The car pays back after " + year + " years");
		}
		else 
		{
			System.out.println("The cost after " + year + (" years is Toyota Corolla:" + carCost + (". Toyota Prius: " + toyPCost)));
			System.out.println("The Toyota Prius pays back after " + year + " years");
		}
	
	}	
		
		
	}


}
