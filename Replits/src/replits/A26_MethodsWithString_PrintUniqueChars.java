package replits;

import java.util.Scanner;

public class A26_MethodsWithString_PrintUniqueChars {
/*The method should accept any string and return unique characters from the parameter.
	Ex: uniqueChars("java") ==> "jav"
		uniqueChars("mama") ==> "ma"
		uniqueChars("spoon") ==> "spon"     */
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			System.out.println(uniqueChars(str));
		}
		
		public static String uniqueChars(String str) {
			String unique = "";
			for(int i=0; i<str.length(); i++) {
				if(!unique.contains(""+str.charAt(i))) {
					unique+=str.charAt(i);
				}
			}
			return unique;
		}
	}