package Java809.Q91;

/**
 * Created by KellyR on 06/11/2017.
 */
public class Q97 {
    public static void main(String[] args) {
        AnotherSampleClass asc = new AnotherSampleClass();
        Q97 sc = new Q97();
        sc = asc;
        System.out.println("sc: " + sc.getClass());
        System.out.println("asc: " + asc.getClass());
    }}
class AnotherSampleClass extends Q97 {
}

