import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class YuhuPart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\SeleniumJava\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		int o=1;
//		while(o<5) {
//			
//		}
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		Order 6 Beetroot
		driver.findElement(By.className("search-keyword")).sendKeys("Beetroot");
		Thread.sleep(1000);
		WebElement elm = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/a[2]"));
		for(int i=0;i<5;i++) {
			elm.click();
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).click();
		Thread.sleep(1000);
		
//		Order 10 Ons Carrot
		driver.findElement(By.className("search-keyword")).clear();
		driver.findElement(By.className("search-keyword")).sendKeys("Carrot");
		Thread.sleep(1000);
		for (int b=1;b<10;b++) {
			 driver.findElement(By.xpath("//a[@class='increment']")).click();
			 Thread.sleep(1000);
			 }
		driver.findElement(By.xpath("//*[@id=\"root\"]//button[contains(text(),'ADD TO CART')]")).click();
		Thread.sleep(1000);
		
		//Process to checkout
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
//		Add Promo Code before checkout
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("Skuyin aja dulu");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		Thread.sleep(3000);
		
////		Select Country
		Select dropdown = new Select (driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select")));
		dropdown.selectByVisibleText("Indonesia");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		
////		checkbox
		WebElement chkbox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input"));
		chkbox.click();
		System.out.println(chkbox.isSelected());
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		
		
//		Part 2 By Text
		System.out.println("Banana");
	}

}
