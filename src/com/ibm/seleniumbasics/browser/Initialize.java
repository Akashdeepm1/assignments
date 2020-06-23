package com.ibm.seleniumbasics.browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.Location;

public class Initialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://magento.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.startsWith("https"));
		{
			System.out.println("secured");
			
		}
		
		if (url.equals("https://magento.com"));
		{
			System.out.println("expected");
			
		}
		
		
		String x = driver.getPageSource();
		
		driver.quit();
//		driver.getLocalStorage();
//		driver.location();
//		driver.close();
//	    driver.quit();
	
		
				

	}

}
