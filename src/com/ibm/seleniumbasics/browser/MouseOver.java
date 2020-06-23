package com.ibm.seleniumbasics.browser;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.com");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.partialLinkText("Products"))).perform();
		act.click(driver.findElement(By.linkText("Request a demo"))).perform();
		
		

	}

}
