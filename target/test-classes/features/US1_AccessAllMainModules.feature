Feature: Access all modules of the app
  User Story: As a user, I should be accessing all the main modules of the app

  @wip
  Scenario Template: Login as a store and manager
    Given User is on the VyTrack home page
    When User enters "<validUsername>"
    And  User enters "<validPassword>"
    And User clicks on Log In button
    And user waits for loading bar disappear
    Then User should see the home page
    And User should see 8 modules on the main page
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Examples: valid credentials
      | validUsername  | validPassword |
      | storemanager83 | UserUser123   |
      | storemanager86 | UserUser123   |
      | salemanager133 | UserUser123   |
      | salemanager136 | UserUser123   |


  Scenario Outline : Log in as a driver
    Given User is on the VyTrack home page
    When User enters "<validUsername>" and "<validPassword>"
    And User clicks on Log In button
    Then User should see the main page
    And User should see 4 modules on the main page
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

    Examples: valid credentials
      | validUsername | validPassword |
      | user160       | UserUser123   |
      | user165       | UserUser123   |