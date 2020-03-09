package replits;
/* Using scanner, provide 5 Strings of min length of 3 and save them into an array called arr.  
Print first three letter of each element of arr, one per line.  
Ex.: arr -> ["apple", "banana"] 
prints: app
        ban     */
import java.util.Scanner;

public class A3_Print_3_first_letters_of_each_array_element {
	public static void main(String[] args) {
		//Create scanner:
		Scanner input = new Scanner(System.in);
		//Make input of 5 strings for the array arr:
		String[] arr = new String[5];
		for(int i=0; i<5; i++) {
			arr[i]=input.nextLine();	
		}
		
		//Use for each loop to print first 3 letters of each element of the array:
		int j=0;
		for(String words : arr) {
			System.out.println(words.substring(0, 3));			
		}		
	}
}