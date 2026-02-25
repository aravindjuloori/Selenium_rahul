package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {

		// Invoking the browser

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait to overcome sync issues

		WebElement username = driver.findElement(By.id("inputUsername"));
		/*
		 * String inputusername=username.getDomAttribute("placeholder");
		 * System.out.println(inputusername);
		 */
		

		driver.findElement(By.id("inputUsername")).sendKeys("Aravind"); // sending values using id locator

		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); // sending values using the name locator

		// driver.findElement(By.className("signInBtn")).click(); //clicking the button
		// using the classname locator
		driver.findElement(By.cssSelector("button.submit.signInBtn")).click();
		Thread.sleep(3000);

		// 1.CSS selector classname and tagname ---tagname.classname
		// 2.CSS selector ID and tagname===tagname#id
		// 3.Css selector tagname[attribute='value]

		String errormessage = driver.findElement(By.cssSelector("p.error")).getText(); // using css selector with class

		Assert.assertEquals(errormessage, "* Incorrect username or password");
		// System.out.println(errormessage);

		driver.findElement(By.linkText("Forgot your password?")).click(); // using linktext

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john"); //1.xpath

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com"); // CSS 3rd way
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); // Xpath with indexing concept
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("aravind@gmail.com"); // CSS selector with index concept
		
								
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1233232");   //xpath with //parenttag/childtag  
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();   //using css selector
		
		
		String ErrorMessage=driver.findElement(By.cssSelector("form p")).getText();  //CSS with parent and child traverse mechanism
		System.out.println(ErrorMessage);
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();  //using //parenttage/childtag
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Aravind");  //CSS selector #id
		
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");  //Css regular expression
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();  //Xpath regular expression
		
		//driver.quit();

	}

}
