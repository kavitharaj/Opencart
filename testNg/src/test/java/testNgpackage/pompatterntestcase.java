package testNgpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pompatterntestcase {
	WebDriver driver;
	@Test
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	void sendsearch() {
		testngpompattern tpn=new testngpompattern(driver);
		tpn.sendsearchelement("gmail");
		//tpn.clickenter();
	}
	


}
