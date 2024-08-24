package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunching implements Jain {
	 public static void main(String[] args) throws InterruptedException {
				
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			driver.get("https://shardaonline.online");
			
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/img")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).click();
			
			//Starting
			// International Business
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("mba in International Business");
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			WebElement text =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
			String IB=text.getText();
			System.out.println(IB);
						
			// Project Management
						
				Thread.sleep(4000);
						driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("mba in Project Management");
						Thread.sleep(4000);
						driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER);
						Thread.sleep(4000);
						WebElement PM =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div[1]/a/div/div[2]/div/h2"));
						String aa=text.getText();
						System.out.println(aa);


		
	}
}