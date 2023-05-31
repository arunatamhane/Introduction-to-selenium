package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookieNamed {
	public static void main(String[] args) {

		//open the web browser
		WebDriver driver=new ChromeDriver();
		
		//open the application 
		driver.get("https://instagram.com");
		
		//add cookie
		Cookie ck=new Cookie("Abc","123");
		driver.manage().addCookie(ck);
		
		Set<Cookie> cooky=driver.manage().getCookies();
		for(Cookie single:cooky)
			System.out.println(single.getName());
		System.out.println("---------------------------------------------");
		
		driver.manage().deleteCookieNamed("Abc");
		
		cooky=driver.manage().getCookies();
        for(Cookie single:cooky)	
        	System.out.println(single.getName());


	}

}
