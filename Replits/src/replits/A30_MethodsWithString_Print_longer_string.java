package replits;

import java.util.Scanner;

public class A30_MethodsWithString_Print_longer_string {
/*The method gets two strings and returns the longest one.
Ex: biggerS("apple","orange") ==> "orange"      */
		
		public static String biggerS(String a, String b) {
			String longerString="";
			if(a.length()>b.length()) {
				longerString=a;
			}else if(a.length()<b.length()) {
				longerString=b;
			}
			return longerString;
		}

		public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			String a = scan.nextLine();
			String b = scan.nextLine();
			System.out.println(biggerS(a,b));
		}
	}