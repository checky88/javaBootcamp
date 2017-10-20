package Java809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q22 {
	
	public static void main (String [ ] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.print ("Enter GDP: ");
		//line 1
		int GDP = Integer.parseInt(br.readLine());
		
		//int GDP = br.read();
		System.out.println("GDP is "+ GDP);
		//int GDP = br.nextInt();

}
}
//https://magiclen.org/ocpjp-bufferedreader/