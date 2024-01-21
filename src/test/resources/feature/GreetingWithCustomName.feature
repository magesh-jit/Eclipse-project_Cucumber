Feature: Check the Greeting Service with a Custom Name
@Second
  Scenario: Retrieve a Greeting with a Custom Name
    Given the REST service is up and running for custom name
    When I send a GET request for greeting name is john
    And the response should contain a greeting message with the name "John"
    Then the response status code should be 200 for custom name
