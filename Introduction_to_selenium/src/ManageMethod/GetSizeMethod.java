package ManageMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	public static void main(String[] args) {
		//open web browser
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://fb.com");
		
		System.out.println(driver.manage().window().getSize());
	}

}
