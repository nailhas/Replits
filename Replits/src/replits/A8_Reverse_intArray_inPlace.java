package replits;

import java.util.Arrays;
import java.util.Scanner;

public class A8_Reverse_intArray_inPlace {
	//Reverse an array without using additional arrays or Strings.

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

		 int middle=nums.length/2;
		 for(int i=0, j=nums.length-1; i<middle; i++, j--) {
			 if(i<nums.length/2) {
				 int temp = nums[i];
				 nums[i] = nums[j];
				 nums[j] = temp; 
			 }
		 }
		 System.out.println(Arrays.toString(nums));		    
			}
}
