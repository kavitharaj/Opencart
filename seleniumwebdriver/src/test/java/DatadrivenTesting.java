import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenTesting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// read data from excel
		
		/*
		FileInputStream file=new FileInputStream("D:\\kavitha\\eclips_project\\seleniumwebdriver\\testdatafile\\Zedblock_bugreport.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet3");
		int row=sheet.getLastRowNum();
		int col=sheet.getRow(1).getLastCellNum();
		System.out.println("total rows: "+row);
		System.out.println("total cols : "+col);
		for(int i=0;i<=row;i++) {
			XSSFRow currentrow=sheet.getRow(i);
		       for (int j=0;j<col;j++) {
		    	   XSSFCell currentcell=currentrow.getCell(j);
		    	   System.out.print(currentcell.toString()+"\t");
		       }
		   	System.out.println();
		}
	
		workbook.close();
		file.close();
		*/
		/*
		//write data into excel
		FileOutputStream fileout=new FileOutputStream(System.getProperty("user.dir")+"\\testdatafile\\writemyfile.xlsx");
		
		XSSFWorkbook outworkbook=new XSSFWorkbook();
		XSSFSheet outsheet= outworkbook.createSheet("personal details");
		XSSFRow rowout0=outsheet.createRow(0);
		rowout0.createCell(0).setCellValue("Name");
		rowout0.createCell(1).setCellValue("Age");
		rowout0.createCell(2).setCellValue("Mobile");
		rowout0.createCell(3).setCellValue("Address");
		
		XSSFRow rowout1=outsheet.createRow(1);
		rowout1.createCell(0).setCellValue("Anu");
		rowout1.createCell(1).setCellValue("29");
		rowout1.createCell(2).setCellValue("8765432189");
		rowout1.createCell(3).setCellValue("4/76,chennai");
		
		XSSFRow rowout2=outsheet.createRow(2);
		rowout2.createCell(0).setCellValue("Akash");
		rowout2.createCell(1).setCellValue("31");
		rowout2.createCell(2).setCellValue("985489145");
		rowout2.createCell(3).setCellValue("3/101,Madurai");
		
		outworkbook.write(fileout);
		outworkbook.close();
		fileout.close();*/
		
	FileOutputStream fileoutdynamic=new FileOutputStream(System.getProperty("user.dir")+"\\testdatafile\\writemyfile_dynamic.xlsx");
		
		XSSFWorkbook outworkbookdynamic=new XSSFWorkbook();
		XSSFSheet outsheetdynamic= outworkbookdynamic.createSheet("personal details");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows?");
		int rows=sc.nextInt();
		System.out.println("enter number of cells?");
		int cells=sc.nextInt();
		for(int i=0;i<=rows;i++) {
			XSSFRow currentrow=outsheetdynamic.createRow(i);
			for(int c=0;c<cells;c++) {
				XSSFCell cell=currentrow.createCell(c);
				cell.setCellValue(sc.next());
				
			}
		}
		outworkbookdynamic.write(fileoutdynamic);
		outworkbookdynamic.close();
		fileoutdynamic.close();
		
		
		
		
		
				
		

	}

}
