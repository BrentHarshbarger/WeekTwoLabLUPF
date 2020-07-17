
public class FloatEqu {

	public static void main(String[] args) {
		// Lewis University - Programming Fundamentals Lab 2 Exercise 5
		// Brent Harshbarger
		
		//_____________________________________________________________________________________
		// Compare to floats to determine if they are equal
		//_____________________________________________________________________________________
		
		double firstNum = (1.0/10) * (1.0/10);
		double secondNum = (1.0/100);
		double TOLERANCE = 0.000001;
		
		
		// Calculate for equivalency and print result to screen 
		if (Math.abs(firstNum - secondNum) < TOLERANCE); 
		{
			System.out.println("Essentially equal");			
		}  

	}

}
