import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _C {

	
	private static int $;
	
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		Object obj = new Object();
		Object obj1 = new Object();
		
		obj = "hello";
		obj1 = "hello";
		System.out.println(obj == s1);
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
		
		
		
		
	/*		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String today = new Date();
			Date todayDateAndTime = formatter.parse(today);
		
			System.out.println(Date.parse(todayDateAndTime));*/
	
		
	}

}
