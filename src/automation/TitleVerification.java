import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
    public static void main(String[] args) {
        // Set up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Google homepage
        driver.get("https://www.google.com");

        // Get the page source
        String content = driver.getPageSource();

        // Verify if "Gmail" is present
        if (content.contains("Gmail")) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        // Close the browser
        driver.quit();
    }
}
