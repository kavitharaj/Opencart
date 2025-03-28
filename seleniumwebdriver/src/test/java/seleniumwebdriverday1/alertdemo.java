package seleniumwebdriverday1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mypage.rediff.com/");
		//List<WebElement> chkbox= driver.findElements(By.cssSelector("input[type='checkbox' and id='productTable']"));
		//List<WebElement> chkbox= driver.findElements(By.xpath("//*[@id='productTable']/tbody/tr[1]/td[4]/input"));
		//List<WebElement> chkbox= driver.findElements(By.xpath("//*[@id='productTable' and @type='checkbox']"));
		//for (WebElement chk:chkbox) {
		//	chk.click();
		//	chk.getText();
		//}
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//input[@type='submit' and @value=' Go ']")).click();
		/*
		 * Alert myalert=driver.switchTo().alert();
		 * System.out.println(myalert.getText())6; Thread.sleep(4000); myalert.accept();
		 */
         Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
         myalert.accept();
         
	}

}
