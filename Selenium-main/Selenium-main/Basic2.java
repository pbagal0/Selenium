import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic2 {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Welcome to training");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\test.DESKTOP-91D4PP6\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	//-------------------Just ok -----------------
	/*driver.findElement(By.className("btn-default")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept(); //driver.switchTo().alert().dismiss();
	
	driver.manage().window().maximize();// to maximize the window
	*/
	
	
	//------------------ok and cancel-----------------
	/*
	driver.findElement(By.className("btn-lg")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	driver.manage().window().maximize();
	*/
	
	
	//-----------------enter name------------------
	
	//driver.findElement(By.className("btn-lg")).click();
	
	
	//----------------drop down-------------
	/*
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	Select dd = new Select(driver.findElement(By.id("select-demo")));
	dd.selectByVisibleText("Friday");
	Thread.sleep(3000);
	dd.selectByValue("Sunday");
	Thread.sleep(3000);
	dd.selectByIndex(3);
	*/
	
	/*
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	Select dd = new Select(driver.findElement(By.id("multi-select")));
	
	dd.selectByValue("Texas");
	dd.deselectByIndex(2);
	dd.deselectByIndex(0);
	Thread.sleep(1000);
	driver.findElement(By.id("printMe")).click();
	//========================================================================
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	Select dd = new Select(driver.findElement(By.id("multi-select")));
	
	dd.selectByValue("Texas");
	dd.selectByIndex(0);
	dd.selectByIndex(2);
	Thread.sleep(1000);
	driver.findElement(By.id("printAll")).click();
	*/
	
	
	
	
}
}
