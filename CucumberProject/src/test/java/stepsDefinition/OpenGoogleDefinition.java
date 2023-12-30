package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleDefinition {
	WebDriver driver;
	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() {
	    driver = new ChromeDriver();
	    driver.get("https://www.google.co.in");
	}
	@When("user is typing the search term {string}")
	public void user_is_typing_the_search_term(String string) {
	    driver.findElement(By.name("q")).sendKeys(string);
	}
	@When("enters the return key")
	public void enters_the_return_key() {
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	@Then("the user should see the search results")
	public void the_user_should_see_the_search_results() {
	    boolean value = driver.findElement(By.partialLinkText("karthikeyan")).isDisplayed();
	    if (value) {
			System.out.println(" is displayed");
		}
	}
}
