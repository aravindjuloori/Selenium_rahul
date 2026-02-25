package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		
		String name="Aravind";
		WebDriver driver = new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		Thread.sleep(2000);
		String capturedpassword=getPassword(driver);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(capturedpassword);  //Css regular expression
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		driver.quit();
		
	}

	
		public static String getPassword(WebDriver driver) throws InterruptedException {
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			String passwordText=driver.findElement(By.cssSelector("form p")).getText();
			System.out.println(passwordText);
				String[] passwordArray=passwordText.split("'");
				//System.out.println(passwordArray[1]);
				String password=passwordArray[1];
			//System.out.println(passwordText);
				return password;
			
			
		}
}
