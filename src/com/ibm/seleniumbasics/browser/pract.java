package com.ibm.seleniumbasics.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pract {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver(); // launching browser
		driver.get("https://onedrive.live.com/edit.aspx?action=edit&resid=EE03A500A8D943C8!2825&ithint=file%2cxlsx&wdNewAndOpenCt=1592244456858&wdPreviousSession=34146cad-cc7b-4913-a57b-afc1bbd13b79&wdOrigin=OFFICECOM-WEB.MAIN.UPLOAD");
//	WebElement user = 	driver.findElement(By.id("i0116"));
//	user.click();
//	user.sendKeys("Hello");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait (driver,30);
	Thread.sleep(18000);
	
	System.out.println("hello");
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"m_excelWebRenderer_ewaCtl_Jewel-Default\"]")));
	System.out.println("hello");
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"m_excelWebRenderer_ewaCtl_Jewel-Default\"]")));
    System.out.println("hello");
	driver.findElement(By.xpath("//*[@id=\"m_excelWebRenderer_ewaCtl_Jewel-Default\"]")).click();
	System.out.println("hello");
}
	
}
