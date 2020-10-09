package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchTestNG2 {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath +"\\src\\test\\java\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	@Test
	public static void Search2() {
		
		//url to go to
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.2.2");
		
		//Enter text into search textbox
		driver.findElement(By.className("textfield")).sendKeys("Automation");
		
		//Click on search button
		driver.findElement(By.className("button")).click();
		
	}
	
	@Test
	public static void Search3() {
		
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
