import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	    driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.id("password")).sendKeys("learning");
	    driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("okayBtn")).click();
	     WebElement options = driver.findElement(By.cssSelector("select.form-control"));
	     Select dropdown = new Select(options);
	     dropdown.selectByValue("consult");
	     driver.findElement(By.id("terms")).click();
	     driver.findElement(By.id("signInBtn")).click();
	     //Thread.sleep(5000);
	     WebDriverWait w =new WebDriverWait(driver, Duration.ofMillis(7000));
	     w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.my-4")))
	     
	     ;
	   
	     List <WebElement> Product = driver.findElements(By.cssSelector("button.btn-info"));
	     
	    for(int i = 0; i<Product.size();i++)
	    {
	    	Product.get(i).click();
	    	
	    }
	    driver.findElement(By.cssSelector("a.btn-primary")).click();
	     
	     
	  
	    

	}

}
