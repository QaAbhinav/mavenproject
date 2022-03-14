package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class LoginTest {
WebDriver driver=null;

@Test
public void test01(){
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///E:/Selinium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	LoginPage lp=new LoginPage(driver);
	lp.loginToApplication("kiran@gmail.com","123456");
	Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
}
@Test
public void verifyHeader(){
	DashboardPage dp=new DashboardPage(driver);
	boolean value=dp.verifyHeader();
	Assert.assertTrue(value);
	
}
}
