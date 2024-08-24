package login;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrokenLinksTest_sharda {

    WebDriver driver;
    int brokenLinksCount = 0; // Counter for broken links
    int validLinksCount = 0;  // Counter for non-broken (valid) links

    @BeforeClass
    public void setUp() {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        // Open the desired webpage
        driver.get("https://shardaonline.ac.in/");
    }

    @Test
    public void checkBrokenLinks() {
        // Fetch all links in the webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        System.out.println("Total links: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                // Check if the URL uses a protocol that we can't test with HTTP (e.g., tel:, mailto:)
                if (url.startsWith("tel:") || url.startsWith("mailto:") || url.startsWith("javascript:")) {
                    System.out.println("Skipping non-HTTP URL: " + url);
                    continue;
                }
                try {
                    // Open a connection to the URL
                    HttpURLConnection httpConnection = (HttpURLConnection) (new URL(url).openConnection());
                    httpConnection.setRequestMethod("HEAD");
                    httpConnection.connect();
                    
                    // Get the response code
                    int responseCode = httpConnection.getResponseCode();
                    
                    // Check if the link is broken or has a special status code
                    if (responseCode >= 400) {
                        System.out.println("Broken link: " + url + " - Response Code: " + responseCode);
                        brokenLinksCount++;
                    } else {
                        System.out.println("Valid link: " + url + " - Response Code: " + responseCode);
                        validLinksCount++;
                    }
                } catch (Exception e) {
                    System.out.println("Exception in checking URL: " + url + " - Message: " + e.getMessage());
                    brokenLinksCount++;
                }
            } else {
                System.out.println("Invalid link (href is empty or null): " + link.getText());
                brokenLinksCount++;
            }
        }
        
        // Print the counts
        System.out.println("Total broken links: " + brokenLinksCount);
        System.out.println("Total valid links: " + validLinksCount);
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
