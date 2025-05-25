

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    Actions a= new Actions(driver);
//	    
//	     WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
//	    //move to sepific element
//	    a.moveToElement(move).build().perform();
//	    a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//	    a.moveToElement(move).contextClick().build().perform();
//	    
//	    Actions a=new Actions(driver);
//	    driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']")).click();
//	    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//	    a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("Sushant").build().perform();
	    a.moveToElement(driver.findElement(By.id("email"))).click().keyDown(Keys.SHIFT).sendKeys("Sushant");
	    
	    		}
	
	
	

}
