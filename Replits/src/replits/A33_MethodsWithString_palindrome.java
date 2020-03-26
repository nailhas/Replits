package replits;

import java.util.Scanner;

public class A33_MethodsWithString_palindrome {
/*Palindrome is a word, phrase, or sequence that reads the same backward as forward, 
e.g., madam or nurses run. So method isPalindrome checks that and returns true 
in case of palindrome and false if it is not.
	- make your conditions case insensitive.  ex: Civic and civic are both palindromes
	- make your conditions space insensitive.  
	  Race car is a palindrome even though there is a space in between.

	Ex: isPalindrome("I am not palindrome") ==> false
		isPalindrome("Nurses Run") ==> true    */
		
		public static boolean isPalindrome(String check) {
			
			//Remove spaces in case if the string consists of a few words:
			String checkNoSpaces = check.replace(" ", "");
			
			//Reverse the string:
			String reversed = "";
			for(int i=checkNoSpaces.length()-1; i>=0; i--) {
				reversed+=checkNoSpaces.charAt(i);
			}
			
			//Compare two strings regardless of case sensitivity:
			boolean palindrome=checkNoSpaces.equalsIgnoreCase(reversed);
		
			return palindrome;
		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String check = scan.nextLine();
			System.out.println(isPalindrome(check));
		}
	}