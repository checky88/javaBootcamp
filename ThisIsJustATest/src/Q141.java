
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class Q141 {



		public static String doMsg(char x) {
			return "Good Day!";
		}
		public static String doMsg(int y) {
			return "Good Luck!";
		}
		public static void main(String[] args) {
			char x = 8;
			int z = '8';
			System.out.println(doMsg(x));
			System.out.print(doMsg(z));
		}

}