package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestLibrary {
	
	WebDriver driver;
	@Given("^I want to open browser with url as \"([^\"]*)\"$")
	public void i_want_to_open_browser_with_url_as(String url) throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(url);
	    Thread.sleep(1000);
	}

	@Then("^I verify pageTittle$")
	public void i_verify_pageTittle() throws Throwable {
	    String str = driver.getTitle();
	    String str1 = "OrangeHRM";
		if (str.equals(str1)) {
			System.out.println("page is open");
		} else {

			System.out.println("Enter  valid url");
		}
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String username) throws Throwable {
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String password) throws Throwable {
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	    Thread.sleep(1000);
	}

	@Then("^I close Browser$")
	public void i_close_Browser() throws Throwable {
	   driver.close();
	}

}
