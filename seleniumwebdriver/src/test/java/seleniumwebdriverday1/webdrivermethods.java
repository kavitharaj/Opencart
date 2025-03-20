package seleniumwebdriverday1;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {

	public static void main(String[] args) throws SessionNotCreatedException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		String windowid=driver.getWindowHandle();
		System.out.println("window id is"+ windowid);
		//driver.findElement(By.cssSelector("input#file-upload-button")).click();
		driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[3]/div[1]/label")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//label[@for='female']")).click();
		//boolean femalestatus=driver.findElement(By.xpath("//label[@for='female']")).isEnabled();
		//System.out.println("female enble status "+femalestatus);
		
		//boolean femaledisplaystatus=driver.findElement(By.xpath("//label[@for='female']")).isDisplayed();
		//System.out.println("female dispaly status "+femaledisplaystatus);
		//boolean nameenablestatus=driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).isEnabled();
        //System.out.println("name enable status"+ nameenablestatus);
        
		//driver.findElement(By.xpath("//label[@for='female']")).click();
		boolean maleselectstatus=driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[3]/div[1]/label")).isSelected();
		
		System.out.println("male selected status "+ maleselectstatus);
		
		driver.findElement(By.xpath("//label[text()='Sunday']")).click();
boolean sundayselectstatus=driver.findElement(By.xpath("//label[text()='Sunday']")).isSelected();
		
		System.out.println("male selected status "+ sundayselectstatus);
		
		
		
		

	}
}
