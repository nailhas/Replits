package replits;

import java.util.Arrays;

public class A59_Arrays_UniqueIntegersSumUpToZero {
/*Write a method, which takes an int >1 but <100, returns any array, 
which contains only unique ints that sum up to 0. 
For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5]. 
The answer [1, -1, 1, 3] is incorrect because 1 occurs twice.   */

	public static void main(String[] args) {
		int n = 6;
		System.out.println(Arrays.toString(uniqueIntToZero(n)));
	}
	
	public static int[] uniqueIntToZero(int n) {
		int[] sumToZero = new int[n];
		int sum =0;
		for(int i=0; i<n-1; i++) {
			sumToZero[i]=i;
			sum+=i;
		}
		
		sumToZero[n-1]=-sum;
		return sumToZero;
	}
}