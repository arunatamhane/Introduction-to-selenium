package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://terna.qualcampus.com/Account/LogOn");
			WebElement web=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			System.out.println(web.isEnabled());
		
		  driver.quit();
		
	}

}
