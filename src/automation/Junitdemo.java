package automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {

	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("browser open");
	}
	
	@Test
	public void test()
	{
	String title = driver.getTitle();
	
	System.out.println("test activity");
	
	String content =driver.getPageSource();
	if(content.contains("Gmail"))
	{

		
	            System.out.println("pass");
	        }
	else
	        {
	            System.out.println("fail");
	        }
	
	}
	
	@After
	public void browserclose()
	{
	
	driver.close();
	
	 System.out.println("browser closed");
	
	
	
	
	
}}
