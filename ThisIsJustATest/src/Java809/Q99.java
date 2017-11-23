package Java809;

import java.util.Arrays;
import java.util.List;

/**
 * Created by KellyR on 06/11/2017.
 */
public class Q99 {
    public static void main(String args[]){
        List<String> empDetails = Arrays.asList("100, Robin, HR",
                "210, Mary, AdminServices",
                "101, Peter, HR");
        empDetails.stream()
                .filter(s-> s.contains("1"))
                .sorted()
                .forEach(System.out::println);
//line n1
    }
}
