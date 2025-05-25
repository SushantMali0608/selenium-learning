import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_Revised {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");	    
	    //static dropdown
	     WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	      Select option = new Select(dropdown);
	      option.selectByValue("USD");
	      
	      // Multiclick in dropdown
	       driver.findElement(By.xpath("//div[@class= 'paxinfo']")).click();
	       Thread.sleep(2000);
	       int i = 1;
	       while(i<5) {
	    	  driver.findElement(By.id("hrefIncInf")).click();
	       i++;
	       }
	       driver.findElement(By.id("btnclosepaxoption")).click();
	      
	      
	      // dropdown
	       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	       driver.findElement(By.cssSelector("a[value='GAU']")).click();
           //driver.findElement(By.xpath("(// a[@value='GOI'])[2]")).click();
	       driver.findElement(By.xpath("// div[@id ='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
	       
	       
	      
	    
	    
	    

	}

}
