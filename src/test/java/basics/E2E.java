package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();

		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-active")).click();

		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
			System.out.println("Its disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.id("divpaxinfo")).click();
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		WebElement currencydropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(currencydropdown);
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		// driver.findElement(By.cssSelector("input[value='Search']")).click();
		// driver.findElement(By.xpath("//input[@value='Search']")).click();
		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	}

}
