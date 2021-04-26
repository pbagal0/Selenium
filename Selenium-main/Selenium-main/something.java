import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class something {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("--------Selenium--------");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\test.DESKTOP-91D4PP6\\\\Desktop\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/");
		
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin123");
		d.manage().window().maximize();
		d.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		/*
		d.findElement(By.id("menu_maintenance_purgeEmployee")).click();
		Thread.sleep(2000);
		
		d.findElement(By.id("confirm_password")).sendKeys("pqwrt");
		
		d.findElement(By.xpath("//input[@type='submit']")).click();
		*/
		
		//------------------------------------------------------------------------
		
		/*
		d.findElement(By.id("menu_leave_viewLeaveModule")).click();
		Thread.sleep(1000);
		d.findElement(By.id("menu_leave_applyLeave")).click();
		*/
		
		//------------------------------------------------------------------------
		
		WebElement ele=d.findElement(By.linkText("Leave"));
		Actions act= new Actions(d);
		act.moveToElement(ele).build().perform();
		
		/*
		WebElement ele1=d.findElement(By.linkText("Entitlements"));
		Actions a2 = new Actions(d);
		a2.moveToElement(ele1).build().perform();
		*/
		
		d.findElement(By.id("menu_leave_viewLeaveList")).click();
		
		d.findElement(By.id("calFromDate")).sendKeys("");
		d.findElement(By.id("calToDate")).clear();
		d.findElement(By.id("calToDate")).sendKeys("2000-04-22");
		
		d.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
	}
}
