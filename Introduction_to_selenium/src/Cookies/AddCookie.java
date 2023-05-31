package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookie {
	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://fb.com");
		Cookie cooky = new Cookie("key","value");
		driver.manage().addCookie(cooky);
		System.out.println(cooky);
	}

}
