package oopsprogrampractice;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList mylist=new ArrayList();
		mylist.add(100);
		mylist.add("sushanthsaran");
		mylist.add("ajaysabari");
		mylist.add(null);
		mylist.add('a');
		mylist.add(true);
		System.out.println("Array list elements are "+mylist);
		
		// add multiple elements same time
		
		ArrayList mylist1=new ArrayList();
		mylist1.add("sasmitha");
		mylist1.add(200);
		mylist1.add(45.67);
		
		mylist.addAll(mylist1);
		System.out.println("After adding mylist 2, Array list elements are "+mylist);
		
		System.out.println("size of the array is "+mylist.size());
		
		mylist1.remove(2);
		System.out.println("my list 2 after remove 2 elemnt"+ mylist1);
		
		System.out.println("After adding mylist 2, Array list elements are "+mylist);
		
		// insert elemnet in between
		 
		mylist.add(3,'e');
		System.out.println("Array list elements are "+mylist);
		
		// modify the el;emnrt
		
		mylist.set(4, "welcome all");
		System.out.println("Array list elements are "+mylist);
		
		// access specific elemnt 
		Object ob=mylist.get(2);
		System.out.println(ob);
		
		// list empty checking
		
		System.out.println("emtyt or not list"+mylist.isEmpty());
		
		//read all elemnts
		
		
		Iterator it=mylist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		mylist.clear();
		
		System.out.println("emtyt or not list"+mylist.isEmpty());
		
		
		
		
		
		
		
		

	}

}
