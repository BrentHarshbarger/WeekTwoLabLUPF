import java.util.Scanner;
public class NumDisplay {

	public static void main(String[] args) {
		// Lewis University - Programming Fundamentals Lab2 Exercise 6
		// Brent Harshbarger
		
		//___________________________________________________________________________
		// This program will ask for a user to pick a number between 0 and 9.
		// The output will be the string text name of the number selected.
		//___________________________________________________________________________
		
		int numberChoice;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please pick a number between 0 and 9: ");
		numberChoice = scan.nextInt();
		
		switch (numberChoice) {
		
		case 0:
			System.out.println("Zero");
			break;
		
		case 1:
			System.out.println("One");
			break;
			
		case 2:
			System.out.println("Two");
			break;
			
		case 3:
			System.out.println("Three");
			break;
			
		case 4:
			System.out.println("Four");
			break;
			
		case 5:
			System.out.println("Five");
			break;
			
		case 6:
			System.out.println("Six");
			break;
			
		case 7:
			System.out.println("Seven");
			break;
		
		case 8:
			System.out.println("Eight");
			break;
		
		case 9:
			System.out.println("Nine");
			break;
		
		}
		
		
		
		
	}

}
