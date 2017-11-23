package Java809;

import java.util.Arrays;
import java.util.List;

/**
 * Created by KellyR on 25/10/2017.
 */
public class Q62 {

    public static void main(String args[]){
        List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
        System.out.println(
        // line n1
                // A.
                 listVal.stream().filter(x -> x.length()>3).count()
                // B.
                 //listVal.stream().map(x -> x.length()>3).count()
                // C.
                // listVal.stream().peek(x -> x.length()>3).count().get()
                // D.
                // listVal.stream().filter(x -> x.length()>3).mapToInt(x -> x).count()
        );
    }
}
