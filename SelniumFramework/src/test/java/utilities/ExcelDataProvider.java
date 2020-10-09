package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configurations.PropertiesFile;

public class ExcelDataProvider {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		System.setProperty("webdriver.chrome.driver", projPath +"\\src\\test\\java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
	
	
	@Test(dataProvider="test1data")
	public void test1(String username, String password) {
		System.out.println(username + " | " + password);
		
driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		//Enter text into search textbox
		driver.findElement(By.id("username")).sendKeys(username);
		
		//Click on search button
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@DataProvider(name = "test1data")
	public static Object [][] getData() {
		String excelPath = "C:\\maven\\SelniumFramework\\Excel\\data.xlsx";
		Object data [][]= testData(excelPath, "Sheet1");
		return data;
	}
	
	public static Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data [][] = new Object[rowCount-1][colCount];
		
		for (int i=1; i<rowCount; i++) {
			for (int j=0; j<colCount;j++) {
				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData + " | ");
				data[i-1][j]=cellData;
			}
			System.out.println();
		}
		return data;
	}

}
