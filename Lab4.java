import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//ask for a number
		char answer = 'y';
		
		System.out.println("Learn your squared and cubes!\n");
		
		do {
			
			System.out.println("Please enter an integer: ");
			int userNum = scnr.nextInt();
			
			System.out.println("Number\t" + "Squared\t" + "Cubed");
			System.out.println("=======\t=======\t=======");
			// loop for the number entered.
		
			for (int i = 1 ; i <= userNum ; ++i) {      
				System.out.println(i + " \t" + ( (int) Math.pow(i, 2)) + " \t" + ((int) Math.pow(i,  3)));
			}
			
			System.out.print("\nContinue? (y/n)");
			answer = scnr.next().charAt(0);
			
		} while (answer == 'y');
		
		
	}
}
		
		
		
		//loop for adding the squared
		// add the cubed
		
			
		
		
		

