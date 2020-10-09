package testOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.SearchPageObjs;

public class SearchPageTest2 {
	
	public static void main(String[] args) {
		SearchTest2();
	}
	static WebDriver driver = null;

	public static void SearchTest2() {
		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath +"\\src\\test\\java\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		SearchPageObjs search= new SearchPageObjs(driver);
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.2.2");
		search.setTextInTextbox("Web Drivers");
		search.HitSearchButton();
		
		driver.close();
		
	}
}
