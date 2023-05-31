package NavigateMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ToMethod {
	public static void main(String[] args) throws MalformedURLException {
		
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//driver.navigate().to("https://fb.com");
		URL url=new URL("https://instagram.com");
		driver.navigate().to(url);
	}

}
