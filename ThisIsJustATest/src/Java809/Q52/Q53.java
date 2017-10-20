package Java809.Q52;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by KellyR on 19/10/2017.
 */
public class Q53 {
        String course, name, city;
        public Q53(String name, String course, String city) {
            this.course = course;
            this.name = name;
            this.city = city;
        }
        public String toString() {
            return course + ":" + name + ":" + city;
        }
        public String getCourse() {
            return course;
        }
    public static void main (String args []){

        List<Q53> stds = Arrays.asList(
                new Q53("Jessy", "Java ME", "Chicago"),
                new Q53("Helen", "Java EE", "Houston"),
                new Q53("Mark", "Java ME", "Chicago"));
        stds.stream()
                .collect(Collectors.groupingBy(Q53::getCourse))
                .forEach((src, res) -> System.out.println(src));

    }
}
