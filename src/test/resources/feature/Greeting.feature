Feature: Check the Greeting Service with Default Name
@First
  Scenario: Retrieve a Greeting with Default Name
    Given the REST service is up and running
    When I send a GET request for greeting name
    And the response should contain a greeting message with the default name
    Then the response status code should be 200
