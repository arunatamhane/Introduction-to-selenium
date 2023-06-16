package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\Qspider\\Selenium\\HTML\\form.html");
		WebElement ww=driver.findElement(By.xpath("//input[@value='B']"));
		ww.clear();
			
	}

}
