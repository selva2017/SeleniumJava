package stepFiles;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstTest {
	@Given("^I navigate to gmail$")
	public void i_navigate_to_gmail() throws Throwable {
		System.out.println("navigate");
	}

	@When("^I login$")
	public void i_login() throws Throwable {
		System.out.println("login");}

	@Then("^I will be on home page$")
	public void i_will_be_on_home_page() throws Throwable {
		System.out.println("home");
	}
}
