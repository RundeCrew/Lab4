import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//ask for a number
		char answer = 'y';
		
		System.out.println("Learn your squared and cubes!\n"); // Title of Table
		
		do {
			
			System.out.println("Please enter an integer: "); //ask for user to input a number
			int userNum = scnr.nextInt();
			
			System.out.println("Number\t" + "Squared\t" + "Cubed"); // output of Column names
			System.out.println("=======\t=======\t======="); //output of underlines for column names
			// loop for the number entered.
		
			for (int i = 1 ; i <= userNum ; ++i) {      //loop as many as number entered 
				System.out.println(i + " \t" + ( (int) Math.pow(i, 2)) + " \t" + ((int) Math.pow(i,  3))); // mathpow, but mayber there's a library??
			}
			
			System.out.print("\nContinue? (y/n)"); //conditional
			answer = scnr.next().charAt(0);
			
		} while (answer == 'y'); //while loop
		
		
	}
}
		
		
		
		//loop for adding the squared
		// add the cubed
		
			
		
		
		

