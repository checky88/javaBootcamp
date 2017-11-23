package Java809_2;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * Created by KellyR on 10/11/2017.
 */
public class Q2 {
public static void main(String args[]){
    IntStream stream = IntStream.of(1, 2, 3);

    IntFunction<IntUnaryOperator> inFu = x -> y -> x * y;
    IntStream newStream = stream.map(inFu.apply(10)); // line n2
    newStream.forEach(System.out::print);
}
}
