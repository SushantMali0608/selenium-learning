import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    // Finding total number of links on page
	    System.out.println(driver.findElements(By.tagName("a")).size());
	    
	    // Finding number of inks in footer only
	    WebElement Footerdriver = driver.findElement(By.id("gf-BIG"));
	    System.out.println(Footerdriver.findElements(By.tagName("a")).size());
	    
	    //limiting footer scope
	    
	    WebElement columndriver =Footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(columndriver.findElements(By.tagName("a")).size());
	    
	    // clicking on each link in footer and opening in new tab.
	    
	    for(int  i=1 ;i<columndriver.findElements(By.tagName("a")).size();i++) {
	    	
	    	
	    	//clicking on each link in footer
	    	//columndriver.findElements(By.tagName("a")).get(i).click();
	    	
	    	//opening each linkin new tab by pressing ctrl buttton
	    	String Clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	columndriver.findElements(By.tagName("a")).get(i).sendKeys(Clickonlink);
	    }
	    	
	    	//Getting title for all windows
	    	Set<String> abc = driver.getWindowHandles();
	    	Iterator <String> it = abc.iterator();
	    	while(it.hasNext()) {
	    		driver.switchTo().window(it.next());
	    		System.out.println(driver.getTitle());
	    	}
	    	
	    	
	    	
	    	
	    	
	    
	    

	}

}
