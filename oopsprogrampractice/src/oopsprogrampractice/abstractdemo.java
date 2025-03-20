package oopsprogrampractice;

abstract class shape{
	abstract void m1();
	
}
interface interfaceshape {
	static void m() {
		System.out.println("this is static methos");
	}
}

public class abstractdemo extends shape implements interfaceshape {
	public void m1() {
		System.out.println("this is abstract class method");
}
	public static void main(String args[]) {
		abstractdemo ad=new abstractdemo();
		ad.m1();
		interfaceshape.m();
	}
	

}
