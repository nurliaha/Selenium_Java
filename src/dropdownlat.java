import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdownlat {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJava\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		WebDriverWait myDynamicElement = new WebDriverWait(driver, 30);
        myDynamicElement.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@value='IXB']")).click();
		Thread.sleep(3000);
		
//		id dynamic, so using index 
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
//		alternatif id dynamic
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		
//		Count the number of Checkboxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(2000);
		
//		dropdown pessanger
		
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//tr[1]//td[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		int i=1;
		while(i<4) {
			driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).sendKeys(Keys.DOWN);
			i++;
		}
		Thread.sleep(3000);
		
		
//		checkbox
		
		WebElement chkbox = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
		chkbox.click();
		System.out.println(chkbox.isSelected());
		
		WebElement chkbox2 = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
		chkbox2.click();
		System.out.println(chkbox2.isSelected());
		
		
		Thread.sleep(2000);
//		after checkbox have other java script 

		driver.findElement(By.xpath("//div[@id='flightSearchContainer']")).click();
		
//		link
		
		driver.findElement(By.partialLinkText("Special Assistance")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='SpecialAssistanceWindow']")).click();
		Thread.sleep(2000);
		
		
	
	}

}
