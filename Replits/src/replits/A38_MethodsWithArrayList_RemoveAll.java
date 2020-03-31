package replits;

import java.util.ArrayList;
import java.util.Arrays;

public class A38_MethodsWithArrayList_RemoveAll {
/*Create a static method, which returns nothing,
takes two parameters: String ArrayList and a String.
Remove each instance of String from the ArrayList. */
	
		public static void removeAll(ArrayList<String> wordList, String targetWord) {
			wordList.removeAll(Arrays.asList(targetWord));
			System.out.println(wordList);//[Sun, Moon, Venus, Mercury]

		}

		public static void main(String[] args) {
			ArrayList<String> wordList = 
					new ArrayList<String>(Arrays.asList("Saturn", "Sun", "Moon", "Venus", "Mercury", "Saturn"));
			String targetWord = "Saturn";
			removeAll(wordList, targetWord);
		}
	}