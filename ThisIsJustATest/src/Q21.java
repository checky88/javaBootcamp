import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Q21{
	
	public static void main (String[] args){

	String[] s1 = new String[2];
	
	int ind = 0;
	
	for(String s : s1){
		s1[0].concat("element " + ind);
		ind++;
	}
	
	for(ind = 0; ind<s1.length; ind++){
		System.out.println(s1[1]);
		
	}

}//end main
}// end class