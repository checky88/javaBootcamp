
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class Q140 {

	public static void main(String[] args) {

		Q140 ts = new Q140();
		System.out.print(isAvailable + " ");
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}
				public static boolean doStuff() {
				return !isAvailable;
				}
				
				static boolean isAvailable = false;
				
}