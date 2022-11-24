Feature: Access to Vehicle contracts page
  User Story: As a user, I want to access to Vehicle contracts page


  Scenario: Log in as a Store managers and Sales manager
    Given user on the home page
    When user log in a Store managers and Sales manager
    Then user should be on Expected URL: https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract and Expected title:
      | All              |
      | Vehicle Contract |
      | Entities         |
      | System           |
      | Car              |
      | Entities         |
      | System           |

  Scenario: Log in as a Driver
    Given user on the home page
    When user log in a Driver
    Then user should NOT able to access the Vehicle contracts page, the app should display “You do not have permission to perform this action.”