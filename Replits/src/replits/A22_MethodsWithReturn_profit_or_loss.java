package replits;

import java.util.Scanner;

public class A22_MethodsWithReturn_profit_or_loss {
	/*c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was profit or loss.
	It returns a string value that can be "profit","loss","no loss"
	Ex:
	c_profits(100,1500)
	returns : "profit"

	c_profits(20,5)
	returns : "loss"

	c_profits(100,100)
	returns : "no loss"          */
		public static String c_profits(int buyPrice, int sellPrice) {
			String response="";
			if(buyPrice>sellPrice) {
				response="loss";
			}else if(buyPrice<sellPrice) {
				response="profit";
			}else {
				response="no loss";
			}
			System.out.println(response);
			return response;
		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int buyPrice = scan.nextInt();
			int sellPrice = scan.nextInt();
			c_profits(buyPrice, sellPrice);	
		}
}