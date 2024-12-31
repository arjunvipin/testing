package automation;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodemultiple {
    
    ChromeDriver driver;
    String baseurl = "https://www.google.com";
    
    @Before
    public void set() {
        driver = new ChromeDriver();
        driver.get(baseurl);
    }

    @Test
    public void linkcount() throws Exception {
        // Get all anchor tags (links) on the page
        WebElement[] li = driver.findElements(By.tagName("a")).toArray(new WebElement[0]);
        
        for (WebElement s : li) {
            String link = s.getAttribute("href");
            verify(link);  // Call verify method to check response code
        }
    }

    // Method to verify the response code of each link
    public void verify(String link) {
        try {
            URL ob = new URL(link);
            HttpURLConnection con = (HttpURLConnection) ob.openConnection();
            con.connect();
            if (con.getResponseCode() == 200) {
                System.out.println("valid---" + link);
            } else if (con.getResponseCode() == 404) {
                System.out.println("invalid---" + link);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
