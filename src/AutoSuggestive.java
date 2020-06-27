import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJava\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com");
		Thread.sleep(3000);
//		login 
		driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.clear();
		source.sendKeys("DEL");
		Thread.sleep(3000);
		source.sendKeys(Keys.DOWN);
		source.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).click();
		WebElement destination = driver.findElement(By.xpath("//input[contains(@placeholder,'To')]"));
		destination.clear();
		destination.sendKeys("MUM");
		Thread.sleep(3000);
		destination.sendKeys(Keys.DOWN);
		destination.sendKeys(Keys.ENTER);
	}

}
