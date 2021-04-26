import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class pfox {
	
	WebDriver driver;
	@Test(priority = 1,description = "Method to open the page")
	//default enabled is true
	public void open()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\test.DESKTOP-91D4PP6\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority = 2,description="hey",dependsOnMethods = "open")
	public void login()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test(priority = 3)
	public void logout()
	{
		driver.close();
	}
}
