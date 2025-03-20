package seleniumwebdriverday1;

import java.awt.Window;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		/*
		 * WebElement
		 * pointme=driver.findElement(By.xpath("//button[text()='Point Me']"));
		 * Thread.sleep(5000); WebElement
		 * mobiles=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		 * Thread.sleep(2000);
		 */
		Actions act = new Actions(driver);
		// act.moveToElement(pointme).moveToElement(mobiles).click().build().perform();

		/*
		 * WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		 * field1.clear(); field1.sendKeys("Kavitha"); WebElement
		 * copytext=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		 * act.doubleClick(copytext).build().perform(); / /* WebElement
		 * dragsrc=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		 * 
		 * WebElement dragtarget=driver.findElement(By.xpath("//div[@id='droppable']"));
		 * act.dragAndDrop(dragsrc, dragtarget).build().perform(); Thread.sleep(4000);
		 * act.dragAndDrop(dragsrc, dragsrc).build().perform();
		 */

		/*
		 * WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		 * field1.clear(); field1.sendKeys("Kavitha");
		 * act.keyDown(Keys.TAB).sendKeys("sussaransan").keyUp(Keys.TAB).perform();
		 * 
		 * System.out.println("location position is"+ field1.getLocation());
		 */
		/*
		 * file uplaod
		 * 
		 * WebElement fileupload =
		 * driver.findElement(By.xpath("//input[@id='singleFileInput']"));
		 * Thread.sleep(4000); fileupload.sendKeys("D:\\kavitha\\resume.txt");
		 */

		WebElement fileupload1 = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.body.style.zoom='80%'");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,3500)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		js.executeScript("arguments[0].scrollIntoView();", fileupload1);
		Thread.sleep(3000);
			
		System.out.println(js.executeScript("return window.pageYOffset;"));
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));

	}

}
