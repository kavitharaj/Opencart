package testCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.driverBasePage;
import pageObjects.hrmLogin;
import testBase.setupPage;

public class TC001_validloginpage extends setupPage {

	@Test
	public void verify_login() throws IOException {
		try {
             System.out.println("login page open");
			hrmLogin hrm = new hrmLogin(driver);
		
			hrm.send_username("Admin");
			hrm.send_password("admin123");
			hrm.click_submit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
