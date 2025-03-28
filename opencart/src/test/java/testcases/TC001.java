package testcases;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

import Baseclass.baseClass;
import pageObjects.Accountregistration;
import pageObjects.BasePage;
import pageObjects.Homepage;



public class TC001 extends baseClass{
	
	

	@Test
	public void verify_account_registration() {
		Logger.info("*******tc001 testcase is started*******");
		Homepage hp=new  Homepage(driver);
		hp.clickmyaccount();
		Logger.info("*******account link clciked successfully*******");
		hp.clickregister();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		Accountregistration rp=new Accountregistration(driver);
		rp.setFirstname(randomstring());
		rp.setLastname(randomstring());
		rp.setEmail(randomstring());
		rp.setTelephone(randomnumber());
		String  pw=randomstring();
		rp.setPassword(pw);
		rp.setconfirmpassword(pw);
		Logger.info("*******tc001 finised successfully*******");
		
		
	}
}
