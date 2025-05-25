import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	    
	    //Click on the table head
//	    driver.findElement(By.xpath("//tr/th[1]")).click();
//	    
//	    //Storing all the webelements and getting textof orignal list
//	    List<WebElement> li = driver.findElements(By.xpath("//tr/td[1]"));
//	    List<String> OrignalList = li.stream().map(s-> s.getText()).collect(Collectors.toList());
//	    
//	    List <String> SortedList= OrignalList.stream().sorted().collect(Collectors.toList());
//	    
//	    Assert.assertTrue(OrignalList.equals(SortedList));
//	    
//	    // finding price of specific element 
//	    List<String>price;
//	    do
//	       {
//	    	List<WebElement> Listelement = driver.findElements(By.xpath("//tr/td[1]"));
//	    	price =Listelement.stream().filter(s->s.getText().contains("Rice"))
//	       .map(s->getpricevegiee(s)).collect(Collectors.toList());
//	       price.forEach(s->System.out.println(s));
//	       if(price.size()<1){
//	    	   driver.findElement(By.cssSelector("[aria-label ='Next']")).click();
//	       }
//	       }while(price.size()<1);
//	    
//	    
//	    
//
//	}
//
//	private static String getpricevegiee(WebElement s) {
//		// TODO Auto-generated method stub
//		String pricevalues = s.findElement(By.xpath("following-sibling::td[1]")).getText();
//		
//		return pricevalues;
	    
	    driver.findElement(B))
	}

}
