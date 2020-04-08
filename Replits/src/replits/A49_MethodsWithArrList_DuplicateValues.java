package replits;

import java.util.ArrayList;

public class A49_MethodsWithArrList_DuplicateValues {
/*Create a method, which takes a single parameter of Integer ArrayList, 
returns a new Integer ArrayList. This method should create a new Integer ArrayList, 
which contains each value of the ArrayList parameter repeated twice.
Ex: (1,5,3,7)--> returns (1,1,5,5,3,3,7,7)       */
	
		public static void main(String[] args) {
			ArrayList<Integer> once = new ArrayList<Integer>();
			once.add(20);
			once.add(30);
			once.add(40);
			twoTimes(once);
		}
		
		public static ArrayList<Integer> twoTimes(ArrayList<Integer> once){
			ArrayList<Integer> twice = new ArrayList<Integer>();
			for(int i=0; i<once.size(); i++) {
				 once.add(i+1, once.get(i));
				 i++;
				}
				twice.addAll(once);
			System.out.println(twice);//[20, 20, 30, 30, 40, 40]
			return twice;
		}
	}