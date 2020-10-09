import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	public static void main (String [] args) {
		
		String projPath = System.getProperty("user.dir");
		System.out.println("project path is: "+ projPath);
		System.setProperty("webdriver.chrome.driver", projPath +"\\src\\test\\java\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/");
	}

}
