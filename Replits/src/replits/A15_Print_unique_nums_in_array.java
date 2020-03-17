package replits;

import java.util.Scanner;

public class A15_Print_unique_nums_in_array {
//Write a void method, which prints unique numbers from an int array.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for(int i=0; i<size; i++) {
			nums[i]=scan.nextInt();
		}
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {
		for(int j=0; j<nums.length; j++) {
			int count = 0;
			for(int i=0; i<nums.length; i++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(nums[j]);
			}
		}
	}
}