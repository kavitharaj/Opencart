package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[text()='My Account']") WebElement linkmyaccount;
	@FindBy(xpath="//*[text()='Register']") WebElement linkregister;
	
	public void clickmyaccount() {
		linkmyaccount.click();
	}
	public void clickregister() {
		linkregister.click();
	}

}
