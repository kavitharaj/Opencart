package oops;


interface Animalinterface{
	String color="black";
	int weight=20;
	default void m1() {
		System.out.println("animal color "+ color);
	}
	
	static void m2() {
		System.out.println("animal weight "+ weight);
	}
	void abtractm3();
}


interface birdsinterface{
	String color="black";
	int weight=20;
	//default void m1() {
	//	System.out.println("bird color "+ color);
	//}
	
	static void m2() {
		System.out.println("bird weight "+ weight);
	}
	void abtractm3();
}
class a{
	void print() {
		System.out.println("print class");
	}
}

abstract class  b extends a{
	abstract  void print1(); 
		
	}

public class interfaceDemo extends b implements Animalinterface,birdsinterface{
	public void abtractm3() {
		System.out.println("this isabtract method");
	}
	void m4() {
		System.out.println("this is normal method ");
	}

	void print1() {
		System.out.println("this is print abract method ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		interfaceDemo id=new interfaceDemo();
//		id.m1();
//		Animalinterface.m2();
//		id.abtractm3();
//		id.m4();
		
		interfaceDemo id=new interfaceDemo();
		String color="white";
		System.out.println("color" + color);
		id.m1();
		Animalinterface.m2();
		id.print1();
	id.abtractm3();	
	id.print();
	//id.m4();
		
		
		

	}

}
