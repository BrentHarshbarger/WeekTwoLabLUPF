import java.util.Random;
import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
		// Lewis University - Programming Fundamentals Week 2 Lab/Exercise 3
		// Brent Harshbarger
		//________________________________________________________________________________________
		// UserNames is a program takes a users first name and last name as input. 
		// The output is the first four letters of the last name, the first letter of the first
		// name and a random number at the end between 10 and 99.
		//________________________________________________________________________________________
		
		// Define variables 
		
		String firstName;
		String lastName;
		String firstLetter;
		String lastFour;		
		int randomNum;
	
		
		// Generate a random number between 10-99 and assign it to variable randomNum.
		
		Random gen = new Random();
		randomNum = 10+gen.nextInt(99-10);
		
			
		// Get get first and last name from user and assign to firstName and lastName variables.		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your first name? ");
		firstName = scan.nextLine();
		
		System.out.println("What is your last name? ");
		lastName = scan.nextLine();
		
		
		// Get the first name and convert it to the first letter and assign it to firstLetter variable.
		
		firstLetter = firstName.substring(0,1);
		
		
		// Get the last name and convert it to the first four letters and assign it to lastFour variable
		
		lastFour = lastName.substring(0,4);
		
		
		// Print to screen lastFour then firstLetter and finally the randomNum.
		
		System.out.println(lastFour + firstLetter + randomNum);
		
		
	}

}
