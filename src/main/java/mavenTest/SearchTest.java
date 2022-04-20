package mavenTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchTest {
	public WebDriver driver;
	@BeforeTest
	public void setUp() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
	}
	
	@Test
	public void search() {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Reporter.log("sending queries to the search box");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
