
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class Q63 {
public static void main(String[] args) {
String shirts[][] = new String[2][2];
shirts[0][0] = "red";
shirts[0][1] = "blue";
shirts[1][0] = "small";
shirts[1][1] = "medium";


/*//option D
	for(int index = 0 ; index < 2;){
		for(int idx = 0; idx < 2;){
			System.out.print(shirts[index][idx] + ":");
			idx++;
		}//end internal for
		index++;
	}//end for
*/	
//option b
	for(int index = 0 ; index < 2; ++index){
		for(int idx = 0; idx < 2; ++idx){
			System.out.print(shirts[index][idx] + ":");
		}//end internal for
	}//end for

	
}//end main
}//end class