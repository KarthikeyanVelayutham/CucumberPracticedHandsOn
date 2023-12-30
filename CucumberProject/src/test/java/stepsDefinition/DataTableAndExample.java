package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableAndExample {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@Given("proceed to login page")
	public void proceed_to_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@SuppressWarnings("deprecation")
	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String username, String password) {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	@When("click login button in HRM loginpage")
	public void click_login_button_in_hrm_loginpage() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@SuppressWarnings("deprecation")
	@Then("you should see the orangeHRMHome")
	public void you_should_see_the_orange_hrm_home() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   boolean value = driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
		   if (value) {
			System.out.println("is displayed");
	}
}
}