package Java809.Q52;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by KellyR on 19/10/2017.
 */
public class Q54 extends Thread {
        CyclicBarrier cb;
        public Q54(CyclicBarrier cb) {
            this.cb = cb;
        }
        public void run() {
            try {
                cb.await();
                System.out.println("Worker...");
            } catch (Exception ex) {
            }
        }
    }
    class Master implements Runnable { //line n1
        public void run() {
            System.out.println("Master...");
        }
    }
class test{
    public static void main(String args[]){
        Master master = new Master();
        //line n2
        CyclicBarrier cb = new CyclicBarrier(1, master);
        Q54 worker = new Q54(cb);
        worker.start();
    }
}
