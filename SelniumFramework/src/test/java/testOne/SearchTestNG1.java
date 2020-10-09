package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configurations.PropertiesFile;

public class SearchTestNG1 {
	
	static WebDriver driver = null;
	public static String browserName = null; 
	
	@BeforeTest
	public void setUpTest() {
		
		String projPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projPath +"\\src\\test\\java\\driver\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		else {
			System.out.println("Browser non-existent");
		}
	}
	
	@Test
	public static void Search() {
		
		//url to go to
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.2.2");
		
		//Enter text into search textbox
		driver.findElement(By.className("textfield")).sendKeys("Automation");
		
		//Click on search button
		driver.findElement(By.className("button")).click();
		
	}
	
	@AfterTest
	public void tearDownTest() {
	
		//Close browser
		driver.close();
		driver.quit();
				
		System.out.println("Test is successful");
	}
}
