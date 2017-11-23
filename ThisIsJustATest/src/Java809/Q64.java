package Java809;

import java.util.function.ToIntFunction;

/**
 * Created by KellyR on 25/10/2017.
 */
public class Q64 {
    public static void main(String args[]){
        String str = "Java is a programming language";
        ToIntFunction<String> indexVal = str :: indexOf; //line n1
        int x = indexVal.applyAsInt("Java"); //line n2
        System.out.println(x);
    }
}
