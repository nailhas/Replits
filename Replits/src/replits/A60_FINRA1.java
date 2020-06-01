package replits;

public class A60_FINRA1 {
	/*1. Write a program, which prints out the numbers from 1 to 30:
	  2. for numbers which are divisible by 3, print "FIN" instead of the number.
	  3. for numbers which are divisible by 5, print "RA" instead of the number.
	  4. for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number.*/
	public static void main(String[] args) {
	
		for(int i=1; i<=30; i++) {
			String print="";
			
			if(i%3==0) {
				print+="FIN";
			}
			
			if(i%5==0) {
				print+="RA";
			}
			
			if(print.isEmpty()) {
				System.out.print(i+" ");
			}else {
				System.out.print(print+" ");
			}
		}
	}
}
