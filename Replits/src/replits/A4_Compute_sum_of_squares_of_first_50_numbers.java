package replits;

public class A4_Compute_sum_of_squares_of_first_50_numbers {
	
//Compute the sum of the squares of the first 50 counting numbers.
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=50; i++) {
			sum+=i*i;
		}
		System.out.println(sum);//42925
	}
}