import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filtertable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	    driver.findElement(By.id("search-field")).sendKeys("Rice");
	    List <WebElement> Filteredlist = driver.findElements(By.xpath("//tr/td[1]"));
	    
	    List <WebElement> list = Filteredlist.stream().filter(s->s.getText().contains("Rice"))
	    .collect(Collectors.toList());
	    
	    Assert.assertEquals(Filteredlist,list);
	    

	}

}
