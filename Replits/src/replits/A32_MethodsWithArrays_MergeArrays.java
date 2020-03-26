package replits;

import java.util.Arrays;

public class A32_MethodsWithArrays_MergeArrays {
/*The method merges two int arrays into one.
	Ex: mergR([1,2,3],[4,5,6])
		returns [1,2,3,4,5,6]      */
		
		public static int[] mergeArrays(int[] a, int[] b) {
			int length = a.length+b.length;
			int[] mergedArr = new int[length];
			
			for(int i=0; i<a.length; i++) {
				mergedArr[i]=a[i];
			}
			
			int z=a.length;
			for(int i=0; i<b.length; i++) {
				mergedArr[z]=b[i];
				z++;
			}
			
			System.out.println(Arrays.toString(mergedArr));
			return mergedArr;
		}
		
		public static void main(String[] args) {
			int[] a = {1,3,5};
			int[] b = {2,4,6};
			mergeArrays(a,b);
		}
	}