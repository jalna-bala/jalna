package login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchAndPressEnter {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait

        try {
            // Open the website
            driver.get("https://shardaonline.online/");
            driver.manage().window().maximize();

            // Initialize WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for and click on the search icon
            WebElement searchIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")));
            searchIcon.click();

            // Wait for the search box to be visible and interactable
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search_box\"]")));
            searchBox.click();
            searchBox.sendKeys("International Business");
            searchBox.sendKeys(Keys.ENTER);

            // Additional steps or assertions can be added here

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
