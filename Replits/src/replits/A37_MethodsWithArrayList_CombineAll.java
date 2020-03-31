package replits;

import java.util.ArrayList;

public class A37_MethodsWithArrayList_CombineAll {
/*Create a static method, which takes two String ArrayLists and returns combined ArrayList. */
		
		public static ArrayList<String> combineAL (ArrayList<String> wordList1, ArrayList<String> wordList2){
			ArrayList<String> combinedList = new ArrayList<String>();
			combinedList.addAll(wordList1);
			combinedList.addAll(wordList2);
			return combinedList;
		}

		public static void main(String[] args) {
			ArrayList<String> wordList1 = new ArrayList<String>();
			wordList1.add("water");
			wordList1.add("salt");
			wordList1.add("sugar");
			
			ArrayList<String> wordList2 = new ArrayList<String>();
			wordList1.add("oil");
			wordList1.add("flour");
			wordList1.add("vanilla");
			
			System.out.println(combineAL(wordList1, wordList2));
		}
	}