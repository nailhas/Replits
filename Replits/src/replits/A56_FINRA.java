package replits;

public class A56_FINRA {
	public static void main(String[] args) {
/*1. Write a program, which prints out the numbers from 1 to 30:
  2. for numbers which are divisible by 3, print "FIN" instead of the number.
  3. for numbers which are divisible by 5, print "RA" instead of the number.
  4. for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number.
  DO NOT USE FOR LOOP    */

		//while loop and if else		
		 String str="";
		 int i =1;
		 while(i <= 30 ) {
			if(i % 3== 0 && i % 5 ==0) {
				str += "FINRA ";
			}else if(i % 3 == 0) {
				str += "FIN ";
			}else if(i % 5==0) {
				str+="RA ";
			}else {
				str += i +" ";
			}			
			i++;
		}
		System.out.println(str);
//1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA		
	}
}