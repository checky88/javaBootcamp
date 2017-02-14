import java.util.Scanner;

/* Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
Modify the previous program such that only multiples of three or
five are considered in the sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17
*/

public class SumMultiples {

	public static void main(String[] args) {
		
		/// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		int sum = 0;
		int n= 0;

		 System.out.println("Please enter a number:");
		 n = keyboard.nextInt();//takes the number entered and sets to the value of n
		 
		 for(int i = 3; i<=n;i++){
			 if (i % 3 == 0 || i % 5 == 0) 
			 sum += i;
			
		 }//end for loop
		 System.out.println("Sum of "+ n +" mod 3 or mod 5 being zero is = " + sum);
		 
	
	}//end main

}//end class
