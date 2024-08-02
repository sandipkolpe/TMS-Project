package com.tms.dataPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TMSBaseClass {
	
	

		public static WebDriver driver;
		public static Properties prop;

		{

			/*
			 * Overall, this code sets up a basic WebDriver instance for web automation
			 * testing, reads browser and URL configurations from a properties file, and
			 * provides methods to initialize the WebDriver accordingly.
			 */

			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\data.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public static void initilization() {
			String browserName = prop.getProperty("browser");

			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();

			}

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT,TimeUnit.SECONDS);

			driver.get(prop.getProperty("URL"));
			WebElement txtUserName = driver.findElement(By.id("username"));
	        txtUserName.sendKeys(prop.getProperty("username"));

	        WebElement password = driver.findElement(By.id("password"));
	        password.sendKeys(prop.getProperty("password"));

	        WebElement loginbtn = driver.findElement(By.xpath("//button[@type='button']"));
	        loginbtn.click();
	        
	        }
	}

