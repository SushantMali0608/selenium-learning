import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.Assert;


//TESTNG Framework Assertion Uses
public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		 int i = 1;
		 while(i<5) {
			 driver.findElement(By.id("hrefIncAdt")).click();
			 i++;
			 
		 }
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 
		// Dynamic dropdown
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@value='GWL']")).click();
		// driver.findElement(By.xpath("(//a[@value='IXJ'])[2]")).click();
		 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		 
		 //Automating calender- current date selected
		 
		 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		 
		 // Checkbox automation  with testNG framework-
	     Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		 //System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isEnabled());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		
		
	 
		
		
		
		 

	}

}
