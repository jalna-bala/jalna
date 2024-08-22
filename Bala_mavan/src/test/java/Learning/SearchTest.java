package Learning;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://shardaonline.ac.in");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void TESTCASES1() throws InterruptedException {
        // International Business
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
       // 
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
        //
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("Online MBA in International Business");
        //
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
        //
      
        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
        String IB = text.getText();
        System.out.println(IB);
     
        Assert.assertEquals("Online MBA in International Business", IB);
        System.out.println("ELECTIVE IS FOUND");

       
        driver.quit();
        
    }

//    @Test(priority = 2)
//    public void TESTCASE2() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("mba in Project Management");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 3)
//    public void TESTCASE3() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("mba in Marketing");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 4)
//    public void TESTCASE4() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("mba in Finance");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 5)
//    public void TESTCASE5() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("mba in Logistics and Supply Chain Management");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 6)
//    public void TESTCASE6() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("mba in Operations Management");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 7)
//    public void TESTCASE7() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("mba in Human Resource Management");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 8)
//    public void TESTCASE8() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("mba in Digital Marketing and E-commerce");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 9)
//    public void TESTCASE9() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("mba in Data Science and Analytics");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 10)
//    public void TESTCASE10() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("mba in International Finance (Integrated by ACCA, UK)");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 11)
//    public void TESTCASE11() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("mba in Healthcare and Hospital Administration");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//    @Test(priority = 12)
//    public void testcase12() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("Finance");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 13)
//    public void testcase13() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("Marketing");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 14)
//    public void testcase14() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("Human Resource Management");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 15)
//    public void testcase15() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("Operations Management");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 16)
//    public void testcase16() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("Project Management");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 17)
//    public void testcase17() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("Logistics and Supply Chain Management");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//
//    @Test(priority = 18)
//    public void testcase18() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("International Business");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }
//  
//    @Test(priority = 19)
//    public void testcase19() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("Healthcare and Hospital Administration");
//        
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
//        
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
//        String IB = text.getText();
//        System.out.println(IB);
//        System.out.println("ELECTIVE IS FOUND");
//        driver.quit();
//    }

    
}