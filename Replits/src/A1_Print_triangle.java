import java.util.Scanner;

public class A1_Print_triangle {
//Print a triangle of asterisks of size n using nested loop
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();

		// loop to iterate for the given number of rows 
		for(int i=1; i<=n; i++) {
			// loop to print the number of stars in each row
			for(int j=1; j<=i; j++) {
			System.out.print("*");	
			}
			// for new line after printing each row
			System.out.println();
		}
	}
}