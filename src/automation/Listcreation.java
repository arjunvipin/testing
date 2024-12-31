package automation;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listcreation {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }

    @Test
    public void dropdownVerification() {
       
        WebElement dayElement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
        Select day = new Select(dayElement);
        day.selectByValue("04");
        List<WebElement> ob = day.getOptions();
        System.out.println(ob.size());		

       
        WebElement monthElement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
        Select month = new Select(monthElement);
        month.selectByValue("06");
        List<WebElement> ob1 = month.getOptions();   
        System.out.println(ob1.size());

       
        WebElement yearElement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
        Select year = new Select(yearElement);
        year.selectByValue("1990");
        List<WebElement> ob2 = year.getOptions();  
        System.out.println(ob2.size());
        
        
        
        boolean b=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/img[1]")).isDisplayed();
	    if(b)
	    {
	    	System.out.println("selected");
	    }
	    else
	    {
	    	System.out.println("not selected");

	    }
  
  
	    boolean b1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
	    if(b)
	    {
	    	System.out.println("selected");
	    }
	    else
	    {
	    	System.out.println("not selected");

	    }
  
  }
  
  
  
  
  
  
    }
