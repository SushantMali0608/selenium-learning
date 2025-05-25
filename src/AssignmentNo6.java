import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo6 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    WebElement table= driver.findElement(By.id("product"));
	    //first method
	    //System.out.println(driver.findElements(By.xpath("//table[@name='courses'] /tbody/tr")).size());
	    //System.out.println(driver.findElements(By.xpath("//table[@name='courses'] /tbody/tr/th")).size());
	    //System.out.println(driver.findElement(By.xpath("//table[@name='courses'] /tbody/tr[3]/td[1]")).getText());
	    //System.out.println(driver.findElement(By.xpath("//table[@name='courses'] /tbody/tr[3]/td[2]")).getText());
	    //System.out.println(driver.findElement(By.xpath("//table[@name='courses'] /tbody/tr[3]/td[3]")).getText());
	    
	    //Second method using scope
	    
	    System.out.println(table.findElements(By.tagName("tr")).size());
	    System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	    List <WebElement> list1 = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	    
	    System.out.println(list1.get(0).getText());
	    System.out.println(list1.get(1).getText());
	    System.out.println(list1.get(2).getText());
	}
	
}
