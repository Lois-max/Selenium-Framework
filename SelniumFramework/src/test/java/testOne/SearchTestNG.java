package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTestNG {
	public static void main(String[] args) {
		
		Search();
	}

	public static void Search() {
		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath +"\\src\\test\\java\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.2.2");
		
		driver.findElement(By.className("textfield")).sendKeys("Automation");
		driver.findElement(By.className("button")).click();
		
		System.out.println("Test is successful");
	}
}
