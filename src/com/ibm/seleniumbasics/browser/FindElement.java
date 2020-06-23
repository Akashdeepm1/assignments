package com.ibm.seleniumbasics.browser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElement {

	/**
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait (driver,30);
		
		driver.get("http://magento.com");
		WebElement user_icon = driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div"));
		//user_icon.clear();
        //user_icon.click();
//      System.out.println(  user_icon.getAttribute("class"));
//      System.out.println(  user_icon.getAttribute("id"));
//      System.out.println(user_icon.getCssValue("background-image"));
//          System.out.println(user_icon.getLocation());
//       byte [] ss = user_icon.getScreenshotAs(OutputType.BYTES);
//       @SuppressWarnings("resource")
//	FileOutputStream fos = new FileOutputStream("UserIcon.png");
//       fos.write(ss);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
	    driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
	    
	    WebElement user_email = driver.findElement(By.id("email"));
	    user_email.clear();
	    user_email.sendKeys("akashdeepm11@gmail.com");
	    
	    WebElement pwd = driver.findElement(By.id("pass"));
	    pwd.clear();
	    pwd.sendKeys("welcone");
	    
	    
	    driver.findElement(By.id("send2")).click();
	    
	    wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"), "Invalid login or password."));
      System.out.println("as expected");
      
      Thread.sleep(3000);
      
    driver.findElement(By.id("register")).click();
    
   driver.findElement(By.id("firstname")).sendKeys("Akash");
   driver.findElement(By.id("lastname")).sendKeys("Deep");
   driver.findElement(By.id("email_address")).sendKeys("akashdeepm11@gmail.com");
   
   Select primary = new Select(driver.findElement(By.id("company_type")));
   primary.selectByValue("selling");
   
   Select role = new Select(driver.findElement(By.id("individual_role")));
   role.selectByVisibleText("Technical/developer");
 
   
   Select country = new Select (driver.findElement(By.id("country")));
   country.selectByIndex(30);
   
   driver.findElement(By.id("password")).sendKeys("123456");
   driver.findElement(By.id("password-confirmation")).sendKeys("123456");
   
   driver.switchTo().frame(driver.findElement(By.xpath("")))
   
   if(!driver.findElement(By.id("agree_terms")).isSelected())
		   
		   {
   
   driver.findElement(By.id("agree_terms")).click();
   
		   }
  
  
   
   
	}

}
