package Java809;

public class Q25 {

int j, k;

public static void main(String[] args) {

	new Q25().doStuff(); 
	}

	void doStuff() {

	int x = 5;

	doStuff2();

	System.out.println("x");

	}

	void doStuff2() {

		int y = 7;

		System.out.println("y");

		for (int z = 0; z < 5; z++) {

			System.out.println("z");

			System.out.println("y");

		}
	}
}
	