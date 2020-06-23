package com.ibm.seleniumbasics.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts_pdf {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.sejda.com/pdf-editor");
		driver.findElement(By.name("file")).sendKeys("C:\\Users\\AkashDeep\\Downloads\\chart.pdf");

}
}