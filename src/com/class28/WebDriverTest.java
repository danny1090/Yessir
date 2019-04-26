package com.class28;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver chrome=new ChromeDriver();
		chrome.openBrowser();
		chrome.closeBrowser();
		chrome.findElement();
		chrome.maximizeWindow();
		
		WebDriver firefox=new FirefoxDriver();
		firefox.openBrowser();
		firefox.closeBrowser();
		firefox.findElement();
		firefox.maximizeWindow();
		
		
		
		
		
		
		
	}

}
