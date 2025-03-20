package oopsprogrampractice;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class hashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap();

		hm.put(101, "sus");
		hm.put(102, "saran");
		hm.put(103, "sasmitha");
		hm.put(104, "saran");
		hm.put(104, "ajaysabari");
		System.out.println("hasp map" + hm);

		System.out.println("size " + hm.size());
		System.out.println("size " + hm.isEmpty());

		System.out.println("key " + hm.keySet());
		System.out.println("value " + hm.values());
		System.out.println("key - value " + hm.entrySet());

		for (Object k : hm.keySet()) {

			System.out.println(k);

		}
		
		Iterator<java.util.Map.Entry<Integer, String>> it=hm.entrySet().iterator();
		while(it.hasNext()) {
		Map.Entry en=it.next();
		System.out.println(en);
		}
		
		

	}

}
