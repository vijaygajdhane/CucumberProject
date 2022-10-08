package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;

	@Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException{
		System.out.println("Step1: User is on Login Page");
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       Thread.sleep(2000);
       driver.manage().window().maximize();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Thread.sleep(3000);
       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       
    }

    @When("^user enters valid (.*) and (.*)$")
    public void user_enters_valid_username_and_password(String uname,String pswd) throws InterruptedException{
    	System.out.println("Step2: User enters user name and password");
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pswd);
    	Thread.sleep(2000);
    	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
    
    @And("clicks on login button")
    public void clicks_on_login_button() throws InterruptedException {
    	System.out.println("Step3: User is clicking on Login Button");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
    	System.out.println("Step4: User is navigated successfully to Home page");
    	Thread.sleep(3000);
    	driver.close();
    	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        
    }
    

   
}
