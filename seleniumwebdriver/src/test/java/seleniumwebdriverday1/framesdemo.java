package seleniumwebdriverday1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesdemo {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		//WebElement frame5=driver.findElement(By.xpath("//form[@name='name5']"));
		//driver.switchTo().frame(frame5);
		//driver.findElement(By.xpath("//input[@name='mytext5'")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("selenium");
		driver.findElement(By.linkText("https://a9t9.com")).click();
		//driver.switchTo().frame(0);
		
		System.out.println(driver.getWindowHandle());
		Set<String> winid=driver.getWindowHandles();
		List<String> windowlist=new ArrayList<String>(winid);
		for (String win:windowlist) {
			String title=driver.switchTo().window(win).getTitle();
			System.out.println(title);	
		}
		
		//driver.findElement(By.linkText("OCR")).click();
		
		
		
		
	}
	

}
