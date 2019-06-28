Feature: Some tests for POST testing

  Scenario: New client creation
    Given new client:
      | name    | Janis         |
      | surname | Ligotajs      |
      | age     | 66            |
      | pk      | 111111-11111  |
      | email   | ligo@ligo.com |
    When client is sent to server
    And we receive the list of clients
    Then new client appears in this list




