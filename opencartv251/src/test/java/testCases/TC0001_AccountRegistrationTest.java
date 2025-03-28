package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import BaseClass.BaseClase;
import pageObjects.AccountRegistratioPage;
import pageObjects.HomePage;

public class TC0001_AccountRegistrationTest extends BaseClase{

	@Test
	public void verify_account_registration() {
		Logger.info("*******tc001 testcase is started*******");
		HomePage hp=new  HomePage(driver);
		hp.clickmyaccount();
		Logger.info("*******account link clciked successfully*******");
		hp.clickregister();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		AccountRegistratioPage rp=new AccountRegistratioPage(driver);
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
