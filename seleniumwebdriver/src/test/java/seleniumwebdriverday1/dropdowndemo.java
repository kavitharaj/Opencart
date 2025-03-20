package seleniumwebdriverday1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdowndemo {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get(
		 * "https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/"
		 * );
		 * 
		 * WebElement
		 * countrylist=driver.findElement(By.xpath("//select[@id='country-list']"));
		 * Select county=new Select(countrylist); //county.selectByVisibleText("India");
		 * //county.selectByIndex(5); //county.selectByValue("3"); List<WebElement>
		 * option=county.getOptions(); System.out.println(option.size()); for(WebElement
		 * op:option) { System.out.println(op.getText());
		 * if(op.getText().equals("India")) { op.click(); } }
		 */
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")).click();
	    
	
	
	    
		
	    
	    

}
}