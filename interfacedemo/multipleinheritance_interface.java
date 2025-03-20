package oopsprogrampractice;

interface multipleinheritance_interface {
	int a = 10;
	int b = 20;

	default void sum() {

		System.out.println("sum is " + (a + b));

	}

}

 /* interface multipleinheritance_interface1 extends multipleinheritance_interface {
	int a = 100;
	int b = 200;

	default void sum() {
		System.out.println("sum is " + (a + b));

	} */


 public class multipleinheritance{
	public static void main(String args[]) {
		multipleinheritance_interface mi = new multipleinheritance();
		mi.sum();

	}
}}}
