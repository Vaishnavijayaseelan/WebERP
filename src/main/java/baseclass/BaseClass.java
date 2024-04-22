package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	

	public BaseClass() {
	
	try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\AdactinProject\\src\\main\\java\\com\\adactinproject\\qa\\config\\config.properties");
		    prop.load(ip);
		    
		    prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
		
	}
}
	
	
	@SuppressWarnings("deprecation")
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
		else if(browserName.equals("FF")) {
		System.setProperty("Webdriver.gecko.driver", "C:\\Softwares\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		}
		
		driver.get("http://etestingplatform.com/webERP/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
	
		
	}	

}
