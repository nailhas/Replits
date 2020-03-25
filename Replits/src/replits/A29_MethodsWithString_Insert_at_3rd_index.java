package replits;

import java.util.Scanner;

public class A29_MethodsWithString_Insert_at_3rd_index {
/*The method gets two strings and returns a string.
 Insert the second string at the 3rd index of the first string.
	Ex: at3("skybuilding is high","scraper")
		return: "skyscraperbuilding is high"    */
		
		public static String at3(String target, String word) {
			String finalString=target.substring(0, 3)+word+target.substring(3, target.length());
			return finalString;
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String target = scan.nextLine();
			String word = scan.nextLine();
			System.out.println(at3(target, word));
		}
	}