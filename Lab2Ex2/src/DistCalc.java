public class DistCalc {

	public static void main(String[] args) {
		// Lewis University - Programming Fundamentals Week2 Exercise 2
		// Brent Harshbarger
		//_________________________________________________________________________________________________________
		//
		// This program will calculate the distance for two points
		//
		//_________________________________________________________________________________________________________
		
		// Coordinates for the first point
		
		int x1 = 2;
		int y1 = 4;		
		
		
		// Coordinates for the second point
		
		int x2 = 6;
		int y2 = 8;
		
		
		// Distance formula
		
		double dist = Math.sqrt(((x2 - x1)^2) + ((y2 - y1)^2));
		
		//Print out answer with only three decimal places to the screen
		
		System.out.printf("Distance = %.3f", dist);
		
	}

}
