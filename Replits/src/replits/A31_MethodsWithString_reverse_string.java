package replits;

import java.util.Scanner;

public class A31_MethodsWithString_reverse_string {
/*The method gets a string and returns it reversed.
	Ex: reverse("integration") ==> "noitargetni"     */
		
		public static String reverse(String input) {
			String reversedString = "";
			for(int i=input.length()-1; i>=0; i--) {
				reversedString+=input.charAt(i);			
			}
			System.out.println(reversedString);
			return reversedString;
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			reverse(input);
		}
	}