package replits;

import java.util.Scanner;

public class A34_MethodsWithString_extract_nums {
/*The method removes all non numeric elements from a string, and returns a string of numbers.
	extractNum("aa!!%$#.10aa") ==> 10  */
		
		public static String extractNums(String s) {
			String numsOnly = "";
			for(int i=0; i<s.length(); i++) {
				if(Character.isDigit(s.charAt(i))) {
					numsOnly+=s.charAt(i);
				}
			}
			return numsOnly;
		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
			System.out.println(extractNums(s));
		}
	}