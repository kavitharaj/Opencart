package testNgpackage;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testngpompattern {
	WebDriver driver;
	
	
testngpompattern(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver,this);
		//Actions act=new Actions(driver);

	}


	//By search_loc=By.xpath("//textarea[@name='q']");
	@FindBy(xpath="//textarea[@name='q']") WebElement search_loc;
 void sendsearchelement(String searchele) {
		//driver.findElement(search_loc).sendKeys(searchele);
		search_loc.sendKeys(searchele);
	}
	
	/*
	 * public void clickenter() {
	 * 
	 * act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform(); }
	 */
	public void quit() {
		driver.quit();
	}
	


}