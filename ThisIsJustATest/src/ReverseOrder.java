import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*The challenge is:
Write a method to return the reverse order for a list of space separated words.
Example: "A sample sentence is required" would return "required is sentence sample A"*/

public class ReverseOrder {

	public static void main(String[] args) {
		
		String s = "A sample sentence is required";
		
		//Declare a list array and put string s into it 
		List<String> myList = new ArrayList<String>(Arrays.asList(s.split(" ")));
		
		Collections.reverse(myList);
		
		
		System.out.println("After Reverse Order, ArrayList Contains : " + myList);
		
		
		StringBuilder sb = new StringBuilder();
		
		////take the array list and add items to a string
		for (String n : myList)
		{
		    sb.append(n);
		    sb.append(" ");
		}

		System.out.println(sb.toString());
		

	}

}
