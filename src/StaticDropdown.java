import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.get(("https://rahulshettyacademy.com/dropdownsPractise/"));
	    WebElement StaticDropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    
        Select Dropdown = new Select(StaticDropdown);
        Dropdown.selectByIndex(2);
        System.out.println(Dropdown.getFirstSelectedOption().getText());
        Dropdown.selectByVisibleText("USD");
        System.out.println(Dropdown.getFirstSelectedOption().getText());
        
        
        // Finding element and disabelled element
        //System.out.println(driver.findElement(By.name("ctl00$mainContent$txt_Todate")).isEnabled());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();    
       if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
       {
    	   System.out.println("Its Enabled");
    	   
       }
       else
       {
    	   System.out.println("its disabed");
       }
           
        //System.out.println(driver.findElement(By.name("ctl00$mainContent$txt_Todate")).isEnabled());
        
	}
	 
	    // Practise
//	    driver.manage().window().maximize();
//	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//	    WebElement dropdown =driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
//	    Select drop =new Select(dropdown);
//	  //  drop.selectByIndex(2);
//	    drop.selectByValue("USD");
//	    driver.findElement(By.id("autosuggest")).sendKeys("Ind");
//	    List<WebElement> desh =driver.findElements(By.xpath("//a[@class='ui-menu-item']"));
//	    for(WebElement i:desh) {
//	    if(i.getText().equalsIgnoreCase("India")){
//	    	i.click();
//	    break;	
//	    }
//	  }
//
//}
}