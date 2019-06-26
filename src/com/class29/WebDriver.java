package com.class29;

public interface WebDriver extends takeScreenshot, Execute{

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}
class ChromeDriver implements Report, WebDriver{

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

	@Override
	public void getReport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeScreenshot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	
}
class FirefoxDriver extends Browser implements WebDriver{

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

	@Override
	public void refreshBrowser() {
		
		
	}

	@Override
	public void takeScreenshot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	
}

