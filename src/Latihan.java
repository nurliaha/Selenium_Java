import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Latihan {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJava\\Chromedriver.exe");
		WebDriver driver = initialWebDriver();
		verifyHomepageTitle(driver);
		verifyFrom(driver);
		verifyPasanger(driver);
		verifyCheckbox(driver);
		verifyLinkText(driver);
		driver.quit();
	}

	private static WebDriver initialWebDriver() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		return driver;
	}

	public static void verifyHomepageTitle(WebDriver driver) {
		System.out.println(driver.getTitle());
		String expectedTitle = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		String actualTitle = driver.getTitle();
		try {
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Test Title Passed");
		} catch(Throwable e) {
			System.out.println("Test Title Failed");
		}
	}

	private static void verifyFrom(WebDriver driver) throws InterruptedException {
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
	}

	public static void verifyPasanger(WebDriver driver) throws InterruptedException {
//		dropdown pessanger
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']")).click();
//		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<5) {
			driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).sendKeys(Keys.DOWN);
			i++;
		}
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
	}

	public static void verifyCheckbox(WebDriver driver) throws InterruptedException {
//		Count the number of Checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(2000);
		WebElement chkbox = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
		chkbox.click();
		System.out.println(chkbox.isSelected());
		Assert.assertFalse( driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		Assert.assertFalse(false);
		WebElement chkbox2 = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
		chkbox2.click();
		System.out.println(chkbox2.isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(true);
		Thread.sleep(2000);
//		after checkbox have other java script
		driver.findElement(By.xpath("//div[@id='flightSearchContainer']")).click();
	}

	public static void verifyLinkText(WebDriver driver) throws InterruptedException {
		driver.findElement(By.partialLinkText("Special Assistance")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='SpecialAssistanceWindow']")).click();
		Thread.sleep(2000);
	}
}
