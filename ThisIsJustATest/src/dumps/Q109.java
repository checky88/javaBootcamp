package dumps;

public class Q109 {
	public static void  main(String [] args) {
	X xRef = new Y();
	Y yRef = (Y) xRef;
	yRef.mY();
	xRef.mX();
	
	}

}
