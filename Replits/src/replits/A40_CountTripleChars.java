package replits;

import java.util.Scanner;

public class A40_CountTripleChars {
/* A "triple" in a string is a char appearing three times in a row. 
Print out the number of any triples in the given string. The triples may overlap.
	Ex: input: abcXXXabc
	output: 1

	input: xxxabyyyycd
	output: 3         */

		public static void main (String[]args) {
			Scanner scan = new Scanner(System.in);
			String str = scan.next();
			int count = 0;
			
			for(int i=0; i<str.length()-2; i++) {
				if(str.charAt(i)==str.charAt(i+1)) {
					if(str.charAt(i)==str.charAt(i+2)) {
					count++;				
				}
				}			
			}
			System.out.println(count);
		}
	}