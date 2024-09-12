package studio2;

import java.util.*;
public class Ruin {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Start amount: ");
	int startAmount = scan.nextInt();
	
	System.out.println("Win probability: ");
	double winChance = scan.nextDouble();
	
	System.out.println("Win limit: ");
	int winLimit = scan.nextInt();
	
	System.out.println("Total simulations: ");
	int totalSimulations = scan.nextInt();
	
for (int i = 1; i <= totalSimulations; i++) {
	int numberOfDays = 0;
	int simulations = 0;
	while (startAmount > 0 && startAmount < winLimit)
	{
	
		double chance = Math.random();
		if (winChance >= chance)
		{
			startAmount++;
			
		
		}
		else 
		{
			startAmount--;
			
		}
	numberOfDays++;
	}
	
	if (startAmount == 0 )
	{
	System.out.println("Simulation " + (i) + ": " + numberOfDays + " LOSE");
		
	}
	else if (startAmount == winLimit)
	{
		System.out.println("Simulation " + (i) + ": " + numberOfDays + " WIN");
	}
	
}
	

	}

}
