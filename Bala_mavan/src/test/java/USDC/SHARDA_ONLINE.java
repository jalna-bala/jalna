package USDC;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class SHARDA_ONLINE implements SHARDA_DATA {
	    WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	        driver.get("https://shardaonline.ac.in");
	        driver.manage().window().maximize();
	    }

	  // International_business
	    @Test(priority = 1)
	    public void TESTCASES1() throws InterruptedException {
	        // International Business
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(International_business)).click();
	        
	        WebElement text = driver.findElement(By.xpath(International_business_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       //Assert.assertEquals(International_business_Data, IB);
	       Assert.assertEquals(IB, International_business_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
	       
   
	    }
	  //  Project_Management
	    @Test(priority = 2)
	    public void TESTCASES2() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Project_Management)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Project_Management_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       //Assert.assertEquals(Project_Management_Data, IB);
	       Assert.assertEquals(IB, Project_Management_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	  //  Marketing
	    @Test(priority = 3)
	    public void TESTCASES3() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Marketing)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Marketing_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	      // Assert.assertEquals(Marketing_Data, IB);
	       Assert.assertEquals(IB, Marketing_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	  //  Finance
	    @Test(priority = 4)
	    public void TESTCASES4() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Finance)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Finance_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	      // Assert.assertEquals(Finance_Data, IB);
	       Assert.assertEquals(IB, Finance_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	  //  Logistic_and_Supply_Chain_Management
	    @Test(priority = 5)
	    public void TESTCASES5() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Logistic_and_Supply_Chain_Management)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Logistic_and_Supply_Chain_Management_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       //Assert.assertEquals(Logistic_and_Supply_Chain_Management_Data, IB);
	       Assert.assertEquals(IB, Logistic_and_Supply_Chain_Management_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	  //  Operations_Management
	    @Test(priority = 6)
	    public void TESTCASES6() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Operations_Management)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Operations_Management_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       //Assert.assertEquals(Operations_Management_Data, IB);
	        Assert.assertEquals(IB, Operations_Management_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	   // Human_Resource_Management
	    @Test(priority = 7)
	    public void TESTCASES7() throws InterruptedException {
	     
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Human_Resource_Management)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Human_Resource_Management_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	      // Assert.assertEquals(Human_Resource_Management_Data, IB);
	        Assert.assertEquals(IB, Human_Resource_Management_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	    //Digital_Marketing_and_E_commerce
	    @Test(priority = 8)
	    public void TESTCASES8() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Digital_Marketing_and_E_commerce)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Digital_Marketing_and_E_commerce_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	      // Assert.assertEquals(Digital_Marketing_and_E_commerce_Data, IB);
		    Assert.assertEquals(IB, Digital_Marketing_and_E_commerce_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	   // Data_Science_and_Analytics
	    @Test(priority = 9)
	    public void TESTCASES9() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Data_Science_and_Analytics)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Data_Science_and_Analytics_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	     //  Assert.assertEquals(Data_Science_and_Analytics_Data, IB);
	        Assert.assertEquals(IB, Data_Science_and_Analytics_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	    //	International_Finance
	    @Test(priority = 10)
	    public void TESTCASES10() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(International_Finance)).click();
	        
	        WebElement text = driver.findElement(By.xpath(International_Finance_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       //Assert.assertEquals(International_Finance_Data, IB);
	        Assert.assertEquals(IB, International_Finance_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	  //  Healthcare_and_Hospital_Administration
	    @Test(priority = 11)
	    public void TESTCASES11() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Healthcare_and_Hospital_Administration)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Healthcare_and_Hospital_Administration_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       //Assert.assertEquals(Healthcare_and_Hospital_Administration_Data, IB);
	       Assert.assertEquals(IB, Healthcare_and_Hospital_Administration_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	    
	    // Cyber Security
	    @Test(priority = 12)
	    public void TESTCASES12() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Cyber_Security)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Cyber_Security_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	      
	       Assert.assertEquals(IB, Cyber_Security_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	 //Artificial Intelligence
	    @Test(priority = 13)
	    public void TESTCASES13() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Artificial_Intelligence)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Artificial_Intelligence_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	      
	       Assert.assertEquals(IB, Artificial_Intelligence_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	    //Cloud Computing
	    @Test(priority = 14)
	    public void TESTCASES14() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Cloud_Computing)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Cloud_Computing_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	     
	       Assert.assertEquals(IB, Cloud_Computing_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	    //Computer Science and Information Technology
	    @Test(priority = 15)
	    public void TESTCASES15() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Computer_Science_and_Information_Technology)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Computer_Science_and_Information_Technology_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       Assert.assertEquals(IB, Computer_Science_and_Information_Technology_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	    
	  //Data Science
	    @Test(priority = 16)
	    public void TESTCASES16() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Data_Science)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Data_Science_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       Assert.assertEquals(IB, Data_Science_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	    
	  //Accounting and Finance
	    @Test(priority = 17)
	    public void TESTCASES17() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mcom_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Accounting_and_Finance)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Accounting_and_Finance_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       Assert.assertEquals(IB, Accounting_and_Finance_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	    //International Finance (Integrated by ACCA, UK)
	    @Test(priority = 18)
	    public void TESTCASES18() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mcom_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(International_Finance_in_mcom)).click();
	        
	        WebElement text = driver.findElement(By.xpath(International_Finance_in_mcom_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       Assert.assertEquals(IB, International_Finance_in_mcom_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	    //BBA_program
	    @Test(priority = 19)
	    public void TESTCASES19() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program_in_BBA)).click();
	        
	        WebElement text = driver.findElement(By.xpath(BBA_program_in_BBA_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       Assert.assertEquals(IB, BBA_program_in_BBA_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	    //BBA
	    @Test(priority = 20)
	    public void TESTCASES20() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(International_Finance_in_BBA)).click();
	        
	        WebElement text = driver.findElement(By.xpath(International_Finance_in_BBA_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       Assert.assertEquals(IB, International_Finance_in_BBA_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }
	    //BCA_program
	    @Test(priority = 21)
	    public void TESTCASES21() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BCA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BCA_program_in_BCA)).click();
	        
	        WebElement text = driver.findElement(By.xpath(BCA_program_in_BCA_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       Assert.assertEquals(IB, BCA_program_in_BCA_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    } 
	    
	    
	    //BA_program
	    @Test(priority = 22)
	    public void TESTCASES22() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BA_Political_Science_program)).click();
	        
	        WebElement text = driver.findElement(By.xpath(BA_Political_Science_program_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       Assert.assertEquals(IB, BA_Political_Science_program_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
   
	    }    
	  //  about_us
	    @Test(priority = 23)
	    public void TESTCASES23() throws InterruptedException {
	      
	        driver.findElement(By.xpath(about_us)).click();
	        	        
	        WebElement text = driver.findElement(By.xpath(about_us_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       //Assert.assertEquals(Healthcare_and_Hospital_Administration_Data, IB);
	       Assert.assertEquals(IB, about_us_data);
	      	       
	       driver.close();
   
	    }
	   // Blogs
	    @Test(priority = 24)
	    public void TESTCASES24() throws InterruptedException {
	      
	        driver.findElement(By.xpath(Blogs)).click();
	        	        
	        WebElement text = driver.findElement(By.xpath(Blogs_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       //Assert.assertEquals(Healthcare_and_Hospital_Administration_Data, IB);
	       Assert.assertEquals(IB, Blogs_data);
	      	       
	       driver.close();
   
	    }
	    //Contact_us
	    @Test(priority = 25)
	    public void TESTCASES25() throws InterruptedException {
	     
	        driver.findElement(By.xpath(Contact_us)).click();
	        	        
	        WebElement text = driver.findElement(By.xpath(Contact_us_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
     
	       //Assert.assertEquals(Healthcare_and_Hospital_Administration_Data, IB);
	       Assert.assertEquals(IB, Contact_us_data);
	      	       
	       driver.close();
   
	    }
	  //  searchicon
	    @Test(priority = 26)
	    public void TESTCASES26() throws InterruptedException {
	      
	        driver.findElement(By.xpath(searchicon)).click();
	        
	       
	        //
	        driver.findElement(By.xpath(search_input_xpath)).sendKeys(searchicon_data);
	        //
	        driver.findElement(By.xpath(search_input_xpath)).sendKeys(Keys.ENTER);
	        //
	      
	        WebElement text = driver.findElement(By.xpath(searchicon_rev));
	        String IB = text.getText();
	       	     
	       Assert.assertEquals(IB, searchicon_data);
	       System.out.println(IB);
	      	       
	       driver.close();
   
	    }
	  //  Enquire_now form
	    @Test(priority = 27)
	    public void TESTCASES27() throws InterruptedException {
	       
	        driver.findElement(By.xpath(Enquire_now)).click();
	     	        
		      WebElement text = driver.findElement(By.xpath(Enquire_now_rev));
		       
		       String IB = text.getText();
		       
		           
		       Assert.assertEquals(IB, Enquire_now_data);
		       
		       System.out.println(IB);
		       
		       driver.close();
   
	    }
	  //  Apply_now
	    @Test(priority = 28)
	    public void TESTCASES28() throws InterruptedException {
	       
	    	
	    	 Actions actions = new Actions(driver);
	    	 
	    	 WebElement hoverElement =driver.findElement(By.xpath(hoverElement_xpath));
	    	
	    	 actions.moveToElement(hoverElement).perform();
	    	 
	    	 Thread.sleep(2000);
	    	driver.findElement(By.xpath(Apply_now)).click();
	    	Thread.sleep(2000); 
		    
		       System.out.println("Clickable");
		       
		       driver.close();
   
	    }
	   // master and bachlor program click
	    @Test(priority = 29)
	    public void TESTCASES29() throws InterruptedException {
	        
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        // Scroll down by 1000 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	    
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath(Bachelors_Degree)).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath(Masters_Degree)).click();
	        
	        Thread.sleep(2000);
	       
	       
	       driver.close();
   
	    }
	   // enquiry form fill
	    @Test(priority = 30)
	    public void TESTCASES30() throws InterruptedException {
	     
	        driver.findElement(By.xpath(Enquire_now)).click();
	     	        
		    driver.findElement(By.id(Name_id)).sendKeys(Name);
		       
		    driver.findElement(By.id(email_id)).sendKeys(email);
		    
		    driver.findElement(By.id(phone_id)).sendKeys(phone);
		    
		  //  driver.findElement(By.xpath(get_otp)).click();

		   // Thread.sleep(2000);
		   // driver.findElement(By.id(otp_id)).sendKeys(otp);
		    
		    //fill manually 
		    
		  //  driver.findElement(By.xpath(verify_otp)).click();
		    
		    WebElement stateListbox = driver.findElement(By.name("state"));

	        // Create a Select object and pass the listbox element
	        Select select = new Select(stateListbox);

	        // Example: Select an option by visible text
	        select.selectByValue("Maharashtra");
	        
	        WebElement cityListbox = driver.findElement(By.id("city"));
	        Select citySelect = new Select(cityListbox);
	        citySelect.selectByValue("Jalna");

	        // Handling 'program' listbox
	        WebElement programListbox = driver.findElement(By.id("program"));
	        Select programSelect = new Select(programListbox);
	        programSelect.selectByVisibleText("MBA");

	        // Handling 'elective' listbox
	        WebElement electiveListbox = driver.findElement(By.id("elective"));
	        Select electiveSelect = new Select(electiveListbox);
	        electiveSelect.selectByVisibleText("Finance");
		    System.out.println("form is working");
		    driver.close();
	    }
	   // Apply now Banner 1st 
	    @Test(priority = 31)
	    public void TESTCASES31() throws InterruptedException {
	      

	    	 Actions actions = new Actions(driver);
	    	 
	    	 WebElement hoverElement =driver.findElement(By.xpath(hoverElement_xpath));
	    	
	    	 actions.moveToElement(hoverElement).perform();
	    	 
	    	 Thread.sleep(2000);
	    	driver.findElement(By.xpath(Apply_now)).click();
	    	Thread.sleep(2000); 
		    
		       System.out.println("Clickable");
		       
		       driver.close();
	    }
	    // Apply now Banner 2nd in side scroll
	    @Test(priority = 32)
	    public void TESTCASES32() throws InterruptedException {
	      

	    	 Actions actions = new Actions(driver);
	    	 
	    	 WebElement hoverElement =driver.findElement(By.xpath(hoverElement_xpath_2nd));
	    	 Thread.sleep(2000);
	    	 actions.moveToElement(hoverElement).perform();
	    	 
	    	 Thread.sleep(2000);
	    	driver.findElement(By.xpath(hoverElement_xpath_2nd)).click();
	    	Thread.sleep(2000); 
		    
		       System.out.println("Clickable");
		       
		       driver.close();
	    }
	    
	  //  master program
	    @Test(priority = 33)
	    public void TESTCASES33() throws InterruptedException {
	     
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        // Scroll down by 1000 pixels
	        js.executeScript("window.scrollBy(0,1150)");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath(Apply_now_finance)).click();
		       
		       System.out.println("its Clicable for finance");
		        
		       driver.close();
	       
   
	    }
	    //bachalor program
	    @Test(priority = 34)
	    public void TESTCASES34() throws InterruptedException {
	     
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        // Scroll down by 1000 pixels
	        js.executeScript("window.scrollBy(0,900)");
	        
		        
		      driver.findElement(By.xpath(Bachelors_Degree)).click();
		      
		      
		      driver.findElement(By.xpath(international_finance)).click();
		       
		
		        
		            System.out.println("its Clicable for internation finance bachlor");
		        
		       driver.close();
	       
   
	    }  
	  // WHATSAPP NO CHECK
	    @Test(priority = 35)
	    public void TESTCASES35() throws InterruptedException {
	     
	    	driver.findElement(By.xpath(whatsapp_xpath)).click(); 
	    	
	    	
	    	Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            for (String window : allWindows) {
                if (!window.equals(originalWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL);
	    	
	    	System.out.println("URL is correct");
	    	
	    	
		       driver.close();
	       
   
	    }  
	    
	    //Phone NO CHECK
	    @Test(priority = 36)
	    public void TESTCASES36() throws InterruptedException {
	     
	    	 Actions actions = new Actions(driver);
	    	 
	    	 WebElement hoverElement =driver.findElement(By.xpath(call_button));
	    	
	    	 actions.moveToElement(hoverElement).perform();
	    	 
	    	 Thread.sleep(2000);
	    	 WebElement hoverElement_2 =driver.findElement(By.xpath(call_no));
		    	
	    	 actions.moveToElement(hoverElement_2).perform();

	    	String current_no= driver.findElement(By.xpath(call_no)).getText();
	    	  Assert.assertEquals(current_no, Expected_NO);
	    	
	    	System.out.println("the no is correect "+current_no);
	    	driver.close();
	    	
	}
		  // International_business
	    @Test(priority = 37)
	    public void TESTCASES37() throws InterruptedException {
	        // International Business
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(International_business)).click();  
	        Thread.sleep(2000);
	    driver.findElement(By.xpath(Apply_now_on_elective)).click();
	        
	    
	    Thread.sleep(2000);
    	
    	String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	 
    	String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Optionally, use an assertion to verify the URL
        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
    	
    	System.out.println("URL is correct");
	       
    	  driver.quit();
	    }
	  //  Project_Management
	    @Test(priority = 38)
	    public void TESTCASES38() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Project_Management)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Marketing
	    @Test(priority = 39)
	    public void TESTCASES39() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Marketing)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Finance
	    @Test(priority = 40)
	    public void TESTCASES40() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Finance)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Logistic_and_Supply_Chain_Management
	    @Test(priority = 41)
	    public void TESTCASES41() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Logistic_and_Supply_Chain_Management)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Operations_Management
	    @Test(priority = 42)
	    public void TESTCASES42() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Operations_Management)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	   // Human_Resource_Management
	    @Test(priority = 43)
	    public void TESTCASES43() throws InterruptedException {
	     
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Human_Resource_Management)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //Digital_Marketing_and_E_commerce
	    @Test(priority = 44)
	    public void TESTCASES44() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Digital_Marketing_and_E_commerce)).click();
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	   // Data_Science_and_Analytics
	    @Test(priority = 45)
	    public void TESTCASES45() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Data_Science_and_Analytics)).click();
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //	International_Finance
	    @Test(priority = 46)
	    public void TESTCASES46() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(International_Finance)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Healthcare_and_Hospital_Administration
	    @Test(priority = 47)
	    public void TESTCASES47() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Healthcare_and_Hospital_Administration)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
	    // Cyber Security
	    @Test(priority = 48)
	    public void TESTCASES48() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Cyber_Security)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	 //Artificial Intelligence
	    @Test(priority = 49)
	    public void TESTCASES49() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Artificial_Intelligence)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //Cloud Computing
	    @Test(priority = 50)
	    public void TESTCASES50() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Cloud_Computing)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //Computer Science and Information Technology
	    @Test(priority = 51)
	    public void TESTCASES51() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Computer_Science_and_Information_Technology)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
	  //Data Science
	    @Test(priority = 52)
	    public void TESTCASES52() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Data_Science)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
	  //Accounting and Finance
	    @Test(priority = 53)
	    public void TESTCASES53() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mcom_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Accounting_and_Finance)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //International Finance (Integrated by ACCA, UK)
	    @Test(priority = 54)
	    public void TESTCASES54() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mcom_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(International_Finance_in_mcom)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //BBA_program
	    @Test(priority = 55)
	    public void TESTCASES55() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program_in_BBA)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //BBA
	    @Test(priority = 56)
	    public void TESTCASES56() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(International_Finance_in_BBA)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //BCA_program
	    @Test(priority = 57)
	    public void TESTCASES57() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BCA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BCA_program_in_BCA)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
	    //BA_program
	    @Test(priority = 58)
	    public void TESTCASES58() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BA_Political_Science_program)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	   
	    
		  // International_business
	    @Test(priority = 59)
	    public void TESTCASES59() throws InterruptedException {
	        // International Business
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(International_business)).click();  
	        Thread.sleep(2000);
	    driver.findElement(By.xpath(Download_Brochure_Button)).click();
	    
	        
	    
	    Thread.sleep(2000);
    	
    	String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	 
    	String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Optionally, use an assertion to verify the URL
        Assert.assertEquals(currentUrl, Expected_URL_of_International_business_Brochure);
    	
    	System.out.println("URL is correct");
	       
    	  driver.quit();
	    }
	  //  Project_Management
	    @Test(priority = 60)
	    public void TESTCASES60() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Project_Management)).click();
	        
	        Thread.sleep(2000);

	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Project_Management_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Marketing
	    @Test(priority = 61)
	    public void TESTCASES61() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Marketing)).click();
	        
	        Thread.sleep(2000);
		  
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Marketing_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Finance
	    @Test(priority = 62)
	    public void TESTCASES62() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Finance)).click();
	        
	        Thread.sleep(2000);
		   
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Finance_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Logistic_and_Supply_Chain_Management
	    @Test(priority = 63)
	    public void TESTCASES63() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Logistic_and_Supply_Chain_Management)).click();
	        
	        Thread.sleep(2000);
		   
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
	        
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Logistics_and_Supply_Chain_Management_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Operations_Management
	    @Test(priority = 64)
	    public void TESTCASES64() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Operations_Management)).click();
	        
	        Thread.sleep(2000);
		   
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Operations_Management_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	   // Human_Resource_Management
	    @Test(priority = 65)
	    public void TESTCASES65() throws InterruptedException {
	     
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Human_Resource_Management)).click();
	        
	        Thread.sleep(2000);


	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Human_Resource_Management_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //Digital_Marketing_and_E_commerce
	    @Test(priority = 66)
	    public void TESTCASES66() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Digital_Marketing_and_E_commerce)).click();
	        Thread.sleep(2000);
		  
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Digital_Marketing_and_E_commerce_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	   // Data_Science_and_Analytics
	    @Test(priority = 67)
	    public void TESTCASES67() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Data_Science_and_Analytics)).click();
	        Thread.sleep(2000);
		   
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Data_Science_and_Analytics_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //	International_Finance
	    @Test(priority = 68)
	    public void TESTCASES68() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(International_Finance)).click();
	        
	        Thread.sleep(2000);  
	        
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_International_Finance_Integrated_by_ACCA_UK_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Healthcare_and_Hospital_Administration
	    @Test(priority = 69)
	    public void TESTCASES69() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Healthcare_and_Hospital_Administration)).click();
	        
	        Thread.sleep(2000);
		   
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Healthcare_and_Hospital_Administration_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
	    // Cyber Security
	    @Test(priority = 70)
	    public void TESTCASES70() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Cyber_Security)).click();
	        
	        Thread.sleep(2000);

	        driver.findElement(By.xpath(Download_Brochure_Button)).click();     
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Cyber_Security_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	 //Artificial Intelligence
	    @Test(priority = 71)
	    public void TESTCASES71() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Artificial_Intelligence)).click();
	        
	        Thread.sleep(2000);

	        driver.findElement(By.xpath(Download_Brochure_Button)).click();      
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Artificial_Intelligence_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //Cloud Computing
	    @Test(priority = 72)
	    public void TESTCASES72() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Cloud_Computing)).click();
	        
	        Thread.sleep(2000);

	        driver.findElement(By.xpath(Download_Brochure_Button)).click();     
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Cloud_Computing_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //Computer Science and Information Technology
	    @Test(priority = 73)
	    public void TESTCASES73() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Computer_Science_and_Information_Technology)).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();     
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Computer_Science_and_Information_Technology_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
	  //Data Science
	    @Test(priority = 74)
	    public void TESTCASES74() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Data_Science)).click();
	        
	        Thread.sleep(2000);
	       
	        driver.findElement(By.xpath(Download_Brochure_Button)).click(); 
		   
	        Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Data_Science_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
	  //Accounting and Finance
	    @Test(priority = 75)
	    public void TESTCASES75() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mcom_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Accounting_and_Finance)).click();
	        
	        Thread.sleep(2000);

	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
	        
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Accounting_and_Finance_Brochure_in_mcom);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //International Finance (Integrated by ACCA, UK)
	    @Test(priority = 76)
	    public void TESTCASES76() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mcom_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(International_Finance_in_mcom)).click();
	        
	        Thread.sleep(2000);


	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_International_Finance_Integrated_by_ACCA_UK_Brochure_mcom);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //BBA_program
	    @Test(priority = 77)
	    public void TESTCASES77() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program_in_BBA)).click();
	        
	        Thread.sleep(2000);

	        driver.findElement(By.xpath(Download_Brochure_Button)).click();     
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_BBA_Program_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //BBA
	    @Test(priority = 78)
	    public void TESTCASES78() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(International_Finance_in_BBA)).click();
	        
	        Thread.sleep(2000);

	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
	        
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_International_Finance_in_bba);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //BCA_program
	    @Test(priority = 79)
	    public void TESTCASES79() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BCA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BCA_program_in_BCA)).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();  
		    
	        Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Online_BCA_Program_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
	    //BA_program
	    @Test(priority = 80)
	    public void TESTCASES80() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BA_Political_Science_program)).click();
	        
	        Thread.sleep(2000);

	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
	        
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	            
	           
	        }
	        
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_Political_Science_Brochure);
	    	
	    	System.out.println("URL is correct");
		     
	    	  driver.quit();
		    } 
	    
	}
