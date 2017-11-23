package Java809;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by KellyR on 06/11/2017.
 */
public class Q71 {
    public static void main(String args[]){
        Path path1 = Paths.get("/app/./sys/");
        Path res1 = path1.resolve("log");
        Path path2 = Paths.get("/server/exe/");
        Path res2 = path2.resolve("/readme/");
        System.out.println(res1);
        System.out.println(res2);
    }
}
