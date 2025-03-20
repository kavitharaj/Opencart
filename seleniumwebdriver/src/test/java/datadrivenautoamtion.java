import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadrivenautoamtion {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdatafile\\blog.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("blog");
		int row=sheet.getLastRowNum();
		int cell=sheet.getRow(0).getLastCellNum();
		
		
		String name1=sheet.getRow(0).getCell(0).toString();
		String email1=sheet.getRow(0).getCell(1).toString();
		String phone1=sheet.getRow(0).getCell(2).toString();
		
		String name2=sheet.getRow(1).getCell(0).toString();
		String email2=sheet.getRow(1).getCell(1).toString();
		String phone2=sheet.getRow(1).getCell(2).toString();
		/*
		 * String name3=sheet.getRow(2).getCell(0).toString(); String
		 * email3=sheet.getRow(2).getCell(1).toString(); String
		 * phone3=sheet.getRow(2).getCell(2).toString();
		 */
		for(int i=0;i<=row;i++) {
			//for(int j=0;j<cell;j++) {
			WebElement name = driver.findElement(By.id("name"));
	        name.sendKeys(sheet.getRow(i).getCell(0).toString());
	        Thread.sleep(2000);
	        WebElement email = driver.findElement(By.id("email"));
	        email.sendKeys(sheet.getRow(i).getCell(1).toString());
	        Thread.sleep(2000);
	        WebElement phone = driver.findElement(By.id("phone"));
	        phone.sendKeys(sheet.getRow(i).getCell(2).toString());
	        Thread.sleep(2000);
	        
	        name.clear();
	        email.clear();
	        phone.clear();
	         
		//}
			}
		
		
	}

}
