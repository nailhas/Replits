package replits;

import java.util.Scanner;

public class A6_LongestString_inStringArray {
//Print out the longest string in an array of 5 elements, when the longest string is only one.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i=0; i<5; i++) {
			words[i]=input.nextLine();
		}
		
		int longestWord = 0;
		int elementLength = words[0].length();
		for(int i=1; i<words.length; i++) {
			if(words[i].length() > elementLength) {
				longestWord=i; 
				elementLength=words[i].length();
			}
		}
		System.out.println(words[longestWord]);
	}
}

/* Alternatively can create a method findLongestWord:

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i=0; i<words.length; i++) {
			words[i]=input.nextLine();
		}
		String fln = findLongestWord(words);
		System.out.println(fln);
	}
		
	public static String findLongestWord(String[] words) {
		String longestWord=words[0];
		for(int i=0; i<=4; i++) {
			if(words[i].length()>longestWord.length()) {
				longestWord=words[i];
			}
		}
		return longestWord;
	}	
}
*/
