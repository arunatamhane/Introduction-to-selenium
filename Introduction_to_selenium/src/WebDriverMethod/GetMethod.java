package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) {
		
		//open the driver
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://facebook.com");
	}

}
