package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginwithHardCodeData {
	WebDriver driver ;
	@SuppressWarnings("deprecation")
	@Given("the user is in the HRM login page")
	public void the_user_is_in_the_hrm_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@SuppressWarnings("deprecation")
	@When("user enters valid name and valid password")
	public void user_enters_valid_name_and_valid_password() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	}
	@When("click on enter")
	public void click_on_enter() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@SuppressWarnings("deprecation")
	@Then("orange HRM page should be displayed")
	public void orange_hrm_page_should_be_displayed() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   boolean value = driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	   if (value) {
		System.out.println("is displayed");
	}
	}
}
