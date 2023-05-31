package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {

		//open web browser
		WebDriver driver=new ChromeDriver();

		//open application
		driver.get("https://fb.com");

		Thread.sleep(3000);

		//quit all tab
		driver.quit();	

	}

}
