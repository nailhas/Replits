package replits;

import java.util.Arrays;

public class A50_MethodsWithString_Anagram {
/*Anagram is a word, phrase, or name formed by rearranging the letters of another, 
such as cinema, formed from iceman.
isAnagram is the method, which checks if word1 and word2 are anagram to each other,
and returns a boolean. Each letter in word1 should appear in word2 exact number of times. 
Make strings case insensitive.
	Ex: isAnagram("listen", "Silent") ==> true
	isAnagram("earth", "heart") ==> true
	isAnagram("hi", "bye") ==> false       */

		public static void main(String[] args) {
			System.out.println(isAnagram("listen", "Silent"));//true
		}
		
		public static boolean isAnagram(String word1, String word2) {
			char[] chArr1 = word1.toLowerCase().toCharArray();
		    char[] chArr2 = word2.toLowerCase().toCharArray();
		    Arrays.sort(chArr1);
		    Arrays.sort(chArr2);
			String newWord1=Arrays.toString(chArr1);
			String newWord2=Arrays.toString(chArr2);
			
			return newWord1.contentEquals(newWord2) ? true:false;
		}
	}