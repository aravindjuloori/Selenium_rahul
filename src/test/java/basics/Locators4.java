package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//sibling- sibling and child-->parent
		
		String loginText=driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();   //sibling and parent to child traverse
		
		System.out.println(loginText);
		String loginText1=driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
		System.out.println(loginText1);
		
		driver.quit();
		
	}

}
