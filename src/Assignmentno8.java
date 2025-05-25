import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentno8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   WebElement ind = driver.findElement(By.id("autocomplete"));
	    Thread.sleep(2000);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    System.out.println(driver.findElement(By.id("autocomplete")).getText());
	    
//	    //JavascriptExecutor Js =(JavascriptExecutor)driver;
//	    JavascriptExecutor js =(JavascriptExecutor)driver;
//	    js.executeScript("arguments[0].value='Cognizent'",ind);
	
	          
	     
	    }

	}


