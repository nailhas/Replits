package replits;

import java.util.Scanner;

public class A28_MethodsWithString_Limit_string {
/*This method gets a string and an int, and returns a string.
It limits the inputed string to a given number of characters.
	Ex: limit("abcd",2)
		returns "ab"     */
		
		public static String limit(String text, int maxLength) {
			String finalString = text.substring(0,maxLength);
			return finalString;
		}
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String text = input.nextLine();
			int maxLength = input.nextInt();
			System.out.println(limit(text, maxLength));
		}
	}