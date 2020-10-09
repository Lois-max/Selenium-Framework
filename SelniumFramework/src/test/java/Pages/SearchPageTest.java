package Pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.SearchPage;

public class SearchPageTest {
	static WebDriver driver = null;
	public static void main(String[] args) {
		
		Search();
	}

	public static void Search() {
		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath +"\\src\\test\\java\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.2.2");
		
		SearchPage.Searchbox(driver).sendKeys("Automation");
		SearchPage.Button(driver).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.className("textfield")).sendKeys("Automation");
		//driver.findElement(By.className("button")).click();
		
		System.out.println("Test is successful");
	}
}
