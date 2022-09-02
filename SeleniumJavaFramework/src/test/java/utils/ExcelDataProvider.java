package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	@Test(dataProvider="test1data")
	public void test1(String username,String password) {
		System.out.println(username+"|+password");
		
	}
	
	@DataProvider(name="test1data")
	public static void getData() {
		
		String excelPath="C:\\Users\\Vikash\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx";
		testData(excelPath, "Sheet1");
	}
	
	
	public static void testData(String excelPath,String sheetName) {
		ExcelUtils excel=new ExcelUtils(excelPath, sheetName);
		int rowCount=excel.getRowCount();
		int colCount=excel.getcolCount();
		
		Object data[]=new Object [rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String cellData=excel.getCellDataString(i, j);
				System.out.println(cellData+ "");
				
			}
		}
	}

}
