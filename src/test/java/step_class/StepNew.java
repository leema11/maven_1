package step_class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base_class.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom_class.PomNew;

public class StepNew extends baseClass {
	
	PomNew lee = new PomNew();
	
	@Given("open the flipcart URL")
	public void open_the_flipcart_url() {
		driver.get("https://www.flipkart.com/");
		
	}

	
	@Then("click the login")
	public void click_the_login() throws InterruptedException {
		
		implisityWait();
		
		driver.findElement(lee.clickMobile).click();
		Thread.sleep(2000);
		WebElement scroll = driver.findElement(lee.scrollApple);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		
		driver.findElement(lee.appleClick).click();
	    
	}

	@Then("click the home page")
	public void click_the_home_page() {
	   
	}

}
