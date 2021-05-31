package cucumbersteps;


import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewCarsStepDefs {
	
	
	@Given("^user navigates to website$")
	public void user_navigates_to_website() {
	  System.out.println("@GIven-----User navigates to correct website");
	}
	@When("^user choose menu as new car$")
	public void user_choose_menu_as_new_car() {
	    System.out.println("@When-----User choose menu as car");
	    
	}
	@Then("^user clicks on find new cars$")
	public void user_clicks_on_find_new_cars(List<String>price) {
	System.out.println("@Then-----User clicks on car:"+price.get(2));    	
	}
	@And("^user seraches for (.*) Car$")
	public void user_seraches_for_Car(String brandName) {
	    System.out.println("@And-----User searches for Car:"+brandName);
	}
}
