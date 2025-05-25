

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(("http://google.com"));
	    driver.navigate().to("https://rahulshettyacademy.com");
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.manage().deleteAllCookies();
	    driver.manage().deleteCookieNamed(null);
	    
	}
}
