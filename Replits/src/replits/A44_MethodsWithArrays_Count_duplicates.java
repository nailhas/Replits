package replits;

public class A44_MethodsWithArrays_Count_duplicates {
/*getDup accepts an array and returns an int.
If there is any duplicated elements, method counts their number in the array.
Ex: getDup(["1","2","aa"',"1"])
	returns:2 (two "1"s)

getDup(["1","2","aa"',"1", "aa"])
returns:4 (two "1"s and 2 "aa"s)

getDup(["1","g","aabb',"7","7","2","aa"',"7"])
returns:3

Hint: use a nested loop, which runs on the array from the method argument. */
	public static int getDup(String[] r) {
		int duplicatesNum = 0;
		String temp = "";
		for(String each1 : r) {
			int counter = 0;
			for(String each2 : r) {
				if(each1.equals(each2)) {
					counter++;
				}
			}
			if(counter>1) {
				if(!temp.contains(each1)) {
					temp+=each1;
					duplicatesNum+=counter;
				}				
			}
		}
		return duplicatesNum;
	}
	
	public static void main(String[] args) {
		String[] arrWithDuplicates = {"1","g","aabb","7","7","2","aa","7"}; 
		System.out.println(getDup(arrWithDuplicates));//3
	}
}