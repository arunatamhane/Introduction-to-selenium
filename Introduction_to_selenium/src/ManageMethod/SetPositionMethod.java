package ManageMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {
	public static void main(String[] args) throws InterruptedException {
		
		//open web browser
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://fb.com");
		Thread.sleep(3000);
		 
		Point pt=new Point(222,58);
		driver.manage().window().setPosition(pt); //it set the position x ,y coordinate
	}

}
