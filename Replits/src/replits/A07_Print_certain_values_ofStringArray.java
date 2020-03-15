package replits;

import java.util.Arrays;

public class A07_Print_certain_values_ofStringArray {
	/*Given a String array arr with the following elements:
	["zero", "one", "two","three","four"]
	Create another array and copy in it the words, which contain letter "e" in them.
	Example: arr -> ["aa", "be", "lol", "lel", "oreo"] 
	Output: ["be",  "lel", "oreo"]               */

		public static void main(String[] args) {
			String[] numbers = {"zero", "one", "two", "three", "four"};
			System.out.println(Arrays.toString(getWithE(numbers)));
			//[zero, one, three]
		}
		
		public static String[] getWithE(String[] arr) {
			int wordsCount=0;
				for(int i=0; i<arr.length; i++) {
					if(arr[i].contains("e")) {
						wordsCount++;
					}
				}
				
			String[] valuesContainE= new String[wordsCount];
			int a = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i].contains("e")) {
					valuesContainE[a++]=arr[i];
				}
			}		
			return valuesContainE;
		}
}
