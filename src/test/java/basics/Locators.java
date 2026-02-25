package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Step 1--Invoking the browser
		
		//Chrome --ChromeDriver class ---methods will help us to automate on chrome browser
		//Firefox--FirefoxDriver-methods
		//Safari--SafariDriver-methods
		//Web driver methods+chrome driver methods
		
		//WebDriver driver;
		
		//chromedriver.exe --chrome browser
		//Step to invoke the chrome browser
		//Selenium manager
		
		//System.setProperty("webdriver.chrome.driver","path of the .exe file");
		
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","path of the .exe file");
		
		//WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.edge.driver","path of the .exe file");
		
		//WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.getTitle());   //to get the page title
		System.out.println(driver.getCurrentUrl());   // to print the current url
		
		/*
		 * driver.findElement(By.cssSelector(".blinkingText")).click();
		 * 
		 */
		//driver.close();
		//driver.quit();
		//Instantiate Action Class        
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover 
    	WebElement menuOption = driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
    	//Mouse hover menuOption 'Music'
    	actions.moveToElement(menuOption).perform();
    	
    	List<WebElement> links=driver.findElements(By.xpath("//*[@id=\"nav-al-wishlist\"]/ul/li/a/span"));	
    	System.out.println(links.size());
    	for(int i=0;i<links.size();i++) {
    		String linkstext=links.get(i).getText();
    		//System.out.println(linkstext);
			
			  if(linkstext.equalsIgnoreCase("Baby Wishlist")) { 
				  links.get(i).click();
				  }
			 
    	}
    	System.out.println(driver.getTitle());
    	driver.quit();
		
	}

}
