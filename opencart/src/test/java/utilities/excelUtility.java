package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class excelUtility {

	public static XSSFWorkbook workbook;
		   public static XSSFSheet sheet;
		   
		    public static XSSFCell cell;
		    String Path;

		   public excelUtility(String path) {
				// TODO Auto-generated constructor stub
			   this.Path=path;
			}


		public void setExcelFile(String excelFilePath,String sheetName) throws NoSuchMethodError,IOException {
			System.out.println("file readed start");
		       //Create an object of File class to open xls file
		     File file =    new File(excelFilePath);
		       
		       //Create an object of FileInputStream class to read excel file
		       FileInputStream inputStream = new FileInputStream(file);
		       
		       //creating workbook instance that refers to .xls file
		       workbook=new XSSFWorkbook(inputStream);
		       
		       //creating a Sheet object
		        sheet=workbook.getSheet(sheetName);

		   }

		    public String getCellData(int rowNumber,int cellNumber){
		       //getting the cell value from rowNumber and cell Number
		    	// DataFormatter df=new DataFormatter();
		        cell =sheet.getRow(rowNumber).getCell(cellNumber);
		      // String cellvalue=df.formatCellValue(cell);
		        //returning the cell value as string
		        return cell.getStringCellValue();
		    }

		    public int getRowCountInSheet(){
		       int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		       return rowcount;
		    }
		    
		    public int getcellCountInSheet(){
			       int colcount = sheet.getRow(1).getLastCellNum();
			       return colcount;
			    }

		    public void setCellValue(int rowNum,int cellNum,String cellValue,String excelFilePath) throws IOException {
		    	//creating a new cell in row and setting value to it      
		    	sheet.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);
		        
		    	FileOutputStream outputStream = new FileOutputStream(excelFilePath);
		    	workbook.write(outputStream);
		    }
		    
		    
		}

