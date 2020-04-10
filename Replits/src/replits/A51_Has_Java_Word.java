package replits;

import java.util.Scanner;

public class A51_Has_Java_Word {
/*Given a string word, print true if "java" appears starting 
at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx".
The string may be any length, including 0word = .  
Ex.: input: cjavac++
	 output: true

	input: c#javaruby
	output: false             */

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String word = scan.next();
			boolean exists = false;
			
				if(word.startsWith("java") || (word.indexOf("java")==1)) {
					exists = true;				
				}
				System.out.println(exists);
			}		
		}