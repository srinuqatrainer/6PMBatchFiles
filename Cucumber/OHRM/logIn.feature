Feature: OHRM LogIn Functionality

Scenario Outline: OHRM logIn functionality Validation

Given Open FireFox Browser and navigate to OrangeHRM application
When user enters valid "<userName>" and "<password>" and click on signIn button
Then use should be able to succesfully logIn to the application and close the application

Examples:
|  userName   |   password   |
|  admin      |   password   |
|  userName   |   hello      |
|  Hee        |   HI         |