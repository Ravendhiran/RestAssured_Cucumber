Feature: To get all the incidents from ServiceNow

Scenario: Get all the incidents
Given Set the endpoint
And Set the Auth
When get incidents
Then Validate the response code is 200