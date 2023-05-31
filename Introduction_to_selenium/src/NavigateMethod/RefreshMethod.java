package NavigateMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshMethod {
	public static void main(String[] args) throws InterruptedException {

		//open browser
		WebDriver driver=new ChromeDriver();

		//open application
		driver.get("https://fb.com");
		
		Thread.sleep(3000);

		//refresh the page
		driver.navigate().refresh();

	}

}
