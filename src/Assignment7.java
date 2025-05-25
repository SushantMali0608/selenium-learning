import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
	    String abc = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
	    System.out.println(abc);
	    
	    // static dropdown
	    
	    WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
	    
	   Select option = new Select(dropdown);
	   option.selectByVisibleText(abc);
	   
	   // switching to alert
	   
	   driver.findElement(By.id("name")).sendKeys(abc);
	   driver.findElement(By.id("alertbtn")).click();
	   
	   String alertText = driver.switchTo().alert().getText().split(",")[0].split(" ")[1];
	   System.out.println(alertText);
	   if (alertText.contains(abc)) {
	   	System.out.println("testcase passed");
	    }
	   else{
		   System.out.println("Something went wrong");
	   }
	   
	 
	   
	   
	   
	   
	   
	   
	   
	   
	 
	    
	    
	    
	    

	}

}
