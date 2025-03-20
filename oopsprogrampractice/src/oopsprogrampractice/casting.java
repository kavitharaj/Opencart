package oopsprogrampractice;

public class casting {
   public static void main(String args[] ) {
	   
	   int a=20;
	   double b=23.9;
	   double d=(double) a;
	   System.out.println(d); // upcasting
	   
	   float f=(float) a; // upcasting
	   System.out.println(f);
	   
	   long l=(long) a;
	   System.out.println(l);
	   
	   double d1=(double) b;
	   System.out.println(d1); // downcasting
	   
	   float f1=(float) b; // downcasting
	   System.out.println(f1);
	   
	   long l1=(long) b;
	   System.out.println(l1); // downcasting
	   
	   
   }
   
   
}
