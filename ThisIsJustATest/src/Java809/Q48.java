package Java809;

/**
 * Created by KellyR on 19/10/2017.
 */
public class Q48 {
    public static void main(String args[]){
        String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
        for (String c : colors) {
            if (c.length() != 4) {
                continue;
            }
            System.out.print(c + ", ");
        }
    }
}
