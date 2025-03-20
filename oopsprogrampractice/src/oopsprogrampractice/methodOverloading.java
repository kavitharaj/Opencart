package oopsprogrampractice;

public class methodOverloading {

	int a = 10;
	int b = 20;
	int c = 30;

	void sum(int x, int y) {
		System.out.println("sum " + (x + y));
	}

	void sum(int x, String y) {
		System.out.println("sum " + (x + y));
	}

	void sum(String x, String y) {
		System.out.println("sum " + x + y);
	}

}
