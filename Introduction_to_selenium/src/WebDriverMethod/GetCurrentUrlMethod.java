package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
	public static void main(String[] args) {
		
		// open web browser
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://fb.com");
		
		//get current url
		String CurrentUrl=driver.getCurrentUrl();
		
		System.out.println(CurrentUrl);
		
	}

}
