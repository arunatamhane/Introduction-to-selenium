package Cookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookie {
	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://fb.com");
		
		//add cookie
		Cookie ck=new Cookie("a","b");
		driver.manage().addCookie(ck);
		
		Set<Cookie> s =driver.manage().getCookies();
	    for(Cookie single:s)
	    	System.out.println(single.getName());
	    System.out.println("------ ---------- ---------- -------------");
	    
	    driver.manage().deleteCookie(ck);
	    s =driver.manage().getCookies();
	    for(Cookie single:s)
	    	System.out.println(single.getName());
		
		
	}

}
