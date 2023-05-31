package ManageMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionMethod {
	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://fb.com");
		
		//getposotion of current window
		System.out.println(driver.manage().window().getPosition());
		
	}

}
