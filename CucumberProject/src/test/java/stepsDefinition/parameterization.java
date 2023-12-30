package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parameterization {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("the user is entering into the HRM login page")
	public void the_user_is_entering_into_the_hrm_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@SuppressWarnings("deprecation")
	@When("user enter valid id and password as {string} and valid {string}")
	public void user_enter_valid_id_and_password_as_and_valid(String string, String string2) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys(string);
	    driver.findElement(By.name("password")).sendKeys(string2);
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("orange HRM page will be displayed")
	public void orange_hrm_page_will_be_displayed() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   boolean value = driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
		   if (value) {
			System.out.println("is displayed");
	}
	}
	}


