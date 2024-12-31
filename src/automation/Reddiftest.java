package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiftest {

	    public static void main(String[] args) {
	    	
	    	
	    	ChromeDriver driver = new ChromeDriver();

	        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");     
	        
	        WebElement button = driver.findElement(By.xpath("//input[@value='Create my account >>']"));   
	   String actual=button.getAttribute("value");
	      
	        if (button.isDisplayed())
	        {
	            System.out.println("Pass");
	        } 
	        else
	        {
	            System.out.println("Fail");
	        }}}