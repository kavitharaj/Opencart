package testCases;

import org.testng.annotations.Test;

import pageObjects.PIM;
import pageObjects.hrmLogin;
import testBase.setupPage;

public class TC003_PIMclass extends setupPage {
	@Test
	public void verify_pim() {
		try {
			System.out.println("login page open");
			hrmLogin hrm = new hrmLogin(driver);

			hrm.send_username("Admin");
			hrm.send_password("admin123");
			hrm.click_submit();

			PIM pim = new PIM(driver);
			pim.click_pim();
			act.click(pim.txt_employername).build().perform();
			pim.send_employername("kavi");
			System.out.println(pim.txt_employername.getText());
			act.click(pim.txt_employerid).build().perform();
			pim.send_employerid("id1");
			System.out.println(pim.txt_employerid.getText());
			//pim.getemployerstatus(2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
