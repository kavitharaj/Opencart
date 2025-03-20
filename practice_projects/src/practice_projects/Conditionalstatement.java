package practice_projects;

public class Conditionalstatement {
	public static void main(String args[]) {
		int a=10;
		int b=200;
		/*
		 * if(a==10) { System.out.println("the num is "+ a);} else if(b==20) {
		 * System.out.println("the num is "+ b); }
		 * 
		 * else { System.out.println("the num is not  "+ a); }
		 * 
		 * }
		 */
		 
		/*
		 * switch(a) { case 10: System.out.println("the num is 10"); break; case 20:
		 * System.out.println("the num is 20"); break; default:
		 * System.out.println("mismatched vaule"); }
		 */
		/*
		 * int i=10; do { System.out.println("print i "+ i); i--; }while(i>0);
		 */

		
		for(int i=0;i<10;i++) {
		
			
			if(i==5) {
				continue;
			}
			System.out.println(i);
	}
}
}