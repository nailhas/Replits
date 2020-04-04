package replits;

public class A45_MethodsWittArrays_DeleteIntElement {
/*Method gets an int array and an int, returns an int array.
It removes element int from the array.
	Ex: deleteR([1,5,3,4],5)
		returns [1,3,4]
Hint: create a new array for return with -1 the length of arr */
	
		public static int[] delete(int[] arr, int element) {
			int[] newArr = null;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==element) {
					newArr= new int[arr.length-1];
					for(int index=0; index<i; index++) {
						newArr[index]=arr[index];
					}
					for(int j=i; j<arr.length-1; j++) {
						newArr[j]=arr[j+1];
					}
					break;
				}			
			} 
			
			for(int i=0; i<newArr.length; i++) {
				System.out.print(" "+newArr[i]);// 1 2 3 5
			}
			return newArr;
		}
		
		public static void main(String[] args) {
			int[] arr = {1,2,3,4,5};
			int element = 4;
			delete(arr, element);
		}
	}