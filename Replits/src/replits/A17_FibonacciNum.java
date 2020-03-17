package replits;

import java.util.Scanner;

public class A17_FibonacciNum {
/*Write a method, which computes Fibonacci numbers
	In fibonacci series, next number is the sum of previous two numbers.
	Ex: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144... 
	The first two numbers of fibonacci series are 0 and 1.
	Given a number num, print n-th Fibonacci Number.
num =	0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	...
fn =    0	1	1	2	3	5	8	13	21	34	55	89	144	233	377	...

	Input  : 2
	Output : 1

	Input  : 9
	Output : 34     */
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			fib(num);
		}
		
		public static void fib(int num) {
			int[] fn = new int[num+2];
			fn[0]=0;
			fn[1]=1;
			for(int i=2; i<=num; i++) {
				fn[i]=fn[i-1]+fn[i-2];
			}
			System.out.println(fn[num]);
		}
}