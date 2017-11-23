package Java809;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.file.Files.readAllLines;

/**
 * Created by KellyR on 25/10/2017.
 */
public class Q65 {
    public static void main(String args[]) throws IOException {
        //resources/employee.txt

        Path file = Paths.get("resources/employee.txt");
        // A.
       // List<String> fc = Files.list(file); fc.stream().forEach (s - > System.out.println(s));
        //B.
        // Stream<String> fc = Files.readAllLines(file); fc.forEach (s - > System.out.println(s));
        // C.
        // List<String> fc = readAllLines(file); fc.stream().forEach (s - > System.out.println(s));
        // D.
        Stream<String> fc = Files.lines(file);
        fc.forEach (s -> System.out.println(s));
    }
}
