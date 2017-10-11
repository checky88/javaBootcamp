package Java809;

import java.util.*;
import java.util.stream.Collectors;
	
public class Q14 {

	public static void main(String[] args) {
	
List<Emp> emp = Arrays.asList(
        new Emp("John", "Smith"),
        new Emp("Peter", "Sam"),
        new Emp("Thomas", "Wale"));
		System.out.println(emp.stream()
		//A
		//	
		.sorted(Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName))
		//B.
		//.sorted(Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName)) 
		//C.
		//.map(Emp::getfName).sorted(Comparator.reserveOrder()) 
		//D.
		//.map(Emp::getfName).sorted(Comparator.reserveOrder().map(Emp::getlName).reserved
		.collect(Collectors.toList()));
	}

}
