package replits;

import java.util.Scanner;

public class A14_Print_next_3_consequent_nums {
//Create a method called next3, which takes an int argument and prints the next 3 consequent numbers.
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = inp.nextInt();
		next3(num);
	}
	
	public static void next3(int number) {
		System.out.println((number+1)+" "+(number+2)+" "+(number+3));
	}
}