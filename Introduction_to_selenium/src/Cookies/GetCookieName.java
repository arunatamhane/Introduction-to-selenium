package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookieName {
	public static void main(String[] args) {
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://fb.com");
		
		Cookie single = driver.manage().getCookieNamed("fr");
		
		System.out.println(single);
	}

}
