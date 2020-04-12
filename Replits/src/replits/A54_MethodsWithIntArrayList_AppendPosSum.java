package replits;

import java.util.ArrayList;

public class A54_MethodsWithIntArrayList_AppendPosSum {
	/*Create a static method, which returns an ArrayList of Integers, 
	 takes one parameter: an ArrayList of Integers
	 
	This method should: Create a new ArrayList of Integers
	Add only the positive Integers to the new ArrayList
	Sum up the positive Integers in the new ArrayList and add the Sum as the last element.
	Ex: if the incoming ArrayList contains the Integers (4, -6, 3, -8, 0, 4, 3), 
	the ArrayList that gets returned should be (4, 3, 4, 3, 14), 
	with 14 being the sum of (4, 3, 4, 3).  The original ArrayList should remain unchanged.  */
		
		public static void main(String[] args) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(5);
			arr.add(-5);
			arr.add(0);
			arr.add(-10);
			arr.add(101);
			System.out.println(appendPoSum(arr));
		}
		
		public static ArrayList<Integer> appendPoSum(ArrayList<Integer> arr){
			//Create a new Integer ArrayList:
			ArrayList<Integer> noNegHasSum = new ArrayList<Integer>();
			//remove negative numbers and put positive numbers to the newly created ArrayList:
			for(int i=0; i<arr.size(); i++) {
				if(arr.get(i)>=0) {
					noNegHasSum.add(arr.get(i));
				}
			}
			
			//Sum up all positive numbers:
			int sum = 0;
			for(int i=0; i<noNegHasSum.size(); i++) {
				sum+=noNegHasSum.get(i);
			}
			
			//Add the sum value to the end of the ArrayList:
			noNegHasSum.add(sum);
			return noNegHasSum;
		}	
	}