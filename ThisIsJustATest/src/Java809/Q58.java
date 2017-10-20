package Java809;

/**
 * Created by KellyR on 19/10/2017.
 */
public class Q58 {
 public static void main(String args []) {
     String color = "teal";
     switch (color) {
         case "Red":
             System.out.println("Found Red");
         case "Blue":
             System.out.println("Found Blue");
             break;
         case "Teal":
             System.out.println("Found Teal");
             break;
         default:
             System.out.println("Found Default");
     }
 }
}
//https://magiclen.org/ocajp-switch-break/