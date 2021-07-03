package multipleWindow;

import java.util.Set;

import org.apache.tools.ant.taskdefs.condition.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindow extends BaseClass{
	
	public static void main(String[] args) {
		LunchFirefox();
		WindowGUID.getUrl();
		switchWindow();
		teardownFirefox(); 
		
	}

	private static void switchWindow() {
		
		String parentGUID=driver.getWindowHandle();
		
		WebElement newWindowkBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
		newWindowkBtn.click();
		
		Set<String> allGUID=driver.getWindowHandles();
		System.out.println(allGUID);
		
		System.out.println("Total Window="+ allGUID.size());
		

		
		for(String ChildGUID:allGUID) {
			if(!ChildGUID.equals(parentGUID)) {
				driver.switchTo().window(ChildGUID);
				System.out.println("Child window Title :" + driver.getTitle());
				break;
			}
		}
		
		//switch to parent
		for(String ChildGUID:allGUID) {
			if(!ChildGUID.equals(parentGUID)) {
				driver.switchTo().window(parentGUID);
				System.out.println("After switch to parent window Title :" +driver.getTitle());
				break;
			}
		}
	}

}
