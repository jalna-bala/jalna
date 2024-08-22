
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import login.data_of_flipkart;

public class opening implements data_of_flipkart  {

	public static void m1() throws InterruptedException {
				
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			driver.get(URL);
			driver.manage().window().maximize();
			//driver.findElement(By.xpath(login_xpath)).click();
			driver.close();				
				
	}
	 }
