package testNgpackage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class Allannotations {
	@Test
	void testmethod()
	{
		System.out.println("this is test method");
		
	}
	@Test(dependsOnMethods= {"softassertvalidation"})
	void validation()
	{
		int a=100;
		int b=20;
		if(b>a) {
			System.out.println("b is greater test passed");
			assertTrue(true);
			System.out.println("hi validation");
		}
		else
		{
			System.out.println("test failed");
			assertTrue(false);
			System.out.println("biii validation");
		}
	}
	@Test
	void softassertvalidation() {
		int a=100;
		int b=20;
		
		SoftAssert sa=new SoftAssert();
		if(b>a) {
			System.out.println("bis greater than a");
		sa.assertTrue(true);
		System.out.println("hii softassert");
	}
		else {
			sa.assertTrue(false);
			System.out.println("bii softassert");
		}
		sa.assertAll();
	}
	
	
	@BeforeTest
	void beforetestmethod()
	{
		System.out.println("this is before test method");
		
	}
	@AfterTest
	void aftertestmethod(){
	{
		System.out.println("this is after test method");
		
	}
	
	}
	@Test(groups= {"a","b"})
	void groupingab() {
		System.out.println("this a,b group");
	}
	@Test(groups= {"a"})
	void groupinga1() {
		System.out.println("this a1 group");
	}
	@Test(groups= {"a"})
	void groupinga2() {
		System.out.println("this a2 group");
	}
	@Test(groups= {"b"})
	void groupingb1() {
		System.out.println("this b1 group");
	}
	@Test(groups= {"b","a"})
	void groupingba() {
		System.out.println("this b a group");
	}
	
}
