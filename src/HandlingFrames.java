import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/droppable/");
//	    // to know how many frames available in webpage
//	    System.out.println(driver.findElements(By.tagName("iframe")).size());
//	    // frame by index number
//	    //driver.switchTo().frame(0);
//	    // frame by webElement
//	    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
//	    
//	    Actions a = new Actions(driver);
//	    WebElement Source = driver.findElement(By.id("draggable"));
//	    WebElement  Target = driver.findElement(By.id("droppable"));
//	    
//	    a.dragAndDrop(Source, Target).build().perform();
	    
	    //Practice
	    System.out.println(driver.findElements(By.tagName("iframe")).size());
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	    Actions a = new Actions(driver);
	    WebElement source = driver.findElement(By.id("draggable"));
	    WebElement target = driver.findElement(By.id("droppable"));
	    a.dragAndDrop(source, target).build().perform();
//	    driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//a[text()='Accordion']")).click();
	    
	    

	}
	
	

}
