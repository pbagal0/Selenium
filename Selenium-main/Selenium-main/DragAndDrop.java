import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.out.println("--------Selenium-------");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test.DESKTOP-91D4PP6\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		//------------------------------------------------------------------------------
		/*
		d.get("https://emicalculator.net/");
		d.manage().window().maximize();
		WebElement slider = d.findElement(By.id("loanamountslider"));
		Actions move = new Actions(d);
		move.dragAndDropBy(slider,100, 0).build().perform();
		 
		WebElement w = d.findElement(By.id("loaninterestslider"));
		Actions a = new Actions(d);
		a.dragAndDropBy(w, (int) 12, 0).build().perform();
		*/
		
		d.get("http://demo.guru99.com/test/drag_drop.html");
		d.manage().window().maximize();
		
		WebElement w1 = d.findElement(By.id("fourth"));
		WebElement w2 = d.findElement(By.id("amt7"));
		Actions a = new Actions(d);
		a.dragAndDrop(w1, w2).build().perform();
		
		WebElement w3 = d.findElement(By.id("credit2"));
		WebElement w4 = d.findElement(By.id("bank"));
		Actions a1 = new Actions(d);
		a1.dragAndDrop(w3, w4).build().perform();
		
		WebElement w5 = d.findElement(By.id("credit1"));
		WebElement w6 = d.findElement(By.id("loan"));
		Actions a2 = new Actions(d);
		a2.dragAndDrop(w5, w6).build().perform();
		
		WebElement w7 = d.findElement(By.id("fourth"));
		WebElement w8 = d.findElement(By.id("amt8"));
		Actions a3 = new Actions(d);
		a3.dragAndDrop(w7, w8).build().perform();
		
	}
}
