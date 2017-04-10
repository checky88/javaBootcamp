
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class Q131 {
	public static void main(String[] args) {
		try {
			String[] arr =new String[4];
			arr[1] = "Unix";
			arr[2] = "Linux";
			arr[3] = "Solarios";
			for (String var : arr) {
				System.out.print(var + " ");
			}
		} catch(Exception e) {
			System.out.print (e.getClass());
		}
	}
}