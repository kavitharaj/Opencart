package practice_projects;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Arrayss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[] {500,300,400,700,600,900,5};
		int[] a1={500,300,400,700,600,900,5};
		
		int[][] b= new int[][] {{100,200},{300,400}};
		
		int[][] b1= {{100,200},{300,400}};
		
		Object c[]= new Object[] {"kaavi",'a',4,60.6,true};
		
		// biggest number in the array
		/*
		 * int big=0; for(int i=0;i<a.length;i++) { int max=a[i]; if(max>big) { big=max;
		 * }
		 * 
		 * } System.out.println("Biggest number in the array "+ big);
		 * System.out.println(java.util.Arrays.toString(a));
		 */
		
		/*
		 * 
		 * // find sum of array element
		 *  int sum=0; for(int i=0;i<a.length;i++) {
		 * sum=sum+a[i]; } System.out.println("Sum of the array element is " + sum);
		 */
		/*
		 * // find length of the array
		 * 
		 * System.out.println("length of the array "+ a.length);
		 */
		/*
		 * // find index of the array
		 *  System.out.println("index of the array is "+
		 * (a.length-1));
		 */
		
	
		 // diffrent ways to print array 
			/*
			 * for(int x:a) { System.out.println(x); }
			 * System.out.println("print array in another way" + Arrays.toString(a));
			 */
		
		
		//System.out.println(java.util.Arrays.toString(b));
		/*
		 * System.out.println(b[0][0]); System.out.println(b[0][1]);
		 * System.out.println(b[1][0]); System.out.println(b[1][1]);
		 */
		
	/*	for (int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++){
				System.out.print(" " +(b[i][j]) );*/
/*		 System.out.println("enter number");
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<a.length;i++) {	
		
				a[i]=sc.nextInt();
		
			}
	 System.out.println("array element is " + Arrays.toString(b));
		}
		*/
	   // Arrays.sort(a);
	   //System.out.println("length of the array "+ c.length);
/*		System.out.println(Arrays.deepToString(b1));
		System.out.println(Arrays.toString(a1));
		for (Object x:c) {
			System.out.println(x);*/
		 
		 
			
		//}
		// multi dimenstional array print
		 
		/*
		 * for (int[] arr:b) { for (int x:arr) { System.out.println(x); } }
		 */
		// linear search 
		
		
		/*
		 * Boolean status = false; for (int i=0;i<a.length;i++) { int search=5;
		 * 
		 * if(a[i]==search) { System.out.println("item is found "); status=true; break;
		 * } } if(status==false) System.out.println("item is not found");
		 */
	   
		  
		  
		 
		
		
		
	}}

