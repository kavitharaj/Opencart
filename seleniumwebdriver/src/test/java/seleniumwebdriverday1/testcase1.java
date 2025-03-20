package seleniumwebdriverday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class testcase1   {

	public static void main(String[] args) throws SessionNotCreatedException{
		// TODO Auto-generated method stub
		
		/* 1.launch broweser
		 *  2. open url
		 *  3. validate title 
		 *  4. close
		 *  
		 */
		
     WebDriver driver =new ChromeDriver();
    driver.get("https://www.flipkart.com/");
		//driver.get("https://www.google.co.in/");
     driver.manage().window().maximize();
     System.out.println(driver.getTitle());
     String act_title=driver.getTitle();
 //    if(act_title.equalsIgnoreCase("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
   // 	 System.out.println("test passed");
     //}
     //else {
    	// System.out.println("test failed");
     //}
		
		// 2.26.0
     // 131 
     
	//driver.findElement(By.name("q")).sendKeys("mac");
	
	
	//driver.findElement(By.className("_1ch8e_")).click();
	
	
    List<WebElement> linkcount=driver.findElements(By.tagName("a"));
	
	System.out.println(linkcount.size());
	
	//driver.findElement(By.linkText("Cart")).click();
	
	//try {
		//driver.findElement(By.partialLinkText("Car")).click();
	//}
	//catch(Exception e ) {
		//System.out.println("multiple items havimg this partiallink text");
	//}
	
	//driver.findElement(By.cssSelector("img._2puWtW")).click();
	
	//driver.findElement(By.cssSelector("img[alt='Grocery']")).click();
	//driver.findElement(By.cssSelector("img._2puWtW[alt='Grocery']")).click();
	
	//driver.findElement(By.cssSelector("._2puWtW")).click();
	
	//driver.findElement(By.cssSelector("[alt='Grocery']")).click();
	
	driver.findElement(By.cssSelector("._2puWtW[alt='Grocery']")).click();
	
	
	

	//*[@id="container"]/div/div[1]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[1]/form/input
	//html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[1]/form/input
	
	}
	
	


}
