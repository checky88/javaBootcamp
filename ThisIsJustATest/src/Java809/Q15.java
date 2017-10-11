package Java809;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A.
		//Car auto = Car("MyCar"):: new;
		//B.
		//Car auto = Car :: new;
		//Car vehicle = auto :: getCar(“MyCar”);
		//C.
		Rideable rider = Car :: new;
		Car vehicle = rider.getCar("MyCar");
		//D.
		//Car vehicle = Rideable : : new : : getCar(“MyCar”);

	}

}
