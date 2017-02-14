


/*This is the first lab on the sheet by Ray Kelly raymond.kelly@version1.com*/

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
