package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//features glue dryrun strict tags monochrome format
@RunWith(Cucumber.class)
@CucumberOptions(features = "./CucumberPracticeFeature/CucumberHooks.feature" , 
glue = {"stepsDefinition","hooks"}
/*dryRun = true,
monochrome = true,
plugin = {"html:report/webReport"},
tags = "@OpenGoogle or @login"*/
)
public class Runner {
	//it should combine feature file and step definition
	//runner define
}
