package Java809;
import java.time.*;

public class Q37 {
	
public static void main(String[] args) {
	LocalDate valentinesDay =LocalDate.of(2015, Month.FEBRUARY, 14);
	LocalDate nextYear = valentinesDay.plusYears(1); 
	nextYear.plusDays(16); //line n1
	System.out.println(nextYear);

	int x = 4;
	int y = 2;

	double a = Math.ceil(x/y);

	System.out.println(a);


}
}