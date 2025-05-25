import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	    driver.findElement(By.cssSelector(".blinkingText")).click();
	    
	    Set <String> windows= driver.getWindowHandles();
	    
	   Iterator <String> it =windows.iterator();
	   String Parent =it.next();
	   String Child=it.next();
	   driver.switchTo().window(Child);
	   System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	   driver.findElement(By.cssSelector(".im-para.red")).getText();
	   String Email_id = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	   driver.switchTo().window(Parent);
	   driver.findElement(By.id("username")).sendKeys(Email_id);
	    
	   //Practise
	    
//	    driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
//	   Set<String> window = driver.getWindowHandles();
//	   Iterator<String> it =window.iterator();
//	   String Parent =it.next();
//	   String Child =it.next();
//	   driver.switchTo().window(Child);
//	   WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
//	   w.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("logo"))));
//	   
//	   String paragraph =driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
//	   System.out.print(paragraph);
//	   driver.switchTo().window(Parent);
//	   
	   
	    
	    
	   
	   
	   
	    
	    

	}

}
