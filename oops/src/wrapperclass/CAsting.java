package wrapperclass;

class parent {
	int a = 10;

	void m1() {
		System.out.println("this is parent class");
	}
}

class child extends parent {
	int b = 20;

	void m2() {
		System.out.println("this is child class");
	}
}

public class CAsting {

	public static void main(String args[]) {
// no casting
	/*	
		child c=new child();
		c.m1();
		c.m2();
		*/
	// run time eeror -- downcasting 
	/*	
	parent p=new parent();
	p.m1();
	((child) p).m2();
	
	
	parent p1=new child();
	p1.m1();
  */
	
		child  c1= (child) new parent();// --> downcasting
		c1.m1();
		((child) c1).m2();
		
		
	
		
		
		
		
	}
}
