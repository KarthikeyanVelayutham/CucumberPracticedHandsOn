package stepsDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithoutHeader {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("you are on the HRM login page")
	public void you_are_on_the_hrm_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@SuppressWarnings("deprecation")
	@When("you enter below credentials")
	public void you_enter_below_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<String> credentials = dataTable.asList();
		String username = credentials.get(0);
		String password = credentials.get(1);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@SuppressWarnings("deprecation")
	@Then("you should see the homepage")
	public void you_should_see_the_homepage() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   boolean value = driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
		   if (value) {
			System.out.println("is displayed");
	}
	}
	}
