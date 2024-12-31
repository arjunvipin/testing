package automation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsPath {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
@Test
public void test()
{
driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys("dsjfj");
driver.findElement(By.xpath("//*[contains(@type,'password')]")).sendKeys("ajith");
driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();

}
}
