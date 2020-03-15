package replits;

import java.util.Arrays;
import java.util.Scanner;

public class A11_ZombieAttack2 {
	/*An array inhabitants represents cities and their respective populations. 
	For example, the following arrays shows 8 cities and their respective populations:
	[3, 6, 0, 4, 3, 2, 7, 0]
	Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
	Every day, any city, which is adjacent to a zero-populated zombie-ridden city, loses half of its population.
	Write a program to loop though each city population and make it lose half of it 
	if it is adjacent(right or left) to a city with zero people until all cities have no humans left.
	Make updates for each element in the array and print the array as below for every day:
	Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
	Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
	Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
	Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
	Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
	Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
	---- EXTINCT ----                    */
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int[] inhabitants = new int[8];
			for(int i=0; i<inhabitants.length; i++) {
				inhabitants[i]=input.nextInt();
			}
			
			int cnt = 0, sum=0;
			System.out.println("Day "+cnt+" "+Arrays.toString(inhabitants));
			
			do {
				for(int i=0; i<inhabitants.length; i++) {
					if(i<inhabitants.length-1) {
						if(inhabitants[i]!=0 && inhabitants[i+1]==0) {
							inhabitants[i]/=2;
						}
						if(inhabitants[i]==0 && inhabitants[i+1]!=0) {
							inhabitants[i+1]/=2;
							i+=1;
						}
					}
				}
				sum =0;
				for(int n : inhabitants) {
					sum+=n;
				}
				cnt++;				
				System.out.println("Day " + cnt + " " + Arrays.toString(inhabitants));
			}while(sum>0);
			System.out.println("---- EXTINCT ----");
			}	
}