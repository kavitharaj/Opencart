package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PIM extends driverBasePage {
   
	public PIM(WebDriver driver2) {
		super(driver2);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[normalize-space()='PIM']")
	WebElement menu_pim;

	@FindBy(xpath ="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--focus']//input[@placeholder='Type for hints...'] ")
	public
	WebElement txt_employername;

	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	public WebElement txt_employerid;

	/*
	 * @FindBy(xpath = "//div[class='	oxd-select-wrapper']") WebElement
	 * combo_employerstatus; Select drpempstatus=new Select(combo_employerstatus);
	 * public void getemployerstatus(int index) { drpempstatus.selectByIndex(index);
	 * }
	 */

	public void click_pim() {
		
		
		menu_pim.click();
		System.out.println("pim menu clicked");
	}

	public void send_employername(String empname) {	
		
	
		txt_employername.sendKeys(empname);
	}

	public void send_employerid(String empid) {
		
		txt_employerid.sendKeys(empid);
	}

	// input[@class='oxd-input oxd-input--focus']
}
