package Java809;

import java.io.IOException;

final class Folder implements AutoCloseable { //line n1
	 
	public void close () throws IOException { System.out.print("Close"); } //line n2
 
    public void open() {
        System.out.print("Open");
    }
}
 
public class Q12 {
 
    public static void main(String[] args) throws Exception {
        try (Folder f = new Folder()) {
            f.open();
        }
    }
}