package Weather;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WeatherStepDef {

    @Given("city (.*)")
    public void set_city(String city) {

    }
    @Given("country (.*)")
    public void set_country(String country) {

    }

    @When("we are requesting weather data") //neko nepadod un neko nesaņem, jo darbība
    public void request_weather() {

    }


    @Then("lon is (.*)")
    public void check_lon(Double lon) {


    }

    @Then("lat is (.*)")
    public void check_lat(Double lat) {
    }


    }
