package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithoutHardCodeData {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("the user is on the HRM login page")
	public void the_user_is_on_the_hrm_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@SuppressWarnings("deprecation")
	@When("user enters valid credentials {string} and valid {string}")
	public void user_enters_valid_credentials_and_valid(String string, String string2) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys(string);
	    driver.findElement(By.name("password")).sendKeys(string2);
	}
	@When("click on enter button")
	public void click_on_enter_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@SuppressWarnings("deprecation")
	@Then("orange HRM page must be displayed")
	public void orange_hrm_page_must_be_displayed() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   boolean value = driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
		   Assert.assertTrue(value);
	}
	}
