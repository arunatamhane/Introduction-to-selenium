package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) {
		
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://fb.com");
		
		//get page source nothing but the html code 
		String source=driver.getPageSource();
		System.out.println(source);
		
	}

}
