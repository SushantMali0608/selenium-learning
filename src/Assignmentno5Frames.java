import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentno5Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/");
	    driver.findElement(By.linkText("Nested Frames")).click();
	    driver.switchTo().frame("frame-top");
	    driver.switchTo().frame("frame-middle");
	    System.out.println(driver.findElement(By.id("content")).getText());

	}

}
