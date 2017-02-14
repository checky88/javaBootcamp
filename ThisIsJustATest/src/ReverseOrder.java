import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {

	public static void main(String[] args) {
		
		String s = "A sample sentence is required";
		
		//Declare a list array and put string s into it 
		List<String> myList = new ArrayList<String>(Arrays.asList(s.split(" ")));
		
		Collections.reverse(myList);
		System.out.println("After Reverse Order, ArrayList Contains : " + myList);
		
		

	}

}