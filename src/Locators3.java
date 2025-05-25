import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get(("https://rahulshettyacademy.com/AutomationPractice/"));
	    System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
//	    WebElement drop = driver.findElement(By.id("dropdown-class-example"));
//	    Select dropdown =new Select(drop);
//	    dropdown.selectByIndex(2);
//	    
//	    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("in");
//	    List<WebElement> countrylist= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
//	    
//	    for(WebElement country:countrylist) {
//	    	if(country.getText().equalsIgnoreCase("India")) {
//	        country.click();  
//	    	break;
//	}
	    List<WebElement> totalcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    System.out.println(totalcheckbox.size());
}
}
