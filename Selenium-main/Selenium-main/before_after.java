import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class before_after {
	@BeforeClass
	public void main() {
		System.out.println("Before");
	}
	@AfterClass
	public void after()
	{
		System.out.println("After");
	}
	@Test
	public void a()
	{
		System.out.println("A");
	}
	@Test
	public void b() 
	{
		System.out.println("B");
	}
	@Test
	public void c()
	{
		System.out.println("C");
	}
}
