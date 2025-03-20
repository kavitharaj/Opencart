package oopsprogrampractice;

import java.util.ArrayList;
import java.util.HashSet;

public class hashsetdemo {
	public static void main(String args[]){
	
	HashSet<String> hs=new HashSet<String>();
	
	hs.add("abi");
	hs.add("rahav");
	hs.add("vijay");
	hs.add("100");
	hs.add(null);
	hs.add(null);
	hs.add("100");
	System.out.println(hs);
	
	hs.remove("100");
	System.out.println(hs);
	ArrayList<String> al=new ArrayList<String>(hs);
	ArrayList<String> a2=new ArrayList<String>();
	a2.add("vijay");
	a2.add(null);
	System.out.println(al.removeAll(a2));
	System.out.println(al);
	
	
		
	}
}
