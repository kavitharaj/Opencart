package oops;



class bank{
	int a=10;
	void roi() {
		System.out.println("bank rate of interest is 0");
	}
	
}


class sbi extends bank{
    int a=20;
	void roi() {
		System.out.println("sbi rate of interest is 10");
	}
	
}

class iob extends sbi{
	 int a=30;
	//void roi() {
		//System.out.println("iob rate of interest is 20");
	//}
	//int roi(int a) {
    //   return a;
	//}
	
}

public class inheritancedem {
	public static void main(String args[]) {
		//sbi b=new sbi();
		iob iob=new iob();
		System.out.println(iob.a);
		//System.out.println(b.a);
		iob.roi();
		//System.out.println(iob.roi(100));
	}
	
	

}
