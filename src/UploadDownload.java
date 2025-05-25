import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UploadDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.rahulshettyacademy.com/upload-download-test/index.html");
		String fruit= "Apple";
		//download
		driver.findElement(By.id("downloadButton")).click();
		
		//Edit Excel
		int col =getRowNumber(filename,"Price");
		int row =getColumnnumber(filename,"Apple");
		updateCell
		private static int getColumnnumber(String filename ,String colname) {
			ArrayList<String> a = new ArrayList<String>();
			XSSFWorkbook workbook =new XSSFWorkbook(filename);
			int sheets = workbook.getNumberOfSheets();
			XSSFSheet sheet=workbook.getSheet("Sheet1");
					//identifying testcase column by scanningentire rows
			Iterator <Row> row = sheet.iterator();
		    Row firstrow =row.next();
			Iterator <Cell> ce = firstrow.cellIterator();
			int k=1;
			int column = 0;
					while(ce.hasNext()) {
						Cell value =ce.next();
						if(value.getStringCellValue().equalsIgnoreCase(colname)) {
							
							column=k;
						}
						k++;
					}
					System.out.println(column);
					return column;
			
			
		}
	}
}		
		
		//Upload
		WebElement upload=driver.findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("C:\\Users\\Admin\\Downloads\\download.xlsx");
		
		//Wait for success message to be appear and disappear
		By toastLocator =By.cssSelector(".Toastify__toast-body div:nth-child(2)");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10) );
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
		String toastText=driver.findElement(toastLocator).getText();
		System.out.println(toastText);
		Assert.assertEquals(toastText,"Updated Excel Data Successfully.");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));
		//Verify Updated Data is showing in web table
		String priceColumn =driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
        String actualPrice = driver.findElement(By.xpath("//div[text()='"+fruit+"']/parent::div/parent::div/div[@id='cell-"+priceColumn+"-undefined']")).getText();
        System.out.println(actualPrice);;
        Assert.assertEquals("345", actualPrice);
        
		

	}

}
