package replits;

import java.util.Scanner;

public class A35_SecondsConverter {
/*Write a program, which prints the number of hours, minutes, and seconds that
corresponds to inputed number of seconds. 
Using %(remainder) and / operators, 
find out how many whole hours, minutes and seconds are in inputed seconds.  */
	
	public static void main(String[] args) {	
	
		Scanner input=new Scanner(System.in);
		System.out.println("Enter seconds:");
		int inputSeconds=input.nextInt();
		
		int seconds=inputSeconds%60;
        int minutes=(inputSeconds/60)%60;
        int hours=inputSeconds/3600;
        
        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
	}
}