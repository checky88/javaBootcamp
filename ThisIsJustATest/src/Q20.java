import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Q20{
	

	public static void doSum(float x, float y){
		System.out.println("float is " +  (x+y));
	}
	
	public static void doSum(int x, int y){
		System.out.println("int is " +  (x+y));
	}
	
	public static void doSum(double x, double y){
		System.out.println("double is " +  (x+y));
	}
	
	public static void main(String[] args){
		doSum(10,20);
		doSum(10.0,20.0);
	}

}