package Java809;

/**
 * Created by KellyR on 19/10/2017.
 */
public class Q47 {

    void doStuff() throws Exception {
        if (Math.random() > -1) throw new Exception ("Try again");
    }

    public static void main(String[] args) {
        try {
     //       doStuff();
        //} catch (ArithmeticException | NumberFormatException | Exception e) {
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
