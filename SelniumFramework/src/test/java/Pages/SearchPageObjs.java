package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPageObjs {
	//declarations
	WebDriver driver = null;
	
	//declaring locators
	By textboxSearch = By.id("query");
	By buttonSearch = By.className("button");
	
	public SearchPageObjs(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextInTextbox(String text) {
		driver.findElement(textboxSearch).sendKeys(text);
	}

	public void HitSearchButton() {
		driver.findElement(buttonSearch).sendKeys(Keys.RETURN);
	}
	
}
