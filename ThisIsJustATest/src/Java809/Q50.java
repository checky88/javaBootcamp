package Java809;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by KellyR on 19/10/2017.
 */
public class Q50 {
    public static void main(String[] args) throws IOException {
        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader(new FileReader("resources/employee.txt"))) { // line n1
            br.lines().forEach(c -> System.out.println(c));
            brCopy = br;//line n2
        }
        brCopy.ready(); //line n3;
    }
}
