package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://fb.com");
		Thread.sleep(3000);
		
		//close first tab
		driver.close(); 
	}

}
