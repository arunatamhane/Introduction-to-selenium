package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookies {
	public static void main(String[] args) {
		
		//open the Browser
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://instagram.com");
		
		Set<Cookie> ck=driver.manage().getCookies();
		for(Cookie single:ck)
			System.out.println(single.getName());
		System.out.println("------- --------- ---------- --------- -----------");
		
		
		//delete all cookies\
		driver.manage().deleteAllCookies();
		System.out.println(ck.size());
	}

}
