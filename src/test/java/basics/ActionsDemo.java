package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions a=new Actions(driver);
		WebElement signin=driver.findElement(By.cssSelector("#nav-link-accountList"));
		
	
		
		WebElement searchBox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		
		a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		//move to specific element 
		a.moveToElement(signin).contextClick().build().perform();
		
	}

}
