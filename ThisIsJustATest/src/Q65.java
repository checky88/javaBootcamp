
public class Q65 {

	void readCard (int cardNo) throws Exception{
		System.out.println("Reading Card");
	}
	
	
	void checkCard (int cardNo) throws RuntimeException{
		System.out.println("Checking Card");
	}
	
	public static void main (String[] args){
		Q65 ex = new Q65();
		int cardNo = 12345;
		
		ex.checkCard(cardNo);
		//ex.readCard(cardNo);
	}
	
}
