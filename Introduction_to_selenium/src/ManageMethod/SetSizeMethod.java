package ManageMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {
	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://fb.com");
		Dimension d=new Dimension(1234,4568);
		driver.manage().window().setSize(d); // it change the size (widht ,height) broswer
	}

}
