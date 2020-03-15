package replits;
/* Using scanner, provide 5 Strings of min length of 3 and save them into an array called arr.  
Print first three letter of each element of arr, one per line.  
Ex.: arr -> ["apple", "banana"] 
prints: app
        ban     */
import java.util.Scanner;

public class A03_Print_3_first_letters_of_each_array_element {
	public static void main(String[] args) {
		//1. Create scanner object:
		Scanner input = new Scanner(System.in);
		//2. Arrange for input of 5 strings for the array arr:
		String[] arr = new String[5];
		for(int i=0; i<5; i++) {
			arr[i]=input.nextLine();	
		}
		
		//3. Use for each loop to print first 3 letters of each element of the array:
		int j=0;
		for(String words : arr) {
			System.out.println(words.substring(0, 3));			
		}	
		
		/*3. Or use regular for loop:
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].substring(0, 3));
		}
		 */
	}
}