package replits;

public class A19_MethodWithReturn_max {
	/*max function gets two ints - x and max.
	x is the test case, max is what we test against.

	if x is bigger then max return max, otherwise return x.
	Ex: max(11,5)
		returns 5       */
		
		public static int max(int x, int max) {
			int display=0;
			if(x>max) {
				display=max;
			}else {
				display=x;			
			}
			System.out.println(display);
			return display;
		}
		
		public static void main(String[] args) {
			max(8, 10);
		}
}