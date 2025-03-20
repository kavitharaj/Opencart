package testNgpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovide {
	WebDriver driver;
	@DataProvider(name="dp",indices= {0,1})
	Object testdata() {
		Object data[][]= {
				{"https://www.google.co.in/"},
				{"https://www.gmail.com/"}
			
				};
		return data;
	}
	
	
	@Test(dataProvider="dp")
	void launchurl(String url) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
		
		
	}
	

}
