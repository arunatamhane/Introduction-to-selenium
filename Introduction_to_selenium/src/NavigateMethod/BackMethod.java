package NavigateMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackMethod {
	public static void main(String[] args) {
		
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://fb.com");
		driver.get("https://instagram.com");
		
		driver.navigate().back();
	}

}
