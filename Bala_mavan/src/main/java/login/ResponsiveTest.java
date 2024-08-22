package login;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ResponsiveTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Updated constructor for WebDriverWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set implicit wait
    }

    @Test
    public void testResponsiveDesign() {
        // URL of the web application
        String url = "https://shardaonline.ac.in/";
        driver.get(url);

        // Define different screen sizes
        Dimension[] screenSizes = {
            new Dimension(360, 640), // Mobile screen size
            new Dimension(768, 1024), // Tablet screen size
            new Dimension(1366, 768), // Desktop screen size
            new Dimension(1920, 1080) // Full HD screen size
        };

        for (Dimension size : screenSizes) {
            // Resize browser window
            driver.manage().window().setSize(size);

            try {
                // Wait for the element to be visible using the correct ID
            	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div/div/img")));

                String elementText = element.getText();
                
                // Print the screen size and element text
                System.out.println("Screen Size: " + size.getWidth() + "x" + size.getHeight());
                System.out.println("Element Text: " + elementText);
                
                // Example assertion (change as needed)
                Assert.assertEquals(elementText, "Expected Text", "Text does not match for screen size: " + size.getWidth() + "x" + size.getHeight());
            } catch (Exception e) {
                System.out.println("Element not found for screen size: " + size.getWidth() + "x" + size.getHeight());
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
