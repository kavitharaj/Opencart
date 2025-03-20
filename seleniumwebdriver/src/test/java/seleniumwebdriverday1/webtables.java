package seleniumwebdriverday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webtables {

	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		
		WebElement fromcity=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select frcity=new Select(fromcity);
		frcity.selectByVisibleText("Boston");
		
		WebElement tocity=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select tcity=new Select(tocity);
		tcity.selectByVisibleText("New York");
		

		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		int row=driver.findElements(By.tagName("tr")).size();
		System.out.println("size of rows is "+ row);
		
		
		int col=driver.findElements(By.tagName("th")).size();
		System.out.println("size of col is "+ col);
		
		List<WebElement> heading=driver.findElements(By.tagName("th"));
		for(int i=2;i<=row;i++) {
			//for (int j=1;j<=col;j++) {
				heading.get(i);
				
				
				
				
				
				
				/*
				 * String
				 * pricevalue=driver.findElement(By.xpath("/html/body/div[2]/table/")).getText()
				 * ; //pricevalue.get(i); //tr["+ i +"]/td["+ j +"]
				 * System.out.println(pricevalue);
				 */
			//}
		}
		
		
	
		
	
		
		
		
	}
}
