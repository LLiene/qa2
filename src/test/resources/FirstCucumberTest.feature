Feature: Student list tests

  Scenario: Add new student check
    Given student count is 2
    And student with attributes
      | name          | Vasja        |
      | personal code | 111111-11111 |
      | age           | 36           |

    And student with attributes
      | name          | Irina        |
      | personal code | 123456-12345 |
      | age           | 19           |

    When we are getting last student age
    Then this age must be 90