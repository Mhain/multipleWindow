package multipleWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

static WebDriver driver;
	
	public static void LunchFirefox() {
		
		//Firfox
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	public static void LunchChrome() {
		
	 	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void teardownFirefox() {
		if (driver!=null) {
			driver.quit();
		}
		else
			System.out.println("No driver found");
		
	}

	public static void teardownChrome() {
		
		if (driver!=null) {
			driver.close();
		}
		else
			System.out.println("No driver found");
		 
	}

}
