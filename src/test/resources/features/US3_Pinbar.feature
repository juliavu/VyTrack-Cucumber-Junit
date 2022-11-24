Feature: Learn how to use pinbar
User Story: As a user, I want to learn how to use the pinbar

  Scenario: Log in as a userGiven user on the home page
    When user clicks the “Learn how to use this space” link on the homepage
    Then user should see “How To Use Pinbar” and “Use the pin icon on the right top corner of the page to create fast access link in the pinbar.”
    And user should see an image on the page [in automation testing,  just verify the image source]. Expected source:/bundles/oronavigation/images/pinbar-location.jpg