package Java809;

import java.util.*;
import java.util.stream.Stream;

public class Q24 {
	
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(10, 20);
		List<Integer> list2 = Arrays.asList(15, 30);
		
		Stream.of(list1, list2)
		.flatMap(list -> list.stream())
		.forEach(s -> System.out.print(s + " "));
		


		//list1.stream().flatMap(list2.stream().flatMap(e1 -> e1.stream()))
		//https://magiclen.org/ocpjp-how-to-print-10-20-15-30/
	}
}
