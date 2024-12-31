package automation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.blazedemo.com/register");
		
	}

	@Test
	public void test()
	{
		driver.findElement(By.id("name")).sendKeys("abcx@jjk");
		driver.findElement(By.id("company")).sendKeys("hufufef");
		driver.findElement(By.id("email")).sendKeys("sdgsfg");
		driver.findElement(By.id("password")).sendKeys("segfb");
		driver.findElement(By.id("password-confirm")).sendKeys("sfsgrew");
		 driver.findElement(By.id("dd3p5")).click();
		 
	}
	

}
