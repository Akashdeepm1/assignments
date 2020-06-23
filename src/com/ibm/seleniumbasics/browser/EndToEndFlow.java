package com.ibm.seleniumbasics.browser;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EndToEndFlow {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button")).click();
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/div"))).perform();
        act.click(driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[2]/div"))).perform();
        
        Thread.sleep(5000);
        
        driver.switchTo().frame("pat");
        Select title = new Select(driver.findElement((By.id("form_title"))));
        
        title.selectByValue("Mr.");
        driver.findElement(By.id("form_fname")).sendKeys("abc");
        driver.findElement(By.id("form_lname")).sendKeys("def");
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(dt));
//   WebElement dob =    driver.findElement(By.id("form_DOB"));
//   dob.sendKeys("2020-06-11");
   Thread.sleep(4000);
   
   driver.findElement(By.id("form_DOB")).click();
   Thread.sleep(3000);
   driver.findElement(By.className("xdsoft_today")).click();
   Select gender = new Select(driver.findElement(By.id("form_sex")));
   gender.selectByValue("Male");
   driver.findElement(By.id("create")).click();
   
//   dob.click();
//   Select sex = new Select(driver.findElement(By.id("form_sex")));
//   sex.deselectByValue("Male");
//   driver.findElement(By.id("create")).click();
   
   driver.switchTo().defaultContent();
   
   driver.switchTo().frame("modalframe");
   Thread.sleep(4000);
   //driver.findElement(By.xpath(".//input[@value='Confirm Create New Patient']")).click();
   driver.findElement(By.xpath(".//input[@type='button']")).click();
   driver.switchTo().defaultContent();
   
   Thread.sleep(3000);
   
   System.out.println(driver.switchTo().alert().getText());
   Thread.sleep(3000);
   driver.switchTo().alert().accept();
   
   Thread.sleep(4000);
   
   driver.findElement(By.xpath(".//div[@class='closeDlgIframe']")).click();
   
   act.moveToElement(driver.findElement(By.xpath((".//div[@class='userSection']")))).perform();
   driver.findElement(arg0)
        
}
}
