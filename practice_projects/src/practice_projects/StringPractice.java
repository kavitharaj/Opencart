package practice_projects;

import java.util.Arrays;

public class StringPractice {
	public static void main(String args[]) {
		String name1="Ajay Sabari ";
		String name1same="Ajay Sabari ";
		String name2="SushanthSaranMohit ";
		String name3="tilan%^#@!$&*()nimalkavi@gmail.com>200";
		String name4=new String("SanthanamChellam");
		StringBuffer sbname=new StringBuffer("kavitha");
		System.out.println(sbname.reverse());
		StringBuffer sbname1=new StringBuffer("sasmitha");
		//System.out.println(sbname1.reverse());
		sbname1.append("sa");
		sbname1.substring(1);
		System.out.println(name1);
		System.out.println(sbname1);
		
		
		/*
		 * char array[]=name1.toCharArray(); System.out.println(Arrays.toString(array));
		 * System.out.println(array[0]); for (int i=0;i<array.length;i++) {
		 * System.out.println(""+ array[i]); }
		 */
		/*
		 * System.out.println("First Name:"+name1);
		 * System.out.println("Second Name:"+name2);
		 * System.out.println("last Name:"+name4);
		 * System.out.println("lenth of the name is "+ (name1.length()));
		 * System.out.println("joining Name:"+((name1.concat(name2))));
		 * System.out.println("joining Name:"+((name1.concat(name2).concat(name3))));
		 * System.out.println("Space removing:"+(name1.trim()));
		 * System.out.println("Space removing:"+(name1.trim()));
		 * System.out.println("First Name CharAt:"+name2.charAt(3));
		 * 
		 * System.out.println("First name contains:"+name1.contains("AjayS"));
		 * System.out.println("name1==name1same:"+(name1==name1same));
		 * System.out.println("name1 equlas name1same:"+(name1.equals(name1same)));
		 * System.out.println("name1 equals ignore name1same:"+(name1.equalsIgnoreCase(
		 * name1same)));
		 */
		/*
		 * System.out.println(name4.replace('a', 'x'));
		 * System.out.println(name4.replace("am", "x"));
		 * System.out.println(name4.replace('a', 'x').replace('x',
		 * 'A').replace('A','y')); System.out.println(name4.substring(5,10));
		 * System.out.println(name1.substring(0,4).substring(2,3));
		 */
		/*
		 * System.out.println(name4.toUpperCase());
		 * System.out.println(name4.toLowerCase()); String splits[]=name3.split("kavi");
		 * String splits1[]=name3.split("\\."); String splits3[]=name3.split("\\*|@|>");
		 * 
		 * 
		 * 
		 * System.out.println(Arrays.toString(splits));
		 * System.out.println(Arrays.toString(splits1));
		 * 
		 * System.out.println(Arrays.toString(splits3));
		 */
		

		
		
		
	}

}
