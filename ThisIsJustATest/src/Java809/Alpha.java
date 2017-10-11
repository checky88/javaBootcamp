package Java809;

public class Alpha {
	
	public String doStuff(String msg){
		return msg;
		
	}

}

class Beta extends Alpha {
	public String doStuff(String msg){
		return msg.replace('a', 'e');
	}
}


class Gamma extends Beta {
	public String doStuff(String msg){
		return msg.substring(2);
	}
}

