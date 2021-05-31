Feature: finding new cars
  As a user I want to find new cars

  Scenario Outline: user finding a new car
    Given user navigates to website
    When user choose menu as new car
    Then user clicks on find new cars
    | price  |
    | 2000   |
    | 5000    |
    
    And user seraches for <brand> Car
    
    Examples: 
      | KIA     |
      | Toyota  |
      | Maruti  |
      | Hyundai |
