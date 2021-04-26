import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Exer {
	public static void main(String[] args) {
		/*
		//*[@attribute='value']
		//*[text()='value']
		 */
		
		System.out.println("Printing");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test.DESKTOP-91D4PP6\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		WebElement w = d.findElement(By.xpath("//*[@id=\"myTable\"]/tr[5]/td[1]"));
		String s = w.getText();
		System.out.println(s);
		
		WebElement w1= d.findElement(By.xpath("//*[@id=\"myTable\"]/tr[5]/td[2]"));
		String s1 = w1.getText();
		System.out.println(s1);
	}
}
