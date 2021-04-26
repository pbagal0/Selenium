
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_selenium {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("--------Selenium----------");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test.DESKTOP-91D4PP6\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		
		b.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C231348943369%7Ce%7Cfacebook%7C&placement=&creative=231348943369&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D1007773%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIvavltZnQ7wIVVaaWCh2s1wUeEAAYASAAEgLY5_D_BwE ");
		
		b.findElement(By.name("firstname")).sendKeys("Prashant");//Enter Firstname
		b.findElement(By.name("lastname")).sendKeys("Bagal");//Enter Last name
		b.findElement(By.name("reg_email__")).sendKeys("mithn@gmail.com");//Enter gmail id
		b.findElement(By.name("reg_passwd__")).sendKeys("mithn@gmail");//Enter Password 
		b.findElement(By.name("reg_email_confirmation__")).sendKeys("mithn@gmail.com");//Re-Enter gamil id
		
		Select dd = new Select(b.findElement(By.id("day")));
		dd.selectByValue("1");//Enter date
		Select mm = new Select(b.findElement(By.id("month")));
		mm.selectByValue("9");//Enter month
		Select yy = new Select(b.findElement(By.id("year")));
		yy.selectByValue("1998");//Enter year
		
//		WebElement radio1 = b.findElement(By.cssSelector("input[value='2']"));
//		radio1.click();//Select Gender
		b.findElement(By.cssSelector("input[value='2']")).click();
		
		Thread.sleep(3000);
		b.findElement(By.name("websubmit")).click();//Click Sign up
	}
}
