package ManageMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenMethod {
	public static void main(String[] args) {
		
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://fb.com");
		
		//fullscreen 
		driver.manage().window().fullscreen();
	}

}
