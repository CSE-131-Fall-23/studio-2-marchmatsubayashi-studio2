package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
	//Variables
		System.out.println("What is your starting amount?: ");
		int startAmount = in.nextInt();
		System.out.println("What is your win chance? (Please enter percentage): ");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?: ");
		int winLimit = in.nextInt();
		System.out.println("How many total simulation days would you like to run?: ");
		int totalSimulations = in.nextInt();
		int dayNumber = 1;
		int currentAmount = startAmount;
		
		for (int i = 0; i < totalSimulations; i++){
			currentAmount = startAmount;
			int playCounter = 0;
			System.out.println("Simulation Day: " + dayNumber);
			dayNumber++;
			while ((0 < currentAmount)&&(currentAmount < winLimit)) { //one day
				double x = Math.random();
				x = x * 100;
			
				if (x > winChance) {
					currentAmount--;				
				}//if close
				else {
					currentAmount++;				
				}//else close
				playCounter++;
			
			}//while close
			System.out.println("Number of plays today: " + playCounter);
			if (currentAmount == 0) {
				System.out.println("Ruin");
			}
			if (currentAmount == winLimit) {
				System.out.println("Success");
			}
			
		}//end for loop
		

	}

}