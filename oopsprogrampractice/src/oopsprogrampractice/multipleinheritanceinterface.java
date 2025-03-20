package oopsprogrampractice;

 interface multipleinheritance{
	int a = 10;
	int b = 20;

	default void sum() {

		System.out.println("sum is " + (a + b));

	}
	void m2();

}

 interface multipleinheritanceinterface1 extends multipleinheritance{
	int a = 100;
	int b = 200;

	default void sum1() {
		System.out.println("sum is " + (a + b));

	}

}
 public class multipleinheritanceinterface implements multipleinheritanceinterface1 {
	public  void m2() {
		System.out.println("this is abstract method");
	 }
	public static void main(String args[]) {
		multipleinheritance mi = new multipleinheritanceinterface();
		mi.sum();
		mi.m2();
		// mi.sum1(); -->error

	}
}
