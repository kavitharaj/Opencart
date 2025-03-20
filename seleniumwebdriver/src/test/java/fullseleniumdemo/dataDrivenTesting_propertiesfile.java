package fullseleniumdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import com.google.common.base.Strings;

public class dataDrivenTesting_propertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdatafile\\config.properties");
		Properties objproperties=new Properties();
		objproperties.load(file);
		String url=objproperties.getProperty("url");
		String mail=objproperties.getProperty("mail");
		String pw=objproperties.getProperty("pw");
		System.out.println("url:"+url+"\t"+"Mail:"+mail+"\t"+"Password:"+pw);
		// read all keys
		Set<String> keynames=objproperties.stringPropertyNames();
		System.out.println("list of keys are :"+keynames);
		// read all values 
		
		Collection<Object> values=objproperties.values();
		System.out.println("List of values are :"+values);
		file.close();
		

	}

}

