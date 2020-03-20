package replits;

import java.util.Scanner;

public class A23_MethodsWithReturn_Hamlet_logic {
/*The Danish prince's most famous quote is "to be or not to be". 
	That is a classic example of boolean logic.
	The hamletQuote method only returns true if one or both of the boolean parameters is true.
	example:
	hamletQuote(true, false)
	returns true

	hamletQuote(false,true)
	returns true

	hamletQuote(true,true)
	returns true

	hamletQuote(false,false)
	returns false   */
		
		public static boolean hamletQuote(boolean toBe, boolean notToBe) {
			boolean response = false;
			if(toBe==true && notToBe==true) {
				response=true;
			}else if(toBe==false && notToBe==false) {
				response=false;
			}else if(toBe==true && notToBe==false) {
				response=true;
			}else if(toBe==false && notToBe==true) {
				response=true;
			}
			System.out.println(response);
			return response;		
		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			boolean toBe = scan.nextBoolean();
			boolean notToBe = scan.nextBoolean();
			hamletQuote(toBe, notToBe);
		}
}