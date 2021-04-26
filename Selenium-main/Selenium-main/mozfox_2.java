import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class mozfox_2 {
	WebDriver driver = new FirefoxDriver();
	@Test
	public void login() {
		System.out.println("----Entering Text----");
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\test.DESKTOP-91D4PP6\\\\Downloads\\\\geckodriver-v0.29.0-win64\\\\geckodriver.exe");
		driver.get("http://demo.automationtesting.in/Frames.html");
		/*
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hello!");
		Thread.sleep(1000);
		*/
	}
	@Test
	public void operation() {
		//System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\test.DESKTOP-91D4PP6\\\\Downloads\\\\geckodriver-v0.29.0-win64\\\\geckodriver.exe");
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hello!");
		
	}
		
	
}
