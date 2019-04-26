package com.class28;

public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	
	
}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Chrome can open brower");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome can close brower");
		
	}

	@Override
	public void findElement() {
		System.out.println("Chrome can find element");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome can maximize window");
		
	}
	
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Firefox can open brower");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox can close brower");
		
	}

	@Override
	public void findElement() {
		System.out.println("Firefox can find element");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox can maximize window");
		
	}
	
}