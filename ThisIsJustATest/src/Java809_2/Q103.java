package Java809_2;

/**
 * Created by KellyR on 13/11/2017.
 */
public class Q103 {
        int fvar;
        static int cvar;

        public static void main(String[] args) {
            Q103 t = new Q103();
            t.fvar = 200;
            t.cvar = 200;
            t.fvar = 200;
            Q103.cvar = 400;
        }

}
