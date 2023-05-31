package NavigateMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForwardMethod {
	public static void main(String[] args) {
		
		//open web browser
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://fb.com");
		
		driver.navigate().forward();
		
		
		driver.get("https://instagram.com");
	}

}
