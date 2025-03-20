package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountpage extends BasePage {

	public Myaccountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//h2[text()='My Account']") 
	WebElement head_myaccount;
	
	@FindBy(xpath="//a[text()='Logout']") 
	WebElement click_logout;
	
	public boolean ismyAccountexists() {
		if(head_myaccount.isDisplayed()==true) {
			return true;
		}
		else {
		return false;
	}
	}
	public void clicklogout() {
		click_logout.click();
		
	}

}
