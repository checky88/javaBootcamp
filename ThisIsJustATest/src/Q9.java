import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Alpha{
	
int ns;
static int s;
Alpha(int ns)
{
	if(s<ns){
		s=ns;
		this.ns = ns;
	}
}// end alpha method

	void print()
	{
		System.out.println("ns = "+ ns+" s = "+s);	
	}


}//end class

public class Q9 {

	public static void main(String[] args) {
	Alpha ref1 = new Alpha(50);
	Alpha ref2 = new Alpha(125);
	Alpha ref3 = new Alpha(100);
	
	ref1.print();
	ref2.print();
	ref3.print();
	
	}

}
