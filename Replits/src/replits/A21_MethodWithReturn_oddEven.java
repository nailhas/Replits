package replits;

import java.util.Scanner;

public class A21_MethodWithReturn_oddEven {
//Create a method, which gets int number. If it is even - returns true, if odd - false.
	
	public static boolean isEven(int n) {
		if(n%2==0) {
			return true;
		}else {
			return false;
		}
  }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();		
		System.out.println(isEven(n));	
	}
}