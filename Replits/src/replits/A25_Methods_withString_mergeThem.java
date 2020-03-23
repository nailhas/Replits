package replits;

import java.util.Scanner;

public class A25_Methods_withString_mergeThem {
/*When gears merge and work together, one teeth from each one goes in order.
Write a method, which returns the two strings merged, one letter at a time, starting with one.   
	Please note strings can be of a different length.
	Ex: mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
		mergeStrings("java", "selenium") ==> "jsaevlaenium"  */
		
		public static String mergeStrings(String one, String two) {
			String combinedString="";
			int lengthMax=Math.max(one.length(), two.length());
			
			for(int i=0; i<lengthMax; i++){
				if(i<one.length()) {
				combinedString+=one.substring(i,i+1);
				}
				if(i<two.length()) {
				combinedString+=two.substring(i,i+1);
				}
			}
			System.out.println(combinedString);
			return combinedString;		
		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String one = scan.nextLine();
			String two = scan.nextLine();
			mergeStrings(one, two);		
		}
}