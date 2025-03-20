package oopsprogrampractice;

public class mainoopsclass {
	static int cs = 55;

	public static void main(String[] args) {

		// static final keyword
		/*
		 * staticfinalkeyword op = new staticfinalkeyword(); op.sum(100, 200);
		 * op.display(); staticfinalkeyword.c = 50; op.display();
		 * staticfinalkeyword.c=100; op.a=200; op.a = 500; op.display();
		 * System.out.println(cs); op.print();
		 */
		// *************----------------------------------------------------------------********

		// method overloading
		/*
		 * methodOverloading mor=new methodOverloading(); mor.sum(10, 20); mor.sum(10,
		 * "KAVI"); mor.sum("sushanth", "saran"); // mor.sum("kavi", 10); ---> error
		 * sum(string,int) method is not defined
		 */

		// encapsulation

		/*
		 * encapsulation encap=new encapsulation(); // encap.n=40;
		 * encap.setbankinterest(100, 12, 4); System.out.println("p "+ encap.getp());
		 * System.out.println("n " +encap.getn());
		 * System.out.println("r "+encap.getr()); encap.setbankinterest1(1200, 7, 3);
		 * System.out.println("p "+ encap.getp()); System.out.println("n "
		 * +encap.getn()); System.out.println("r "+encap.getr());
		 */

		// inheritance -- method overriding
		/*
		 * multiplication mp=new multiplication(); SingleInheritance sin=new
		 * SingleInheritance(); sin.sum(); // sin.sum1(); mp.sum();
		 * 
		 * mp.sum1();
		 */

		 // multi level inheritanced 
		
		sbi sbi=new sbi();
		bank bk=new bank();
		sbi.sum(10, 20);
		//sbi.sum(10, 20, 30);
		bk.sum3(20, 50);
	}

}
