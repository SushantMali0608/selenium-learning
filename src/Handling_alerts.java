import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(("https://rahulshettyacademy.com/AutomationPractice/"));
	    driver.findElement(By.id("name")).sendKeys("Sushant");
	    driver.findElement(By.id("alertbtn")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();

	}

}
