package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name="Aravind";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); 
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		String ActualText=driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(ActualText, "You are successfully logged in.");
		
			String ValidateUsername=driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
			Assert.assertEquals(ValidateUsername,"Hello "+name+",");
			
			driver.findElement(By.xpath("//*[text()='Log Out']")).click();

	}

}
