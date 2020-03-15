package replits;

import java.util.Scanner;

public class A05_Print_nonDuplicated_numbers {
	//Print non-duplicated numbers of an array of 5 elements.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
		
		for(int i=0; i<nums.length; i++) {
			int howManyTimesOccured = 0;
			for(int j=0; j<nums.length; j++) {
				if(nums[i]==nums[j]) {
					howManyTimesOccured++;
				}
			}
			if(howManyTimesOccured==1) {
				System.out.println(nums[i]);
			}
		}
	}
}