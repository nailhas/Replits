package replits;

import java.util.Scanner;

public class A20_Cats_Dogs {
/*Print true if the string "cat" and "dog" appears 
the same number of times in the given string.   */

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		int countOfDogs = 0;
		int countOfCats = 0;
		String word = scan.next();
			
			for(int i=0; i<word.length()-2; i++) {
				if(word.substring(i, i+3).equals("dog")) {
					countOfDogs++;
				}
				if(word.substring(i, i+3).equals("cat")) {
					countOfCats++;
				}
			}
			
				if(countOfDogs==countOfCats) {
					System.out.println(true);
				}else {
					System.out.println(false);
				}					
			}	
}