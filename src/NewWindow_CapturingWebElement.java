import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow_CapturingWebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/angularpractice/");
	     
	     
	     driver.switchTo().newWindow(WindowType.WINDOW);
	     Set <String>handles =driver.getWindowHandles();
	     Iterator <String> it = handles.iterator();
	     String ParentWindow = it.next();
	     String ChildWindow =it.next();
	     driver.switchTo().window(ChildWindow);
	     driver.get("https://rahulshettyacademy.com/");
	     
	     String CourseName = driver.findElements(By.cssSelector("a[href ='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses']"))
	     .get(1).getText();
	     driver.switchTo().window(ParentWindow);
	     WebElement names = driver.findElement(By.cssSelector("[name='name']"));
	     names.sendKeys(CourseName);
	     
	     //capturing screenshot fspecific field
	     
	     File src = names.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(src,new File("logo.png"));
	     
	     //Getting dimensons (aheight and width)
	     
	     System.out.println(names.getRect().getDimension().getHeight());
	     System.out.println(names.getRect().getDimension().getWidth());
	     
	}

}
