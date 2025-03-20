package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver driver;
	
public BasePage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
}
}
