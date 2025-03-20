package oopsprogrampractice;

class animal{
	void m1(){
		System.out.println("this is animal class");
	}
}
class dog extends animal{
	void m2(){
		System.out.println("this is dog class");
	}
}

class cat extends animal{
	void m3(){
		System.out.println("this is cat class");
	}
}


public class castingobject {
	public static void main(String args[]){
		
		
		animal a=new animal();
		a.m1();
		//a.m2();// error
		//a.m3();// error 
		
		animal an=new animal();
		dog d=(dog) an;
		d.m1();
		d.m2();
		//   d.m3(); // compile time error  cat class dont know
		
		//animal an1=new dog();
		// cat c1=(dog) an1; this is error  --> dog and cat dont have relation
		
		//animal an2=new dog();
		//cat c1=(cat) an2;
		//c1.m1();
		// c1.m3();
		// c1.m2( cat dont know about dog
		
		
		
		
		
		
		
		
		
	}

}
