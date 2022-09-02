package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath,String  sheetName) {
		try {
		 workbook=new XSSFWorkbook(excelPath);
			
		 sheet=workbook.getSheet("Sheet1");
		
		}catch(Exception e) {
			e.getMessage();
			e.getCause();
			e.printStackTrace();
			
		}
		
		 
		
	}
	
	public static void main(String[] args) {
		//getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	
	
	public static int getRowCount() {
		int  rowCount=0;
		try {
		 
		 rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows counts"+rowCount);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			
			exp.printStackTrace();
		}
		return rowCount;
		
	}
	
	public static String getCellDataString(int rowNum,int colNum) {
		String cellData=null;
		try {
		
 
		   cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		  System.out.println( cellData);
		
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return  cellData;
		
	}
	public static void getCellDataNumber(int rowNum,int cellNum) {
		try {
		
 
		double cellData=sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		System.out.println(cellData);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public int getcolCount() {
		int colCount=0;
		try {
			 
			 colCount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows counts"+colCount);
			}catch(Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				
				exp.printStackTrace();
			}
		return colCount;
		
	}
}
