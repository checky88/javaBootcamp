package Java809;

import java.util.*;
import java.util.function.*;

public class Q13 {

	public static void main(String[] args) {
		List<Integer> codes = Arrays.asList (10, 20);
		UnaryOperator<Double> uo = s -> s +10.0;
	//	codes.replaceAll(uo);
		codes.forEach(c -> System.out.println(c));

	}

}
