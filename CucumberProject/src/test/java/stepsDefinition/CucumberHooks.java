package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberHooks {
	@Given("Thanos has infinity stones")
	public void thanos_has_infinity_stones() {
	    System.out.println("Thanos has infinity stones");
	}
	@When("thanos snaps is finger")
	public void thanos_snaps_is_finger() {
	    System.out.println("thanos snaps is finger");
	}
	@Then("half of the living things died")
	public void half_of_the_living_things_died() {
	    System.out.println("half of the living things died");
	}
}
