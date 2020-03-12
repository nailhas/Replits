package replits;

import java.util.Scanner;

public class A9_Arrays_average {
	//Print average value of a double data type array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double total =0;
		double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};
		
		for(int i=0; i<temps.length; i++) {
			total+=temps[i];
		}
		
		double avgTemp=total/temps.length;
		System.out.println(avgTemp);//4.95		
	}
}