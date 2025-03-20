package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends  BasePage {

	public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txt_loginemail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txt_loginpassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement txt_loginsubmit;
	
	public void setemail(String Email) {
		txt_loginemail.sendKeys(Email);
	}
	public void setpassword(String Password) {
		txt_loginpassword.sendKeys(Password);
	}
	public void clicksubmit() {
		txt_loginsubmit.click();
		
	}
}
