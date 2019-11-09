package com.estimate;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Estimate_update {
	static WebDriver driver = null;
	static {
		System.setProperty("webdriver.chrome.driver", "/home/grajan/Desktop/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://www.apptivo.com");

		driver.manage().window().maximize();
	}

	@BeforeTest
	public void UserLogin() {

		driver.get("https://www.apptivo.com/");
		driver.manage().window().setSize(new Dimension(1920, 1032));
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.id("login_email")).sendKeys("Testng@berijam.com");
		driver.findElement(By.id("login_password")).sendKeys("Welcome123");
		driver.findElement(By.cssSelector("#sign_up_button > strong")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Estimateupdate() {

		driver.findElement(By.linkText("Financials")).click();
//		{
//			WebElement element = driver.findElement(By.cssSelector("li:nth-child(13) .ng-binding"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element).perform();
//		}
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		{
//			WebElement element = driver.findElement(By.tagName("body"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element, 0, 0).perform();
//		}
		driver.findElement(By.cssSelector(".open li:nth-child(11) .ng-binding")).click();
//		{
//			WebElement element = driver.findElement(By.cssSelector(".rightAction0 .btn"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element).perform();
//		}
//		{
//			WebElement element = driver.findElement(By.tagName("body"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element, 0, 0).perform();
//		}
		driver.findElement(By.cssSelector(".rightAction0 .moreicn")).click();
		driver.findElement(By.cssSelector("#apptivo-attribute-container_contact_attr .viewObject")).click();
//		{
//			WebElement element = driver.findElement(By.cssSelector("#apptivo-attribute-container_contact_attr .btn:nth-child(2)"));
//			Actions builder = new Actions(driver);
//			builder.moveToElement(element).perform();
//		}
		driver.findElement(By.linkText("Save")).click();
	}

}
