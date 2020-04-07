package replits;

import java.util.Scanner;

public class A47_MiddlePartOfString {
	public static void main(String[] args) {
/*
1. If the word has odd number of characters and 3 or more characters, print middle letter
      Ex: oak ==> a
      	  javav ==> v
   - Single character, print that character 3 times
      Ex: # ==> ###
      	  q ==> qqq
2. If word has even number of characters and 4 or more characters, print middle 2
     Ex: java ==> av
	     apples ==> pl
	     #$%^&* ==> %^
   - 2 characters, print those 2 characters twice
      Ex: @@ ==>@@@@
	      $$ ==>$$$$
	      hi ==> hihi     */
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
		
	    if(word.length()%2==1) {
	    	if(word.length()>=3) {
	    		System.out.println(word.substring(word.length()/2,(word.length()/2)+1));
	    	}else if(word.length()==1) {
	    		System.out.println(word+word+word);
	    	}
	    }else if(word.length()%2==0) {
	    	if(word.length()>=4) {
	    		System.out.println(word.substring(word.length()/2-1,(word.length()/2)+1)+word.substring(word.length()/2,word.length()/2));
	    	}else if(word.length()==2) {
	    		System.out.println(word+word);
	    	}
	    }    
	  }
}