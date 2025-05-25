import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Sushant");
        driver.findElement(By.name("inputPassword")).sendKeys("Yash @123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        //Thread.sleep(1000);     
        driver.findElement(By.xpath("//input[@placeholder ='Name']")).sendKeys("Sushant");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Sushantmali@gmail.com");
       //driver.findElement(By.cssSelector("input[placeholder='Email'[2]]")).clear();
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("96888787878");
        driver.findElement(By.className("reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector("Input#inputUsername")).sendKeys("Sushant");
        driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne"));
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	    
	    //Practise
//		WebDriver  driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//		driver.get("https:facebook.com");
//		String title =driver.getTitle();
//		System.out.println(title);
//		String text = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
//		System.out.println(text);
//		driver.findElement(By.id("email")).sendKeys("sm");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.navigate().to("https://google.com");
//		Thread.sleep(3000);
//		driver.navigate().back();
		
		
		
		
        
        
        

	}

}
