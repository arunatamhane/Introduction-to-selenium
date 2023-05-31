package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) {
		
		//open the driver
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://fb.com");
		
		String title = driver.getTitle(); //get title from application 
		System.out.println(title); // print title
	}

}
