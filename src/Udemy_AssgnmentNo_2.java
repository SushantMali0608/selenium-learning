import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Udemy_AssgnmentNo_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(("https://rahulshettyacademy.com/angularpractice/"));
	    driver.findElement(By.xpath("//input[contains(@minlength,'2')]")).sendKeys("Sushant");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sushantmali@gmail.com");
	    driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password");
	    driver.findElement(By.id("exampleCheck1")).click();
	    WebElement option= driver.findElement(By.id("exampleFormControlSelect1"));
	    
	    Select Dropdown = new Select(option);
	    Dropdown.selectByIndex(0);
	    driver.findElement(By.id("inlineRadio1")).click();
	    driver.findElement(By.xpath("//input[@type='date']")).click();
	    driver.findElement(By.xpath("//input[@type='date']")).sendKeys("06081999");
	    driver.findElement(By.cssSelector("input[type='submit']")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.cssSelector("Div[class='alert alert-success alert-dismissible']")).getText());
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
