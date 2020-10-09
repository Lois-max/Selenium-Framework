package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	static WebElement element = null;

	public static WebElement Searchbox (WebDriver driver) {
		element = driver.findElement(By.className("textfield"));
		return element;
		
	}
	
	public static WebElement Button (WebDriver driver) {
		element = driver.findElement(By.className("button"));
		return element;
		
	}

}
