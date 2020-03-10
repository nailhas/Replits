package replits;

import java.util.Scanner;

public class A2_Print_pyramid {
	
	//Print a pyramid of asterisks of n size using nested loop
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int n =input.nextInt();

			// Outer loop to iterate for the given number of rows 
			for(int i=0; i<n; i++) {
				
	            // Inner loop to print the number of spaces before the stars 
	            for (int j=n-i; j>1; j--) { 
	                System.out.print(" "); 
	            } 
				// Inner loop to print the number of columns
				for(int j=0; j<=i; j++) {
					//print stars with the space after each
					System.out.print("* ");	
				}
				// for new line after printing each row
				System.out.println();
				
				/*Output for input 5:
						    * 
						   * * 
						  * * * 
						 * * * * 
						* * * * *         */
			}
		}
}
