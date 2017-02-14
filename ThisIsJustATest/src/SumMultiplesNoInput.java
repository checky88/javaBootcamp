


/*This is the first lab on the sheet by Ray Kelly raymond.kelly@version1.com
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 *  we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.*/

public class SumMultiplesNoInput {

	public static void main(String[] args) {
		int i = 3;
		int y = 5;
		int sum;
		int sum2;
		int autoSum =0;
		
		for(int x=1; x<100;x++){
			sum = i * x;
			System.out.println(i+"* "+x +" is equal "+"sum = " + sum);
			sum2 = y *x; 
			System.out.println(y+"* "+x +" is equal "+"sum = " + sum2);
			autoSum += sum;
			autoSum += sum2;
			System.out.println("Autosum = " + autoSum);
			
		}//end for loop
		
		System.out.println("The answer is  = " + autoSum);
			

	}

}
