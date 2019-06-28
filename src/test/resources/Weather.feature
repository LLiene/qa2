Feature: Weather API data testing

  Scenario: City coordinates check
    Given city London
    And country UK

    When we are requesting weather data

    Then lon is -0.13
    And lat is 51.51

