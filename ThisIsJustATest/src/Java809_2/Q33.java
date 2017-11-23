package Java809_2;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by KellyR on 10/11/2017.
 */
public class Q33 {

    public static void main(String[] args){
        int i;
        char c;
        try (FileInputStream fis = new FileInputStream("resources/course.txt");
             InputStreamReader isr = new InputStreamReader(fis);) {
            while (isr.ready()) { //line n1
                isr.skip(2);
                i = isr.read();
                c = (char) i;
                System.out.print(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
