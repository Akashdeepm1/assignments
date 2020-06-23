package com.ibm.seleniumbasics.browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://netbanking.hdfcbank.com/netbanking/");
		   
//		  . Thread.sleep(3000);
//		   driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();
	
		   
		  driver.switchTo().frame("footer");
		//  driver.switchTo().frame(By.name("footer"));
		  
		  
		   
		   driver.findElement(By.partialLinkText("Terms and Conditions")).click();
	//	   driver.findElement(By.xpath("/html/body/form/p/a[1]")).click();
		   
		   driver.switchTo().defaultContent();
		   
		   Set<String> winids = driver.getWindowHandles();
		   driver.switchTo().window((String) winids.toArray()[1]);
		   
		   driver.findElement(By.linkText("HDFC Ltd")).click();
		   		                           
		   driver.close();
		   
		   winids = driver.getWindowHandles();
		   driver.switchTo().window((String) winids.toArray()[1]);
		   
		   System.out.println(driver.getTitle());
		   driver.findElement(By.xpath("//*[@id=\"HomepageModalVideo\"]/div/div/div[1]/button")).click();
		//   driver.quit();
		   
		   
	}

}