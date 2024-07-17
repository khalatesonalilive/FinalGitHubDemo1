Feature: Test the Facebook Application

  @Register
  Scenario: Validate the Facebook RegisterPage
    Given user open "incognito" browser
    When user is on RegisterPage
    And user enter valid "Shivanya" , "Khalate","khalatesonali@gmail.com" and "khalatesonali@123"
    And user select DOB as "11","May","2000" and user select gender as "Female"
