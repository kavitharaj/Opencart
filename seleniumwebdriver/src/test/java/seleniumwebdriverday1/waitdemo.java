package seleniumwebdriverday1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitdemo {


	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // implicit wait
		// driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("kavitha");
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement txtname=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"name\"]")));
		txtname.sendKeys("kavitha");
		
		
	}
}
