package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookies {
	public static void main(String[] args) {
		//open web browser
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://fb.com");
		
		Set<Cookie> ck=driver.manage().getCookies();
		System.out.println(ck.size());
		for(Cookie singleCookie:ck)
			System.out.println(singleCookie.getName());
		
		
	}

}
