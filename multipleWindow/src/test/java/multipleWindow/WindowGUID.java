package multipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowGUID extends BaseClass {

	public static void main(String[] args) {
		
		LunchFirefox();
		getUrl();
		getGUID();
		teardownFirefox();
	}

	private static void getGUID() {
	
		//Single window
		//	String parentGUID=driver.getWindowHandle();
	//System.out.println(parentGUID);
	
	WebElement clickBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
	clickBtn.click();
	
	//MultipleWindow
	Set<String> allGUID=driver.getWindowHandles();
	System.out.println(allGUID);
	System.out.println("Total Window="+ allGUID.size());
	}

	static void getUrl() {
		driver.get("https://the-internet.herokuapp.com/windows");
		
	}
	

}
