package Java809;

/**
 * Created by KellyR on 19/10/2017.
 */
public class Q59 {

    static void dispResult(int[] num) {
        try {
            System.out.println(num[1] / (num[1] - num[2]));
        } catch (ArithmeticException e) {
            System.err.println("First exception");
        }
        System.out.println("Done");
    }
    public static void main(String[] args) {
        try {
            int[] arr = {100, 100};
            dispResult(arr);
        } catch (IllegalArgumentException e) {
            System.err.println("Second exception");
        } catch (Exception e) {
            System.err.println("Third exception");
        }
    }
}
//https://magiclen.org/ocajp-exception-handle-2/

