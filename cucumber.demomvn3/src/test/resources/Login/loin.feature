
Feature: Login Application
Scenario: To test login application with valid conditions

Given Should be in login page
When Enter valid user name "Admin"
And Enter valid password "admin123"
And click submit
Then Login should be "Welcome Paul"
