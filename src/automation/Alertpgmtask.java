package automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgmtask {
	 ChromeDriver driver;

	    @Before
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    }
	    
	    @Test
	    public void test()
	    {
	    	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	    	Alert a=driver.switchTo().alert();
	    	String act=a.getText();
	    	String exp="Click for js alert";
	    	if(act.equals(exp))
	    	{
	    		System.out.println("pass");
	    	}
	    	else
	    	{
	    		System.out.println("fail");
	    		
	    	}
	    	a.accept();
	    	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	    	driver.switchTo().alert().dismiss();
	    	
	    	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	    	Alert b=driver.switchTo().alert();
	    	b.sendKeys("njnfejnfef");
	    	b.accept();
	    	
	    }
	    @After
	    public void close()
	    {
	    	
	    }
}
