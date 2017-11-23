import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Q13{
	
int i = 0;
static int count = 0;


	public void print()
	{
		while (i < 5){
		i++;
		count++;
		}
	}
		

	public static void main(String[] args) {
		Q13 ref1 = new Q13();
		Q13 ref2 = new Q13();
	//Alpha ref3 = new Alpha(100);
	
	ref1.print();
	ref2.print();
	//ref3.print();
	
	System.out.println(count +" : "+ count);
	
	}

}