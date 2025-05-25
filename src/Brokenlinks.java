import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    List <WebElement> links =driver.findElements(By.cssSelector(""
	    		+ ""));
	    //new concept Soft assert
	    SoftAssert a=new SoftAssert();
	    
	    
	    for(WebElement link:links) {
	    	String url = link.getAttribute("href");
	    	HttpURLConnection conn =(HttpURLConnection) new URL (url).openConnection();
	 	   conn.setRequestMethod("HEAD");
	 	   conn.connect();
	 	   int responseCode =conn.getResponseCode();
	 	   System.out.println(responseCode);
	 	   a.assertTrue(responseCode<400 ,"The link with Text"+link.getText()+" is broken with code" +responseCode);
	    }
	    
	    a.assertAll();
	    
	    // for single link
	  // String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
	   
	   //HttpURLConnection conn =(HttpURLConnection) new URL (url).openConnection();
	   //conn.setRequestMethod("HEAD");
	   //conn.connect();
	   
	   //int responseCode =conn.getResponseCode();
	   //System.out.println(responseCode);

	}

}
