package basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("name")).sendKeys("Aravind");
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept();

	}

}
