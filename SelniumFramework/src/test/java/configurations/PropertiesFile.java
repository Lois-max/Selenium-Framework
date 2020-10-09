package configurations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import testOne.SearchTestNG;
import testOne.SearchTestNG1;

public class PropertiesFile {
	static Properties props = new Properties();

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties() {

		try {
			
			//String projPath = System.getProperty("user.dir");

			//InputStream input = new FileInputStream(projPath + "src/test/java/configurations/configurations.properties");
			InputStream input = new FileInputStream("C:\\maven\\SelniumFramework\\src\\test\\java\\configurations\\configurations.properties");
			try {
				props.load(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
			String browser= props.getProperty("browser");
			System.out.println(browser);
			SearchTestNG1.browserName= browser;

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream("C:\\maven\\\\SelniumFramework\\src\\test\\java\\configurations\\configurations.properties");
			props.setProperty("browser", "ie");
			try {
				props.store(output, null);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}
