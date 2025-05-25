import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicjavaquestion {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] veggies={"Brocolli","Cucumber","Beetroot"};
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	    addItems(driver,veggies);
	    
	    driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	    driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	    driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.cssSelector("button.promoBtn")).click();
	 
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	    
	    
	}

public static void addItems(WebDriver driver,String[] veggies) {
	List <WebElement> Productname= driver.findElements(By.xpath("//h4[@class='product-name']"));
    
	for(int i=0;i<Productname.size();i++)
	{
		int j=0;
		 String[] name =Productname.get(i).getText().split("-");
		  String Formattedname =name[0].trim();
		 
		 List <String> vegetable =Arrays.asList(veggies);
		   if (vegetable.contains(Formattedname))
		   {     
			   j++;
			     driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			     
			   if ( j == veggies.length) {
				   break;
			   }
			   
			     
			     
		   }
		  
	   }
	  
	
}
}
