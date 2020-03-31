package replits;

import java.util.Scanner;

public class A39_MethodsWithString_FindErrorString {
/*The method checks if the string it gets has the word error at the beginning of it.
It gets a string and returns a boolean.
	Ex: "error foo bar"--> true
		"three four error"--> false    */
		
		public static boolean isError(String line) {
			if(line.startsWith("error")) {
				return true;
			}
			return false;
		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String line = scan.nextLine();
			System.out.println(isError(line));
		}
	}