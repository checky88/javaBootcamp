package Java809;
import java.io.*;
import java.util.Properties;

public class Q38 {

	
public static void main(String[] args) throws IOException {
	Properties prop = new Properties();
	
	FileInputStream fis = new FileInputStream("resources/Message.properties");
	prop.load(fis);
	System.out.println(prop.getProperty("welcome1"));
	System.out.println(prop.getProperty("welcome2", "Test"));//line n1
	System.out.println(prop.getProperty("welcome3"));
}
}
