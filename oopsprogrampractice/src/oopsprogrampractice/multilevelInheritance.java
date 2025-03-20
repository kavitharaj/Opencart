package oopsprogrampractice;

public class multilevelInheritance {
     void sum3(int a,int b) {
    	 System.out.println("sum a+b "+ (a+b));
     }
}

class bank extends multilevelInheritance  {
    void sum(int a,int b,int c) {
   	 System.out.println("sum a+b+c "+ (a+b+c));
    }
} 

class sbi extends multilevelInheritance  {
    void sum(int a,int b) {
   	 System.out.println("sum a+b "+ (a+b));
    }
}
