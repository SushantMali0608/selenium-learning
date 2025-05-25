import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_ScrollingInPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	   JavascriptExecutor js =(JavascriptExecutor)driver;
//	   js.executeScript("window.scrollBy(0,500)");
//	   int sum =0;
//	 List<WebElement> value =(driver.findElements(By.cssSelector(".table-display td:nth-child(3)")));
//	 for( int i=0;i<value.size();i++) {
//		 sum = sum +Integer.parseInt(value.get(i).getText());
//		 
//	 }
	 
	 WebElement name = driver.findElement(By.id("name"));
	  js.executeScript("arguments[0].value='sushant';",name);
	  
		 WebElement mousehover = driver.findElement(By.id("mousehover"));
	  
		 js.executeScript("arguments[0].scrollIntoView(true);", mousehover);
	  driver.close();
	 
//	 System.out.println(sum);		
	   
	}

}
