package Java809.Q84;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by KellyR on 06/11/2017.
 */
public class Q85 {
    public static void main (String args []){
        Map<Integer, String> books = new TreeMap<>();
        books.put (1007, "A");
        books.put (1002, "C");
        books.put (1001, "B");
        books.put (1003, "B");
        System.out.println(books);
    }
}
