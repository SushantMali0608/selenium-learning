import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isEnabled());
		driver.findElement(By.id("checkBoxOption1")).click();
		Boolean S =(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertFalse(S);
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
//		//Practise
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
//		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("checkBoxOption1"))));
//		 driver.findElement(By.id("checkBoxOption1")).click();
//		Boolean s = driver.findElement(By.id("checkBoxOption1")).isSelected();
//		Assert.assertTrue(s,"checkbox selected");
//		System.out.println("Passsed");
//		driver.close();

	}

}
