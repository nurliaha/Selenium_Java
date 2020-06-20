import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownlat {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\SeleniumJava\\\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000);
		int i=1;
		while(i<4) {
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
			i++;
		}
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
	}

}
