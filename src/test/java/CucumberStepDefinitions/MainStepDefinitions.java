package CucumberStepDefinitions;

import cucumber.api.java.en.Given;

public class MainStepDefinitions {
    @Given("Print test annotation (.*)")
    public void print_test_annotation (String annotation) { //Funkcijas tiek nosauktas ar underscoriem, tā ir stepdef fīča
        System.out.println(annotation);
    }
}


