package automation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerpgm {
    ChromeDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/Arjun%20V/Desktop/prgm.html");
    }

    @Test
    public void test() {
        driver.findElement(By.xpath("/html/body/input[1]")).click();
        Alert a = driver.switchTo().alert();
        String actualtext = a.getText();
        if (actualtext.equals("hello i am alert box")) {
            System.out.println("pass");

        } else {
            System.out.println("fail");
        }
        a.accept();
        //a.getText();
        driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("arjun123");
        driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("V");

    }

    @After
    public void close() {
        if (driver != null) {
            driver.quit();  // Close the browser after the test
        }
    }
}