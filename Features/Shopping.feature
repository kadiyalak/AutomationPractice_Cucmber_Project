Feature: Successfully validate the shirt

  @Sanity @Regression
  Scenario: Successfully validate the shirt
    Given User Launch Browser
    And Opens URL "http://www.automationpractice.pl/"
    When click on the women label
    And click on the T-shirt
    And check the T-shirt name
    And go to search-bar and send "Faded Short Sleeve T-Shirts"
    And search the tshirt
    And check_the_t_shirt_name1
    Then validate the both shirt names
