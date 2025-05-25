import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String name = "Sushant";
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    String Pass= getpassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(Pass);
        driver.findElement(By.className("signInBtn")).click();
      Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
       Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//Button[text()='Log Out']")).click();
        
        driver.close();

	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException {
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.className("reset-pwd-btn")).click();
	     String PasswordText =(driver.findElement(By.cssSelector("form p")).getText());
	     String[] arraypassword= PasswordText.split("'");
	     String Password =arraypassword[1].split("'")[0];
	     System.out.println(Password);
	     return Password;
	     
	     
	}

}
