package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class AutomationExercise {
	
	WebDriver driver = null;
	
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
    @Test (priority = 1)
	public void HomePage() throws InterruptedException {
		
    	driver.get("https://automationexercise.com/");
    	
    	Thread.sleep(3000);
    	
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
			
			
			String myTitle = driver.getTitle();
			
			System.out.println("Title is "+ myTitle);
			
			Thread.sleep(2000);
			
			Assert.assertTrue(myTitle.contains("Automation"));
			
			System.out.println("Home page is verified");
			
			
			String message = driver.findElement(By.tagName("h2")).getText();
			
			if(message.contains("Full-Fledged"))
			
			{
				message = "Full-Fledged";
				System.out.println(message);
			}
			
			Thread.sleep(3000);
			
			
    }
		
		/*
		//Load Home Page
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")).click();
		
		Thread.sleep(5000);
		
		System.out.println("Home page is loaded");*/
			
			
		
			@Test (priority = 2)
			public void AddProducts() throws InterruptedException {
				
				//driver.get("https://automationexercise.com/products");
				
				driver.findElement(By.cssSelector("a[href='/products']")).click();
		    	
		    	Thread.sleep(2000);
		    	
				
					
					//scroll-down
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(0,450)");
					//jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					
					Thread.sleep(2000);
					
					
					driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[2]/ul/li/a")).click();
					
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//button[@type='button']")).click();
					
					Thread.sleep(2000);
					
					
					
			}
			
			@Test (priority = 3)
			public void Cart_proceedToCheckOut() throws InterruptedException {
				
				//driver.get("https://automationexercise.com/products");
				
				driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")).click();
				Thread.sleep(2000);
				
				String myTitle2 = driver.getTitle();
				
				System.out.println("Title is "+ myTitle2);
				
				Thread.sleep(2000);
				
				Assert.assertTrue(myTitle2.contains("Checkout"));
				Thread.sleep(2000);
				
				System.out.println("Cart page is verified");
				Thread.sleep(2000);
				//click ckeck-out button
				driver.findElement(By.cssSelector(".btn.btn-default.check_out")).click();
				
				Thread.sleep(2000);
				
				
			}
			
			@Test (priority = 4)
			public void Registration() throws InterruptedException {
				
				//driver.get("https://automationexercise.com/products");
				
				//click register-login button
				driver.findElement(By.xpath("//u[normalize-space()='Register / Login']")).click();
				Thread.sleep(2000);
				
				//Name
				driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Tamim12");
				Thread.sleep(2000);
				
				//email
				driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("tamim12@dispostable.com");
				Thread.sleep(2000);
				
				//sign-up
				driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.cssSelector("#id_gender1")).click();
				
				//scroll-down
				JavascriptExecutor jse2 = (JavascriptExecutor)driver;
				jse2.executeScript("window.scrollBy(0,200)");
				
				driver.findElement(By.cssSelector("#password")).sendKeys("12345");
				
				
				//driver.findElement(By.cssSelector("#days")).click();
				
				
				//driver.findElement(By.cssSelector("#months")).click();
				
				//driver.findElement(By.cssSelector("#years")).click();
				
				/*Select days = new Select(driver.findElement(By.id("days")));
				days.selectByVisibleText("27");
				Thread.sleep(2000);
				
				Select months = new Select(driver.findElement(By.id("months")));
				months.selectByVisibleText("August");
				Thread.sleep(2000);
				
				Select year = new Select(driver.findElement(By.id("years")));
				year.selectByVisibleText("2003");
				Thread.sleep(2000); */
				
				driver.findElement(By.id("days")).sendKeys("6");
				Thread.sleep(2000);
				
				driver.findElement(By.id("months")).sendKeys("May");
				Thread.sleep(2000);
				
				driver.findElement(By.id("years")).sendKeys("2000");
				Thread.sleep(2000);
				
				driver.findElement(By.id("newsletter")).click();
				driver.findElement(By.id("optin")).click();
				Thread.sleep(2000);
				
				//scroll-down
				JavascriptExecutor jse3 = (JavascriptExecutor)driver;
				jse3.executeScript("window.scrollBy(0,200)");
				
				driver.findElement(By.id("first_name")).sendKeys("Tamim");
				driver.findElement(By.id("last_name")).sendKeys("Iqbal");
				driver.findElement(By.id("company")).sendKeys("BCB");
				Thread.sleep(2000);
				
				driver.findElement(By.id("address1")).sendKeys("Toronto");
				driver.findElement(By.id("address2")).sendKeys("Kingston");
				Thread.sleep(2000);
				
				driver.findElement(By.id("country")).sendKeys("Canada");
				Thread.sleep(2000);
				
				
				
				driver.findElement(By.id("state")).sendKeys("DHA");
				driver.findElement(By.id("city")).sendKeys("Dhaka city");
				Thread.sleep(2000);
				
				driver.findElement(By.id("zipcode")).sendKeys("1270");
				driver.findElement(By.id("mobile_number")).sendKeys("01675896686");
				Thread.sleep(2000);
				
				driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
				
				String message4 = driver.findElement(By.cssSelector("h2[class='title text-center'] b")).getText();
				
				if(message4.contains("Account"))
				
				{
					//message4 = "Full-Fledged";
					System.out.println(message4);
				}
				
				Thread.sleep(2000);
				
				//click on continue button
				//driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
				
			}
			
			@Test (priority = 5)
			public void LoggedIn() throws InterruptedException {
				
				//click on continue button
				driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
				
				Thread.sleep(3000);
				
                String msg_login = driver.findElement(By.cssSelector("li:nth-child(10) a:nth-child(1)")).getText();
				
				if(msg_login.contains("Logged"))
				
				{
					//message4 = "Full-Fledged";
					System.out.println(msg_login);
				}
				
				Thread.sleep(2000);
				
				//click on cart
				//*[@id="header"]/div/div/div/div[2]/div/ul/li[3]/a
				//html/body/header/div/div/div/div[2]/div/ul/li[3]/a
				
				driver.findElement(By.cssSelector("body > header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")).click();
				
				//click ckeck-out button
				driver.findElement(By.cssSelector(".btn.btn-default.check_out")).click();
				
				
				//verify address
                String address = driver.findElement(By.cssSelector("ul[id='address_delivery'] li:nth-child(1)")).getText();
				
				if(address.contains("Tor"))
				
				{
					//message4 = "Full-Fledged";
					System.out.println("Verified address is "+address);
				}
				
				Thread.sleep(2000);
			
				//Review order
                String order = driver.findElement(By.cssSelector("tbody tr td:nth-child(4) p:nth-child(1)")).getText();
				
				if(order.contains("Rs."))
				
				{
					//message4 = "Full-Fledged";
					System.out.println("Verified total amount is "+order);
				}
				
				Thread.sleep(2000);
				
				//scroll-down
				JavascriptExecutor jse5 = (JavascriptExecutor)driver;
				jse5.executeScript("window.scrollBy(0,200)");
				
				//order comment
				driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("This is a comment about my order.");
				
				//place order
				driver.findElement(By.xpath("//a[normalize-space()='Place Order']")).click();
				
				//Name on card
				driver.findElement(By.cssSelector("input[name='name_on_card']")).sendKeys("T.iqbal");
				Thread.sleep(2000);
				
				//Card Number
				driver.findElement(By.cssSelector("input[name='card_number']")).sendKeys("1111222233334417");
				Thread.sleep(2000);
				
				//CVC
				driver.findElement(By.cssSelector("input[placeholder='ex. 311']")).sendKeys("113");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[placeholder='MM']")).sendKeys("03");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[placeholder='YYYY']")).sendKeys("2027");
				Thread.sleep(2000);
				
				//click "Pay and Confirm Order"
				driver.findElement(By.id("submit")).click();
				
				//verify success message
				/*String success_msg = driver.findElement(By.cssSelector("div[id='success_message'] div[class='alert-success alert']")).getText();
				System.out.println(success_msg);*/
				
				
				
				
				
			}
    
    
	
	
    @AfterTest
	public void tearDownTest() throws InterruptedException {
		
        //driver.close();
		
		System.out.println("Test completed");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}

