package pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



public class driverBasePage{
WebDriver driver;

	
public driverBasePage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
}



}
