
import java.util.Scanner;
import java.util.Random;

public class AgeGuess {

	public static void main(String[] args) {
		// Lewis University - Programming Fundamentals Week 2 Lab/Exercise 1
		// Brent Harshbarger
		//________________________________________________________________________________________
		// AgeGuess is a program that allow the user to guess a number and see if it matches the 
		// number picked by the computer
		//________________________________________________________________________________________		
		
		
		// Define variables 
		
		String name;
		int ageGuess;
		int age;
		
		
		// Generate a random number between 1-100 and assign it to variable age
		
		Random generator = new Random();
		age = 1+generator.nextInt(100);
		
	
		// Get name from user and assign to name variable		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		name = scan.nextLine();
		
		
		// Get age from user and assign to ageGuess variable; then print inputs and random age to the screen
		
		System.out.println("Guess an age between 1 and 100: ");
		ageGuess = scan.nextInt();
		
		if (age != ageGuess) {
			System.out.println("You guessed wrong!");
			if (age > ageGuess)
				System.out.println("older");
				else {
					System.out.println("younger");
				}
		}
		
		System.out.println(name + ", Your age guess is " + ageGuess + " and the correct age is " + age + "."); 
		
		
	}

}
