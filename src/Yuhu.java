import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yuhu {
//Test Scenario Benar
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\SeleniumJava\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.className("search-keyword")).sendKeys("Beetroot");
		Thread.sleep(1000);
		WebElement elm = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/a[2]"));
		elm.click();
		elm.click();
		elm.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/input")).sendKeys("Skuyin aja dulu");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		Thread.sleep(1000);
		
//		Select
		Select dropdown = new Select (driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select")));
		dropdown.selectByVisibleText("Algeria");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		
//		checkbox
		WebElement chkbox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input"));
		chkbox.click();
		System.out.println(chkbox.isSelected());
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		


	}
}
