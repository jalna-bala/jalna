package login;import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ImagePresenceTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        Thread.sleep(2000); // Wait for 2 seconds

        driver = new ChromeDriver();
        Thread.sleep(2000); // Wait for 2 seconds

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000); // Wait for 2 seconds

        driver.manage().window().maximize();
        Thread.sleep(2000); // Wait for 2 seconds

        // Open the desired webpage
        driver.get("https://shardaonline.ac.in/");
        Thread.sleep(2000); // Wait for 2 seconds
    }

    @Test
    public void checkImagesPresence() throws InterruptedException {
        List<WebElement> images = driver.findElements(By.tagName("img"));
        Thread.sleep(2000); // Wait for 2 seconds

        boolean allImagesPresent = true;

        for (WebElement img : images) {
            String src = img.getAttribute("src");
            Thread.sleep(2000); // Wait for 2 seconds

            boolean isPresent = !src.isEmpty() && img.getAttribute("naturalWidth") != null && Integer.parseInt(img.getAttribute("naturalWidth")) > 0;
            Thread.sleep(2000); // Wait for 2 seconds

            if (!isPresent) {
                System.out.println("Missing or broken image: " + src);
                allImagesPresent = false;
                Thread.sleep(2000); // Wait for 2 seconds
            }
        }

        Assert.assertTrue(allImagesPresent, "Some images are missing or broken.");
        Thread.sleep(2000); // Wait for 2 seconds
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            driver.quit();
            Thread.sleep(2000); // Wait for 2 seconds
        }
    }
}
