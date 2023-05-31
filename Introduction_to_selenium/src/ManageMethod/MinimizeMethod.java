package ManageMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizeMethod {
	public static void main(String[] args) {
		
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://fb.com");
		
		//minimize window
		driver.manage().window().minimize();
	}

}
