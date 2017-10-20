package Java809;

import java.util.concurrent.atomic.AtomicInteger;

public class Q42 implements Runnable {

	//class MyThread implements Runnable {

		private static AtomicInteger count = new AtomicInteger(0);

		public void run() {
			int x = count.incrementAndGet();
			System.out.print(x + " ");
		}

		public static void main(String[] args) {

		Thread thread1 = new Thread(new Q42());
		Thread thread2 = new Thread(new Q42());
		Thread thread3 = new Thread(new Q42());
		Thread[] ta = {thread1, thread2, thread3};
		for (int x = 0; x < 3; x++) {
			ta[x].start();
		}
	}

}
