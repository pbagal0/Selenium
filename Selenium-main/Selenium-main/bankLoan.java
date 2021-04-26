import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bankLoan {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Apply for car loan");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\test.DESKTOP-91D4PP6\\\\Desktop\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=Desk_OAPN_cms_cl_index_btn_applynow");
		driver.manage().window().maximize();
		driver.findElement(By.id("carRelbtn")).click();//Select type of loan
		driver.findElement(By.linkText("New Car Loan")).click();
		
		driver.findElement(By.id("MOBILENUM")).sendKeys("8169123654");
		driver.findElement(By.id("CUSTFIRSTNAME")).sendKeys("Prashant");
		driver.findElement(By.id("CUSTLASTNAME")).sendKeys("Bagal");
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys("MUMBAI");
		Thread.sleep(2000);
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("CAR_MODEL_PRIZE")).click();
		driver.findElement(By.id("residancespan")).click();
		driver.findElement(By.linkText("Employer Leased")).click();
		
		driver.findElement(By.id("yrspan_mvce")).click();
		driver.findElement(By.linkText("2020")).click();
		
		driver.findElement(By.id("mnthspan")).click();
		driver.findElement(By.linkText("Apr")).click();
		
		driver.findElement(By.id("selSalspan")).click();
		driver.findElement(By.linkText("Self Employed")).click();
		
		
		driver.findElement(By.id("DATEOFBIRTH")).sendKeys("01-09-1998");
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys("Honda City");
		driver.findElement(By.id("CITY_NAME")).sendKeys("MUMBAI");
		
		driver.findElement(By.id("NAME_OF_BUSSINESS")).sendKeys("SELF EMPLOYED");
		driver.findElement(By.id("Nobspan")).click();
		driver.findElement(By.linkText("MANUFACTURING")).click();
		
		driver.findElement(By.id("yrspan_sdb")).click();
		driver.findElement(By.linkText("2020")).click();
		Thread.sleep(500);
		driver.findElement(By.id("mnthspan_1")).click();
		driver.findElement(By.linkText("Mar")).click();
		
		driver.findElement(By.id("totalworkexp_1")).click();
		driver.findElement(By.linkText("2")).click();
		
		driver.findElement(By.id("LATEST_Y_GROSS_T_INC")).sendKeys("500000");
		driver.findElement(By.id("TOTAL_CURR_EMI_PAID")).sendKeys("0");
		
		driver.findElement(By.id("eligibility-btn")).click();
		Thread.sleep(2000);
	}
}
