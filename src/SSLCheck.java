
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option =new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
	    WebDriver driver = new ChromeDriver(option);
	    driver.manage().window().maximize();
	    driver.get("https://expired.badssl.com/");
	    System.out.println(driver.getTitle());
		
//		//practise
//		ChromeOptions option=new ChromeOptions();
//		option.setAcceptInsecureCerts(true);
//	    System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
//	    WebDriver driver = new ChromeDriver(option);
//	    driver.get("https://expired.badssl.com/");
//	    System.out.println(driver.getTitle());
	    
	}

}
