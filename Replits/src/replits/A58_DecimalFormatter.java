package replits;

import java.text.DecimalFormat;

public class A58_DecimalFormatter {
	
	public static void main(String[] args) {
		//format(double) - method that formats decimals and returns string value
		
		DecimalFormat format=new DecimalFormat("0.000");
		double b=23.123455666777888;
				
		String num1 =format.format(b);
		System.out.println(num1);//23.123
		
		double c=45.56776879;
		System.out.println(format.format(c)+1);//45.5681
		
		c=Double.parseDouble(format.format(c));//to convert String to number
		System.out.println(c+1);//46.568
	}
}