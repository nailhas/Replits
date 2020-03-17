package replits;

import java.util.Scanner;

public class A16_Print_unique_words_in_StringArray {
/*Create a void method, which prints only unique words from a String array. 
 Every unique word should be printed on the new line.    */
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			String[] words = new String[size];
			for(int i=0; i<size; i++) {
				words[i]=scan.next();
			}
			printUniqueWords(words);
		}

		public static void printUniqueWords(String[] words) {
			for(int j=0; j<words.length; j++) {
				int count = 0;
				for(int i=0; i<words.length; i++) {
					if(words[i].equals(words[j])) {
						count++;
					}
				}
				if(count==1) {
					System.out.println(words[j]);
				}
			}
		}
}