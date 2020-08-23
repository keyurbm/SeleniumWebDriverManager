package com.test.SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {
	 private WebDriver driver;

	    @BeforeSuite
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	        //WebDriverManager.firefoxdriver().setup();
	    }

	    @BeforeTest
	    public void setupTest() {
	        
	    	//Launch chrome browser
	    	driver = new ChromeDriver();
	    	
	    	//Launch firefox browser
	    	//driver = new FirefoxDriver();
	    }

	    @AfterTest
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @Test
	    public void test() {
	        driver.get("https://google.com");
	    }
}
