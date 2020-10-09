package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().browserVersion("85.0").setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.2.2");
		//WebElement listOfInputElements = driver.findElement(By.xpath("//input"));
		

		WebElement textBox = driver.findElement(By.id("query"));
		textBox.sendKeys("Automation Testing");
		
		//Thread.sleep(3000);
		//driver.close();
		//driver.quit();
	}

}
