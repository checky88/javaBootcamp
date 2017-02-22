
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
	}

}
