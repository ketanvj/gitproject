package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Wikipedia {
	WebDriver driver;

//	@Test
	public void wikipediaTest() throws InterruptedException {
		driver.get("http://www.wikipedia.org");
		driver.findElement(By.id("js-link-box-en")).click();
		driver.findElement(By.name("search")).sendKeys("Selenium");
		Thread.sleep(3000);	
	}
	
	@Test
	public void FormTest() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("25 Feb 2023");
		Thread.sleep(4000);
	}
	

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		// WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
