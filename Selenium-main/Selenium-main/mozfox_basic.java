import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mozfox_basic {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("------Firefox-------");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\test.DESKTOP-91D4PP6\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize(); 
		driver.findElement(By.className("btn-default")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		driver.findElement(By.className("btn-lg")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(500);
		
		
	}
}
