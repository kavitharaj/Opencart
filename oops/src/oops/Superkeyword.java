package oops;


class Animal {
	String color="white";
void m1() {
		System.out.println("color variable a is " +color);	
	}
}

class dog extends Animal{

		String color="black";
	void m1() {
			System.out.println("color variable a is " +super.color);
			super.m1();
	}
}
public class Superkeyword {
	public static void main(String args[]) {
  dog d=new dog();
  d.m1();
  
	}
}
