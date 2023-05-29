@Regression
Feature: Retail signIn

  Background: 
    Given User is on retail website home page

 
  Scenario: Verify user can sign in into Retail application
    Then User verify retail website title
    And User click on sign in option
    When User enter email 'Dragonsjoh@gmail.com' and password 'Dragonsakm2e@'
    And User click on login button
    Then user should be logged into Account

  
  Scenario Outline: Verify department sidebar options
    When User click on All section
    And User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |
