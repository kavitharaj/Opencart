package oopsprogrampractice;

public class SingleInheritance {
	
	int a=10;
	int b=20;
	int c=30;
	void sum() {
		System.out.println("sum of a+b+c is "+ (a+b+c));
	}

}
class multiplication extends SingleInheritance {
	
	int a=100;
	int b=200;
	int c=300;
	void sum1() {
		System.out.println("sum of a+b+c is "+ (a+b+c));
	}
	
	
	
}