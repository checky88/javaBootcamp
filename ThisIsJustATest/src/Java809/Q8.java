package Java809;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q8 {
	public static void main(String[] args) {	
		
	
	List<TechName> tech = Arrays.asList (
			new TechName("Java-"),
			new TechName("Oracle DB-"),
			new TechName("J2EE-")
			);
			Stream<TechName> stre = tech.stream();
			//System.out.print("hello");
			//A. 
			//stre.forEach(System.out::print);
			//B. 
			stre.map(a-> a.techName).forEach(System.out::print);
			//C. 
			//stre.map(a-> a).forEachOrdered(System.out::print);
			//D. 
			stre.forEachOrdered(System.out::print);

}
}
class TechName {
String techName;
TechName (String techName) {
this.techName=techName;
}
}


