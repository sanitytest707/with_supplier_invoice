package com.invoice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class invoice_create {
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
	public void invoice_create() throws InterruptedException {
		driver.findElement(By.linkText("Financials")).click();
		driver.findElement(By.cssSelector(".open li:nth-child(9) .ng-binding")).click();
		driver.findElement(By.cssSelector(".clearfix > .btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".modal-footer > .btn")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(".input-group-btn:nth-child(4) > .btn:nth-child(2)")));

		driver.findElement(By.cssSelector(".input-group-btn:nth-child(4) > .btn:nth-child(2)")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("cust_name_attr")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("cust_name_attr")).sendKeys("testname24");
		// WebDriverWait wait1 = new WebDriverWait(driver,30);
		// wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ng-untouched:nth-child(2)")));
		// driver.findElement(By.cssSelector(".inpcon >
		// .form-control")).click();
		// driver.findElement(By.cssSelector(".ng-untouched:nth-child(2)")).sendKeys("testname4@berijam.com");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector(".pull-right > .fltrgt")).click();
		Thread.sleep(5000);

		{
			WebElement element = driver.findElement(By.id("addbtn_item_line_section"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		driver.findElement(By.id("addbtn_item_line_section")).click();
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		driver.findElement(By.cssSelector(".input-group-btn:nth-child(3) .icon-search")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".seltext")).click();
		// driver.findElement(By.cssSelector(".input-group-btn:nth-child(3)
		// .icon-plus")).click();
		// Thread.sleep(5000);
		// driver.findElement(By.cssSelector(".pd0 >
		// .ng-valid-maxlength")).sendKeys("test item 3");
		// driver.findElement(By.cssSelector(".form-group:nth-child(5)
		// .apptivo-decimal-attribute")).click();
		// Thread.sleep(5000);
		// driver.findElement(By.cssSelector(".ng-not-empty")).sendKeys("100");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//
		// driver.findElement(By.cssSelector(".modal-content")).click();
		// driver.findElement(By.cssSelector(".modal-footer > .btn")).click();
		// driver.findElement(By.cssSelector(".btn-primary:nth-child(3)")).click();
		// driver.findElement(By.cssSelector("#apptivo-attribute-container_customer_attr
		// .chat-meta")).click();
		Thread.sleep(5000);

		{
			WebElement element = driver
					.findElement(By.cssSelector("#apptivo-attribute-container_contact_attr .btn:nth-child(1)"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver
					.findElement(By.cssSelector("apptivo-attribute-help-text:nth-child(1) .apphelp"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		driver.findElement(By.cssSelector(".btn-primary:nth-child(3)")).click();
		// driver.findElement(By.cssSelector("#ui-select-choices-row-5-3 >
		// .select2-result-label > div")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".confirm_msg_txt")));
		driver.findElement(By.cssSelector(".confirm_msg_txt")).click();
		Thread.sleep(5000);
		ScreenCapture("Invoice_created");

	}

	@Test(priority = 2)
	public void Invoice_update() throws InterruptedException {

		driver.findElement(By.cssSelector(".nav-header:nth-child(1) > a > span")).click();
		{
			WebElement element = driver.findElement(By.linkText("Show All"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.cssSelector(".rightAction0 .btn"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		driver.findElement(By.cssSelector(".rightAction0 .moreicn")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#apptivo-attribute-container_po_wo_number_attr > .viewObject")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#po_wo_number_attr")).sendKeys("123");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Save")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".confirm_msg_txt")).click();
		Thread.sleep(5000);
		ScreenCapture("Invoice_Updated");
		Thread.sleep(5000);

	}
	
	@Test(priority = 3)
	public void Invoiceprint_PDF() {
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
		
		ScreenCapture("Invoiceprint_PDF");

	}


	@Test(priority = 4)
	public void Invoice_send() throws InterruptedException {
		driver.findElement(By.cssSelector(".sendemaillnk")).click();
		Thread.sleep(5000);
		{
			WebElement element = driver.findElement(By.cssSelector(".sendemaillnk"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
	    driver.findElement(By.cssSelector(".modal-footer > .btn-primary")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@type='email']"));
	    	    
	    WebElement sendinvoice = driver.findElement(By.xpath("//input[@type='email']"));
	
	    if(sendinvoice.isDisplayed()){
	    	sendinvoice.sendKeys("testguna123@gmail.com");
	    }
	    else{
	   WebElement newsendinvoice = driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div/div/div"));                                     
	        newsendinvoice.sendKeys("testguna123@gmail.com");
	       // System.out.println("This is new login");
	    }
	    	    
	    
		Thread.sleep(5000);
	    driver.findElement(By.cssSelector(".outlnon")).click();
		Thread.sleep(5000);

	    driver.findElement(By.cssSelector(".fltrgt:nth-child(4)")).click();
		Thread.sleep(7000);
	    driver.findElement(By.cssSelector(".confirm_msg_txt")).click();
		Thread.sleep(5000);
		ScreenCapture("Invoice_send");
		
	   
	    
	}

	private static void ScreenCapture(String appName) {

		String fileName = "" + appName + ".png";
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File screenshotName = new File("/home/grajan/Guna/Estimate/invoice_test-output/Suite" + fileName);
		try {
			FileUtils.copyFile(srcFile, screenshotName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("<br><img src='/home/grajan/Guna/Estimate/invoice_test-output/Suite" + fileName
				+ "'height='768' width='1536'/><br>");
	}
}
