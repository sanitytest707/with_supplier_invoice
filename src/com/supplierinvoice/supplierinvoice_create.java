package com.supplierinvoice;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

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
import org.testng.annotations.BeforeMethod;

public class supplierinvoice_create {
	static WebDriver driver = null;
	static {
		System.setProperty("webdriver.chrome.driver", "/home/grajan/Desktop/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://www.apptivo.com");

		driver.manage().window().maximize();
	}
	@BeforeMethod
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
    public void supplierinvoice_create() throws InterruptedException {
    	driver.findElement(By.linkText("Financials")).click();
        driver.findElement(By.cssSelector(".open li:nth-child(6) .ng-binding")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.findElement(By.cssSelector(".clearfix > .btn")).click();
        driver.findElement(By.linkText("Create New SupplierInvoice")).click();
//        {
//          WebElement element = driver.findElement(By.cssSelector("#apptivo-ui-renderer_1573250631648_167_995521573250631648_965__supplier_invoice_details_section .pnl-clr"));
//          Actions builder = new Actions(driver);
//          builder.moveToElement(element).perform();
//        }
        {
          WebElement element = driver.findElement(By.cssSelector(".input-group-btn > .btn:nth-child(2)"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".icon-plus")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.findElement(By.id("supplier_name_attr")).sendKeys("Test 17");
        driver.findElement(By.cssSelector(".text-right:nth-child(1) > .btn")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.findElement(By.id("invoice_number_attr")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.findElement(By.id("invoice_number_attr")).sendKeys("123");
        driver.findElement(By.id("apptivo-attribute-container_tags_attr")).click();
        {
          WebElement element = driver.findElement(By.id("addbtn_item_line_section"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).perform();
        }
        driver.findElement(By.id("addbtn_item_line_section")).click();
        {
          WebElement element = driver.findElement(By.cssSelector(".input-group-btn:nth-child(3) > .btn:nth-child(2)"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).perform();
        }

        driver.findElement(By.cssSelector("apptivo-create-reference .btn:nth-child(1)")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.findElement(By.cssSelector(".cssTableRow:nth-child(1) > .cssTableCell > .cssTableCellContent .seltext")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)");
        driver.findElement(By.cssSelector(".btn:nth-child(4)")).click();
        js.executeScript("window.scrollTo(0,0)");
        driver.findElement(By.id("apptivo-attribute-container_supplier_invoice_billing_address_attr")).click();
        {
          WebElement element = driver.findElement(By.cssSelector("#apptivo-attribute-container_supplier_name_attr .btn:nth-child(1)"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).perform();
        }
		Thread.sleep(5000);
        driver.findElement(By.cssSelector(".confirm_msg_txt")).click();
        ScreenCapture("Supplierinvoice_created");
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
