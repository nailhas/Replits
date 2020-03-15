package replits;

import java.util.Scanner;

public class A13_sign_nums {
	/*Write a function, which defines int number as positive, negative or zero.
	Ex: sign(5)  => 1
		sign(-30)=> -1
		sign(0)  => 0
	Print out 1,-1 or 0 depending on the input       */
		public static void sign(int n) {
			if(n<0) {
				System.out.println("-1");
			}else if(n==0) {
				System.out.println("0");
			}else {
				System.out.println("1");
			}
		}
		
		public static void main(String[] args) {
			Scanner inp = new Scanner(System.in);
			int n = inp.nextInt();		
			sign(n);
		}
}