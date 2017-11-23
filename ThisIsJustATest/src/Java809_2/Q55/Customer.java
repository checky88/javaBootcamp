package Java809_2.Q55;

/**
 * Created by KellyR on 10/11/2017.
 */
public class Customer {

    private String fName;
    private String lName;
    private static int count;

    public Customer(String first, String last) {
        fName = first;
        lName = last;
        ++count;
    }

    static {
        count = 0;
    }

    public static int getCount() {
        return count;
    }
}