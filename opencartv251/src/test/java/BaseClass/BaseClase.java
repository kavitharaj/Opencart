package BaseClass;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClase {
	public WebDriver driver;
	public Logger Logger;
	
@BeforeClass
public void setup() {
/*
 * @Parameters({"browser"}) public void setup(String br) { switch(br) { case
 * "chrome": driver=new ChromeDriver(); break; case "edge": driver=new
 * EdgeDriver(); break;
 * 
 * }
 */
	
	Logger=LogManager.getLogger(this.getClass());
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
}
@AfterClass
public void teardown() {
	driver.quit();

	
}

public String randomstring() {
	String generatestring=RandomStringUtils.randomAlphabetic(10);
	return generatestring;
	
}
public String randomnumber() {
	String generatenumber=RandomStringUtils.randomNumeric(10);
	return generatenumber;
	
}
}
