package replits;

import java.util.Scanner;

public class A10_Array_shortest_word {
	//print the shortest word in string array.
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String[] str = {scan.next(), scan.next(), scan.next(), 
		                    scan.next(), scan.next(), scan.next()};
		    
			int shortestWord = 0;
			int elementLength = str[0].length();
			for(int i=1; i<str.length; i++) {
				if(str[i].length() < elementLength) {
					shortestWord=i; 
					elementLength=str[i].length();
				}
			}
			System.out.println(str[shortestWord]);
		    
		  }
}