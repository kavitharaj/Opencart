package seleniumwebdriverday1;

import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {
	public static void main(String[] args) throws SessionNotCreatedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//driver.get("https://www.demo.OpenCart.com/");
		// driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//*[@name='q']")).sendKeys("mobiles");
		//driver.findElement(By.xpath("//input[@name='q' and @class='Pke_EE']")).sendKeys("mobiles");
		//findElement(By.xpath("//input[@name='q' or @class='Pke_EE']")).sendKeys("mobiles");
		
		//driver.findElement(By.xpath("//input[@name='q'][@class='Pke_EE']")).sendKeys("mobiles");
		
		//driver.findElement(By.xpath("//input[contains(@class,'Pke_EE')]")).sendKeys("mobiles");

		//driver.findElement(By.xpath("//input[contains(@class,'e_EE')]")).sendKeys("mobiles");

		//driver.findElement(By.xpath("//input[starts-with(@class,'Pke_EE')]")).sendKeys("mobiles");

		//driver.findElement(By.xpath("//input[starts-with(@class,'Pke')]")).sendKeys("mobiles");
		
		// driver.findElement(By.xpath("//input[starts-with(@class,'ke')]")).sendKeys("mobiles"); //wrong
		
		
		 driver.findElement(By.xpath("//input[@name='otracker'/parent::*]")).sendKeys("mobiles");
		
		
	}
	
}