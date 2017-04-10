
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class Q136 {

		public static void main(String[] args) {


			
			float myarray[] = {10.20f, 20.30f, 30.40f, 50.60f};
			 int index = 0;
			 boolean isFound = false;
			 float key = 30.40f;
			 
			 while(index < 5) {
				 if(key == myarray[index]) {
				 isFound = true;
				 break;
				 }
				 index++;
				 }
			 
			 System.out.println(isFound);
}
}