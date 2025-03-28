package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {

	public Homepage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[text()='My Account']") WebElement linkmyaccount;
	@FindBy(xpath="//*[text()='Register']") WebElement linkregister;
	@FindBy(xpath="//*[text()='Login']") WebElement linkLogin;

	
	
	public void clickmyaccount() {
		linkmyaccount.click();
	}
	public void clickregister() {
		linkregister.click();
	}
	public void clicklogin() {
		linkLogin.click();
	}


	
}

