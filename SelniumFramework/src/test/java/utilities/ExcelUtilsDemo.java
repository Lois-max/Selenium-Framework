package utilities;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		ExcelUtils excel = new ExcelUtils("C:\\maven\\SelniumFramework\\Excel\\data.xlsx", "Sheet1");

		excel.getRowCount();
		excel.getCellDataString(0,0);
		excel.getCellDataNumeric(1,1);
	}

}
