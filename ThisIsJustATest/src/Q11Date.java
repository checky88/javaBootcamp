import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q11Date {

	public static void main(String[] args) {

		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2017, 04, 06);
		LocalDate date3 = LocalDate.parse("2017-04-06T11:16:00", DateTimeFormatter.ISO_DATE_TIME);
		
		System.out.println("Date1 = " +date1);
		System.out.println("Date2 = " +date2);
		System.out.println("Date3 = " +date3);
		
	
	}

}
