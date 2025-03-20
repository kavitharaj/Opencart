package oopsprogrampractice;

public class staticfinalkeyword {

	int a = 10;
	final int b = 20;
	static int c = 30;

	void display() {
		int display = 10;

		System.out.println("This is display method");
		System.out.println("display value is " + display);
		System.out.println("b value is " + b);
		System.out.println("a value is " + a);
		System.out.println("c value is " + c);

	}
	void sum(int x, int y) {
		System.out.println("sum " + (x + y));
	}
	
	void print() {

		System.out.println("This is print  method");
		// System.out.println("display value is "+display);
		System.out.println("b value is " + b);
		System.out.println("a value is " + a);
		System.out.println("c value is " + c);
	}
}
