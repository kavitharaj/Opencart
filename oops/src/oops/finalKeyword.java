package oops;

 class testA {
	final int c=10;
void m1() {
		System.out.println("final variable a is " +c);	
	}
}

class testB extends testA {
	int c=20;
void m1() {
		System.out.println("final variable a is " +c);	
		//System.out.println("final variable a is " + testA.c);	
	}
}





public class finalKeyword {

	public static void main(String args[]) {
		testB b=new testB();
		b.m1();
	
		testA a=new testA();
		a.m1();


		System.out.println("final variable a is " + a.c);	
	}
}
