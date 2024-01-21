Feature: Check the Greeting Service with a Empty Name
@Third
  Scenario: Retrieve a Greeting with an Empty Name
    Given the REST service is up and running for empty name
    When I send a GET request for greeting name is blank
    And the response should contain a greeting message with the empty name
    Then the response status code should be 200 for empty name
