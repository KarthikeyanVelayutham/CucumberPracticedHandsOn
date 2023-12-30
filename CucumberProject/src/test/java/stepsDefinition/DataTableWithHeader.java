package stepsDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithHeader {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("Go to login page")
	public void go_to_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@SuppressWarnings("deprecation")
	@When("enter the below credentials")
	public void enter_the_below_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> keyValuePair = dataTable.asMaps(String.class, String.class);
		String username = keyValuePair.get(0).get("username");
		String password = keyValuePair.get(0).get("password");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@SuppressWarnings("deprecation")
	@Then("you should see the orangeHRMHomepagepage")
	public void you_should_see_the_orange_hrm_homepagepage() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   boolean value = driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
		   if (value) {
			System.out.println("is displayed");
	}
}
}