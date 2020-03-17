package replits;

public class A18_NumberOfWordOccurence_inStringArray {
/*Create a method that gets a String array and a string, and returns an int.
	It counts how many times a string appears in the array and returns the count. */
		public static void main(String[] args) {
			String[] arr = {"love", "peace", "joy", "happiness", "love"};
			String t = "love";
			countOccurence(arr, t);
		}

		public static int countOccurence(String[] arr, String t) {
			int count = 0;
				for(int i=0; i < arr.length; i++) {
					if(arr[i].equals(t)) {
						count+=1;
					}
				}
				System.out.println(count);
			return count;
		}
}