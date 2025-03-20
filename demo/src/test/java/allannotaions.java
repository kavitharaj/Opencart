import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allannotaions {
@BeforeTest
	void beforemethod() {
		System.out.println("this is before method annoation.....");
	}
@Test(priority=1)
void Test1() {
	System.out.println("this is Test1 annoation.....");
}

@Test(priority=0)
void Test2() {
	System.out.println("this is Test2 annoation.....");
}
/*
 * @Test void Test2() { System.out.println("this is Test2 annoation....."); }
 * 
 * @Test void Test3() { System.out.println("this is Test3 annoation....."); }
 */
@AfterTest
void beforemethod1() {
	System.out.println("this is after method annoation.....");
}




}
