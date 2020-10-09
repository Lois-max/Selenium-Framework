package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook; 
	static XSSFSheet sheet;

	//Constructor
	public ExcelUtils (String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		sheet = workbook.getSheet(sheetName);

	}

	//Main method
	public static void main(String[] args) {
		//getRowCount();
		//getColCount();
		//getCellDataString( 0,0);
		//getCellDataNumeric(1,1);

	}

	//Method 1
	public static int getRowCount() {

		int rowCount = 0;
		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows is : "+ rowCount);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowCount;

	}
	
	//Method 2
	public static String getCellDataString(int rowNum, int colNum) {

		String cellData = null;
		try {

			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;
	}

	//Method 3
	public static void getCellDataNumeric(int rowNum, int colNum) {

		try {

			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

	//Method 4
	public static int getColCount() {
		
		int colCount=0;
		try {

			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of cols is : "+ colCount);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colCount;
		
	}

}
