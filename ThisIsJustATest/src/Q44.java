import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Q44{
	
	public static void main (String[] args){

	int[] s1 = new int[1];
	int[] s2 = {1,2,3,4,5};
	
	s1=s2;
	
	for(int x: s1){
		System.out.println(x +" :");
	}
	


}//end main
}// end class