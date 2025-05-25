import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Miscellaneousactivities {

	
	public static void main(String[] args) throws IOException{
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //Example 1
	    //driver.get("http://google.com");
	    //File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    //FileUtils.copyFile(src,new File("C:\\Users\\Admin\\screenshot.png"));
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	    File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    FileUtils.copyFile(src,new File("C:\\\\Users\\\\Admin\\\\screenshot1.png"));
	    
	    
	    
	   /// Broken links -
	    
	    List <WebElement> urls =driver.findElements(By.tagName("a"));
	    System.out.println(urls.size());
	    for(WebElement link:urls) {
	    	String url =link.getAttribute("href");
	    	HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
	    	conn.setRequestMethod("Head");
	    	conn.connect();
	    	
	    	int resopnsecode =conn.getResponseCode();
	    	if(resopnsecode >=400) {
	    		System.out.println(resopnsecode + "Brokenlink");
	    	}
	    	else {
	    		System.out.println(resopnsecode + "non Brokenlink");
	    	}
	    }
	    
	    
	    
	    
	    
	    
	}
}
