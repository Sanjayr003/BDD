@reg
Feature: Login feature
@test1
Scenario Outline: Login Test Scenario
Given User on Login Page
When title of the Login page is Automation Demo Site
Then I click on SkipSignIn button
When I navigate to Register Page
Then I enter "<FirstName>" and "<LastName>"
Then Close the browser

Examples:
|FirstName|LastName|
|arun|r|
