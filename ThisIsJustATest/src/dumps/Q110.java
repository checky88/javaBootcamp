package dumps;

public class Q110 {

	public static void main(String[] args) {
		int ar1[] = {2,4,6,8};
		int ar2[] = {1,3,5,7,9};
		ar2 = ar1;
		
		for(int i: ar2){
			System.out.println(" "+i);
		}

	}

}
