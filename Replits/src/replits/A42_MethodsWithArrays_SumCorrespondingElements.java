package replits;

import java.util.Arrays;

public class A42_MethodsWithArrays_SumCorrespondingElements {
/*Method accepts 2 int arrays and sums each corresponding element's value of two arrays. 
It returns a new array. Assume that each array has 5 elements.

Ex: addElements(new int[][10, 40, 50, 3, 1],
	            new int[][11, 0, 500, 44, 1101]);
	            
	return: [21, 40, 550, 47, 1102]         */

		public static int[] addElements(int[] ints1, int[] ints2) {
			int[] summedUp = new int[5];
			for(int i=0; i<+5; i++) {
				summedUp[i]=ints1[i]+ints2[i];			
			}
			System.out.println(Arrays.toString(summedUp));
			return summedUp;
		}
		
		public static void main(String[] args) {
			int[] ints1 = {1,2,3,4,5};
			int[] ints2 = {6,7,8,9,10};
			addElements(ints1, ints2);
		}
	}