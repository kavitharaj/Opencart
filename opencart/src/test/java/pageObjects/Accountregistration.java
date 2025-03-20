package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Baseclass.baseClass;

public class Accountregistration extends BasePage {

	public Accountregistration(WebDriver driver2) {
		super(driver2);
	}

	// TODO Auto-generated constructor stub
	// input-firstname
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txt_firstnname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txt_lastname;

	@FindBy(xpath = "//input[@name='email']")
	WebElement txt_email;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txt_telephone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txt_password;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txt_confirmpassword;

	public void setFirstname(String fname) {
		txt_firstnname.sendKeys(fname);
	}

	public void setLastname(String lname) {
		txt_lastname.sendKeys(lname);
	}

	public void setEmail(String email) {
		txt_lastname.sendKeys(email);
	}

	public void setTelephone(String phone) {
		txt_telephone.sendKeys(phone);
	}

	public void setPassword(String passwd) {
		txt_telephone.sendKeys(passwd);
	}
	
	public void setconfirmpassword(String passwd) {
		txt_telephone.sendKeys(passwd);
	}
}
