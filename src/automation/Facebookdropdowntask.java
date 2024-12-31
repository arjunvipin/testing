package automation;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Facebookdropdowntask
	{
		
		ChromeDriver driver;
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/r.php");
		}
		@Test
		public void test()
		{
			WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
			Select ob=new Select(day);
			ob.selectByValue("8");
			
			Select ob1=new Select(driver.findElement(By.xpath("//select[@id='month']")));
			ob1.selectByIndex(11);
			
			Select ob2=new Select(driver.findElement(By.xpath("//select[@id='year']")));
			ob2.selectByVisibleText("1999");
			
			boolean b=driver.findElement(By.xpath("//body/div[@id='u_0_6_4D']/div[@id='globalContainer']/div[@id='content']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/span[1]/span[1]/label[1]")).isSelected();
			if(b)
			{
				System.out.println("selected");
			}
			else
			{
				System.out.println("not selected");

			}
			boolean b1=driver.findElement(By.xpath("//body/div[@id='u_0_6_4D']/div[@id='globalContainer']/div[@id='content']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/span[1]/span[2]/label[1]")).isSelected();
		}
		@After
		public void close()
		{
			
		}
	}

