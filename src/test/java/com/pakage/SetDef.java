package com.pakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SetDef extends BaseClass {

	
	WebDriver driver;
	BaseClass bs;
	@Given( "LOOGED INTO AUTOMATION DEMO SITE" )
    public void iAmOnLoggedInGoogle( ) throws InterruptedException
    {
		bs = new BaseClass();
		driver = bs.m1();
		Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("iamaniket007");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Aniketraje123");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
    	System.out.println("Test Executed");
    }

    
    @When( "Enter the first name" )
    public void Setname()throws InterruptedException
    {
    	Select sel = new Select(null);
    	
    	
    	
    }

    @When( "Enter the last name" )
    public void SetLastName() throws InterruptedException
    {
    	System.out.println("Test URL");
   	 Thread.sleep(3000);
    	
    }

  
    
    @When( "Enter the Address" )
    public void SetAddress() throws InterruptedException
    {
    	System.out.println("Test URL");
   	 Thread.sleep(3000);
    	
    }
    
    @When( "Enter the email Address" )
    public void SetEmail() throws InterruptedException
    {
    	System.out.println("Test URL");
   	 Thread.sleep(3000);
    }
    
    @When( "Enter the Phone Number" )
    public void SetPhoneNumber() throws InterruptedException
    {
    	System.out.println("Test URL");
   	 Thread.sleep(3000);
    }
    
    @Then( "Select the Gender" )
    public void ClickOnRadioBtnMale() throws InterruptedException
    {
    	System.out.println("Test URL");
   	 Thread.sleep(3000);
    	
    }
  
    
    @Then( "Enter the Hobbies" )
  public void SelectCountry() throws InterruptedException
  {
    	System.out.println("Test URL");
   	 Thread.sleep(3000);
  	
  }
	
}
