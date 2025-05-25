import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/");
	    driver.findElement(By.cssSelector("a[href='/windows']")).click();
	    driver.findElement(By.linkText("Click Here")).click();
	   String parentwindowhandle= driver.getWindowHandle();
	    Set <String> window =driver.getWindowHandles();
	    Iterator <String> it = window.iterator();
//	    String Parent = it.next();
//	    String Child =it.next();
//	    driver.switchTo().window(Child);
//	    System.out.println(driver.findElement(By.tagName("h3")).getText());
//	    driver.switchTo().window(Parent);
//	    System.out.println(driver.findElement(By.xpath("//div[@class='example'] /h3")).getText());
	    //driver.switchTo().window(Parent);
	    
	    while(it.hasNext()) {
	    	driver.switchTo().window(it.next());
	    	 System.out.println("ID : " + driver.getWindowHandle());
	    }
	    
	    
	    

	}

}
