package Java809;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by KellyR on 06/11/2017.
 */
public class Q98 {
    public static void main(String args[]){
    Path p1 = Paths.get("/Pics/Ray/MyPic.jpeg");
System.out.println(p1.getNameCount()
        + ":" + p1.getName(0)
        + ":" + p1.getFileName());
}
}
