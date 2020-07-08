import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Latihan {
//public static WebDriver driver;
	@Test
	public static void verifyHomepageTitle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		System.out.println(driver.getTitle());
		
		String expectedTitle = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		String actualTitle = driver.getTitle();
		try {
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Test Title Passed");
		} catch(Throwable e) {
			System.out.println("Test Title Failed");
		}
		WebDriverWait myDynamicElement = new WebDriverWait(driver, 30);
        myDynamicElement.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@value='IXB']")).click();
		Thread.sleep(3000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJava\\Chromedriver.exe");
		verifyHomepageTitle();
		
		
		
		
	}
	
}
