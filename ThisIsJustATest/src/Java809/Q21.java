package Java809;

import java.util.*;
import java.util.function.Predicate;



public class Q21 {
	public static void main(String[] args) {
	List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
	Predicate<String> test = s -> {
	    int i = 0;
	    boolean result = s.contains("pen");
	    System.out.print(i++ + " : ");
	    return result;
	};
	str.stream()
	        .filter(test)
	        .findFirst()
	        .ifPresent(System.out::print);
	
}
}
/*
 * he filter method on line 18 of the program retains only the string elements that contain the " pen"
 *  substring. Line 14 "i ++" can be directly treated as 0, because i is a region variable, so each value will be 0. The first page of the program uses the findFirst method, which causes the filter method in line 18 to find the first string element that matches the string containing the " pe n", and then returns the result directly. So the program will find index 1 " pe n", and then " pe n" string items into Optional after the return, then the program output "0: 0:". The ifPresent method on line 19, because there is a " pe n" string in the Optional object, executes the print method of the standard output stream object and outputs " pe n".
 */

//*/