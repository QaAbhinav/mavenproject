package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.jbk.DashboardPage;
import com.jbk.LoginPage;

public class LoginTest {
WebDriver driver=null;

@Test
public void loginTest(){
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///E:/Selinium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	LoginPage lp=new LoginPage(driver);
	DashboardPage dp=lp.validLogin();
	UserPage up=dp.clickUser();

	
}
}
