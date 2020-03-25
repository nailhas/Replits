package replits;

import java.util.Scanner;

public class A27_MethodsWithString_word_count {
/*This method gets a string and returns the word count of that string.
Ex: wordCount("early morning")
	returns 2              */
	
	public static int wordCount(String words) {
		return words.split(" ").length;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String words = scan.nextLine();
		System.out.println(wordCount(words));
	}
}