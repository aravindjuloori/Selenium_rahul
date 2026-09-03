package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException  {
		String name="Aravind";
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver=new FirefoxDriver();
		
//		WebDriver driver=new EdgeDriver();

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name); // Locating the element by #id attribute
		driver.findElement(By.name("inputPassword")).sendKeys(password); // Locating the element by $name attribute
		driver.findElement(By.className("signInBtn")).click(); // Locating the element by #className attribute
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());  //using tagName
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.quit();
		
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click(); // Using the locator linkText
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();   //css with tagname and class name
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();   //css with parenttag childtag
		String passwordArray[]=passwordText.split("'");
		System.out.println(passwordArray[0]);
		System.out.println(passwordArray[1]);
		
		String passwordArray2[]=passwordArray[1].split("'");
		
		String password=passwordArray2[0];
		return password;
		
	}

}
