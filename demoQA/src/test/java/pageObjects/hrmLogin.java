package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class hrmLogin extends driverBasePage {

	public hrmLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement txt_username;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement txt_password;
	@FindBy(xpath = "//button[@type='submit']") WebElement btn_submit;

	
	
	public void send_username(String username) {
	   txt_username.sendKeys(username);
	}
	public void send_password(String password ) {
		txt_password.sendKeys(password);
		}
	public void click_submit() {
		btn_submit.click();
	}
	

}
