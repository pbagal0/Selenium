
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to training");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test.DESKTOP-91D4PP6\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.findElement(By.className("form-control")).sendKeys("Prashant is good guy");
		Thread.sleep(5000);
		driver.findElement(By.className("at4-close")).click();
		//driver.findElement(By.className("at-cv-button at-cv-lightbox-yesno at-cm-no-button")).click();
		
		driver.findElement(By.className("btn-default")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("form-control")).clear();
	}
}
