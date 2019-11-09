package com.estimate;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Estimate_create {
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
		driver.findElement(By.id("login_email")).sendKeys("gunasan@berijam.com");
		driver.findElement(By.id("login_password")).sendKeys("Welcome123");
		driver.findElement(By.cssSelector("#sign_up_button > strong")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Estimatecreate() {

		driver.findElement(By.linkText("Financials")).click();
		driver.findElement(By.cssSelector(".open li:nth-child(11) .ng-binding")).click();
		driver.findElement(By.cssSelector(".clearfix > .btn")).click();
		driver.findElement(By.linkText("Create New Estimate")).click();
		driver.findElement(By.cssSelector(".modal-footer > .btn")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".input-group-btn:nth-child(4) .icon-plus")).click();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollTo(0,0)");
		// js.executeScript("window.scrollTo(0,0)");
		driver.findElement(By.id("cust_name_attr")).sendKeys("GunaSan017");
		driver.findElement(By.cssSelector(".pull-right > .fltrgt")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		{
			WebElement element = driver.findElement(By.id("addbtn_service_line_section"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		driver.findElement(By.cssSelector("#addbtn_item_line_section > .p_i")).click();
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".input-group-btn:nth-child(3) .icon-search")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".seltext")).click();
		// driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("1");
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// driver.findElement(By.xpath("//input[@id='service_rate_attr']")).click();
		// driver.findElement(By.xpath("//input[@id='service_rate_attr']")).sendKeys("1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".apppanel:nth-child(3) .form-horizontal > .mgn0")).click();
		driver.findElement(By.cssSelector(".btn-primary:nth-child(2)")).click();
		// js.executeScript("window.scrollTo(0,0)");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// {
		// WebElement element =
		// driver.findElement(By.cssSelector(".usrname:nth-child(4) >
		// .ng-scope"));
		// Actions builder = new Actions(driver);
		// builder.moveToElement(element).perform();
		// }

		// driver.findElement(By.cssSelector(".usrname:nth-child(2)")).click();
		// driver.findElement(By.cssSelector(".btn-default:nth-child(2)")).click();
		
		ScreenCapture("Estimatecreate");

	}
	
	

	@Test(priority = 2)
	public void Estimateupdate() {

		// driver.findElement(By.linkText("Financials")).click();
		// {
		// WebElement element =
		// driver.findElement(By.cssSelector("li:nth-child(13) .ng-binding"));
		// Actions builder = new Actions(driver);
		// builder.moveToElement(element).perform();
		// }
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// {
		// WebElement element = driver.findElement(By.tagName("body"));
		// Actions builder = new Actions(driver);
		// builder.moveToElement(element, 0, 0).perform();
		// }
		// driver.findElement(By.cssSelector(".openli:nth-child(11).ng-binding")).click();
		driver.findElement(By.cssSelector(".nav-header:nth-child(1) > a")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// {
		// WebElement element =
		// driver.findElement(By.cssSelector(".rightAction0.btn"));
		// Actions builder = new Actions(driver);
		// builder.moveToElement(element).perform();
		// }
		// {
		// WebElement element = driver.findElement(By.tagName("body"));
		// Actions builder = new Actions(driver);
		// builder.moveToElement(element, 0, 0).perform();
		// }
		driver.findElement(By.cssSelector(".rightAction0 .moreicn")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector("#apptivo-attribute-container_contact_attr .viewObject")).click();
		// {
		// WebElement element =
		// driver.findElement(By.cssSelector("#apptivo-attribute-container_contact_attr.btn:nth-child(2)"));
		// Actions builder = new Actions(driver);
		// builder.moveToElement(element).perform();
		// }
		driver.findElement(By.linkText("Save")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ScreenCapture("Estimateupdate");

	}

	@Test(priority = 3)
	public void Estimateprint_PDF() {
		// {
		// WebElement element =
		// driver.findElement(By.cssSelector(".btn-primary:nth-child(2)"));
		// Actions builder = new Actions(driver);
		// builder.moveToElement(element).perform();
		// }
		driver.findElement(By.cssSelector(".mgnlft0")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ScreenCapture("Estimateprint_PDF");

	}

	@Test(priority = 4)
	public void Estimate_send_email() {

		driver.findElement(By.cssSelector(".btn-primary:nth-child(2)")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".modal-footer > .btn-primary")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".to_auto_box")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// driver.findElement(By.cssSelector(".ng-dirty:nth-child(1)")).click();
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		driver.findElement(By.cssSelector(".to_auto_box > .rmmcr")).sendKeys("testguna123@gmail.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".input-sm")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".aside-footer > .btn-primary")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			driver.findElement(By.cssSelector(".confirm_msg_txt")).click();
		} catch (Exception e) {
			System.out.println(e);
		}
		ScreenCapture("Estimate_send_email");
	}
	private static void ScreenCapture(String appName) {

		String fileName = "" + appName + ".png";
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File screenshotName = new File("/home/grajan/Guna/Estimate/test-output/Suite" + fileName);
		try {
			FileUtils.copyFile(srcFile, screenshotName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("<br><img src='/home/grajan/Guna/Estimate/test-output/Suite" + fileName+ "'height='768' width='1536'/><br>");
	}
}
