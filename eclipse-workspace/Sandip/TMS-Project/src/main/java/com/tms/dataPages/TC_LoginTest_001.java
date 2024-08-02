package com.tms.dataPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends TMSBaseClass {

	@BeforeTest
	public void setup() {
		initilization();

	}

	@Test
	public void loginTest() {

		String actualURL = prop.getProperty("URL");
		String expectedUrl = driver.getCurrentUrl();
		System.out.println(expectedUrl);
		if (actualURL.equals(expectedUrl)) {

			System.out.println("URL is Matching & Login sucessfully!");
		} else {
			System.out.println("URL is not matching Unable to Login!");
		}
	}

	@Test
	public void pageTitle() {
		initilization();

		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is :" + actualTitle);

		String expectedTitle = "TMS Admin Portal";

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title is Matching");
		} else {
			System.out.println("Title is not Matching");
		}
	}

	@Test
	public void verifyHeader() {

		initilization();

		WebElement headertxt = driver.findElement(By.xpath("//div[contains(@class,'fs-32 font-bold mb-2')]"));
		String actualHeader = headertxt.getText();
		System.out.println("Actual Header is :" + actualHeader);

		String ExpectedHeader = prop.getProperty("expectedHeader");
		System.out.println("Expected Header is :" + ExpectedHeader);

		if (actualHeader.equals(ExpectedHeader)) {
			System.out.println("Headers are Matching");
		} else {
			System.out.println("Headers are not Matching");
		}
	}

	@Test
	public void verifyLoginTitle() {

		initilization();

		WebElement headertxt = driver.findElement(By.xpath("//div[contains(@class,'fs-24 font-bold mb-7')]"));
		String actualHeader = headertxt.getText();
		System.out.println("Actual Header is :" + actualHeader);

		String loginTitleText = prop.getProperty("LoginTitle");
		System.out.println("Expected Login Title Text :" + loginTitleText);

		if (actualHeader.equals(loginTitleText)) {
			System.out.println("Login Title are Matching");
		} else {
			System.out.println("Login Title are not Matching");
		}
	}
	
	@Test
	public void usernameInputField() {
	    WebElement usernameField = driver.findElement(By.xpath("(//div[contains(@class,'customInput py-1  default-field')])[1]"));
	    String actualPlaceholderText = usernameField.getText(); // Getting the placeholder attribute
	    System.out.println(actualPlaceholderText);
	   
	    // Assert.assertTrue(usernameField.isDisplayed(), "Username field is not displayed");

	    // Check if UserName field is displayed and enabled
	    if (usernameField.isDisplayed() && usernameField.isEnabled()) {
	    	
	        String expectedPlaceholderText = "Enter your Email/Username";
	        
	        Assert.assertTrue(actualPlaceholderText.equals(expectedPlaceholderText));
	        
	        // Check CSS properties of the username field
	         String fontSize = usernameField.getCssValue("font-size");
	         String color = usernameField.getCssValue("color");
	         System.out.println("Font Size: " + fontSize + ", Color: " + color);
	         
	         // Check the size of the username field
	         int height = usernameField.getSize().getHeight();
	         int width = usernameField.getSize().getWidth();
	         System.out.println("Height: " + height + ", Width: " + width);
	         
	         
	         
//	         // Check the position of the username field
	         int x = usernameField.getLocation().getX();
	         int y = usernameField.getLocation().getY();
	         System.out.println("Position - X: " + x + ", Y: " + y);
	      
	 
	     
	    } else {
	        System.out.println("Test Failed");
	    }
	}
	
	@Test
	public void passwordInputField() {
	    WebElement passwordField = driver.findElement(By.xpath("(//div[contains(@class,'customInput py-1  default-field')])[2]"));
	    String actualPlaceholderText = passwordField.getText(); // Getting the placeholder attribute
	    System.out.println(actualPlaceholderText);
	   
	    // Assert.assertTrue(usernameField.isDisplayed(), "Username field is not displayed");

	    // Check if UserName field is displayed and enabled
	    if (passwordField.isDisplayed() && passwordField.isEnabled()) {
	    	
	        String expectedPlaceholderText = "Password";
	        
	        Assert.assertTrue(actualPlaceholderText.equals(expectedPlaceholderText));
	    }
	}
	
	@Test
	public void eyeIcon() {
	    WebElement eyeIconImg = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/form/div[3]/div/div/span/span"));
	   
	    // Assert.assertTrue(usernameField.isDisplayed(), "Username field is not displayed");

	    // Check if UserName field is displayed and enabled
	    if (eyeIconImg.isDisplayed() && eyeIconImg.isEnabled()) {
	        
	    	Assert.assertTrue(true);
	    }
	}
	
	@Test
	public void verifyRemebermeText() {
	    WebElement remebermetxt = driver.findElement(By.xpath("//span[contains(text(),'Remember me')]"));
	    String actualRemebermeText = remebermetxt.getText(); // Getting the placeholder attribute
	    System.out.println(actualRemebermeText);
	   
	    // Assert.assertTrue(usernameField.isDisplayed(), "Username field is not displayed");

	    // Check if UserName field is displayed and enabled
	    if (remebermetxt.isDisplayed()) {
	    	
	        String expectedRemebermeText = "Remember me";
	        
	        Assert.assertTrue(actualRemebermeText.equals(expectedRemebermeText));
	        System.out.println("Test Pass");
	    }
	    
	}
	
	@Test
	public void verifyCheckBox() {
	    WebElement checkBox = driver.findElement(By.xpath("//span[contains(@class,'ant-checkbox ant-wave-target css-1e8x7h1')]"));
	   
	    // Assert.assertTrue(usernameField.isDisplayed(), "Username field is not displayed");

	    // Check if UserName field is displayed and enabled
	    if (checkBox.isDisplayed() && checkBox.isEnabled()) {
	        
	    	Assert.assertTrue(true);
	    	System.out.println("CheckBox is Displayed & Enabled");
	    }
	}
	
	@Test
	public void verifyLoginButton() {
	    WebElement loginBtn = driver.findElement(By.xpath("//button[@type='button']"));
	    String loginBtnText = loginBtn.getText(); // Getting the placeholder attribute
	    System.out.println(loginBtnText);
	   
	    // Assert.assertTrue(usernameField.isDisplayed(), "Username field is not displayed");

	    // Check if UserName field is displayed and enabled
	    if (loginBtn.isDisplayed() && loginBtn.isEnabled()) {
	        
	    	Assert.assertTrue(true);
	    	System.out.println("CheckBox is Displayed & Enabled");
	    }
	}
	        
	

               

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

