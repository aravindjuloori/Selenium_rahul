package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("inputUsername")).sendKeys("Aravind"); // Locating the element by #id attribute
		driver.findElement(By.name("inputPassword")).sendKeys("sfqatest"); // Locating the element by $name attribute
		driver.findElement(By.className("signInBtn")).click(); // Locating the element by #className attribute

		String errorText = driver.findElement(By.cssSelector("p.error")).getText(); // Using css selector with
																					// tagName.className
		System.out.println(errorText);

		driver.findElement(By.linkText("Forgot your password?")).click(); // Using the locator linkText
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Aravind Juloori"); // Using the locator
																									// Xpath
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("aravind.juloori@gmail.com"); // using
																												// css
																												// selector
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); // using xpath with the indexing concept
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com"); // using css
																											// selector
																											// with
																											// indexing
																											// concept
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1232323"); // xpath with parenttag/child tagname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // css with tagname and class name
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); // css with parenttag childtag

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); // xpath with
																									// parent/child
																									// tagid
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Aravind"); // Css with tagname and id
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // Css regular
																									// expression
		driver.findElement(By.id("chkboxOne")).click(); // using id
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); // Xpath with regular expression

//		Thread.sleep(2000);
//		driver.quit();

	}

}