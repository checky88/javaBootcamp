import java.util.Random;

public class ThisIsJustATest {

	public static void main(String[] args) {
	int minimum = 1;
	int maximum = 4;
	int randomNum;
	String monthString = null;
		
	randomNum = minimum + (int)(Math.random() * maximum); 
	
	switch (randomNum) {
    case 1:  monthString = "January";
             break;
    case 2:  monthString = "February";
             break;
    case 3:  monthString = "March";
             break;
    case 4:  monthString = "April";
             break;
	}
	
	System.out.println(randomNum);
	System.out.println("monthString = "+monthString);

}//end class
}