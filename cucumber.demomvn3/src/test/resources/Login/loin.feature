Feature: Login Application

Background:
Given Should be in login page
#
#Scenario: To test login application with valid conditions
#
#
#When Enter valid user name "Admin"
#And Enter valid password "admin123"
#And click submit
#Then Login should be "Welcome Nishanth05"

Scenario Outline: 
When Enter valid user name "<name>"
And Enter valid password "<pwd>"
And click submit
Then Login should be "<loginname>"

Examples:

|name   |pwd     |loginname   |
|admin	|admin123|Welcome Paul|
|admin	|admin123|Welcome Paul|

Scenario: To test login application with invalid credentials


When Enter invalid user name "jawahar"
And Enter invalid password "admin123"
And click submit
Then Login should see the invalid credentials "Invalid credentials"


