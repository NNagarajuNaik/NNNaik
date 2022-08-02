Feature: Open orangeHRM
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to open browser with url as "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login"
    Then I verify pageTittle
    When I enter username as "Admin"
    And I enter password as "Qedge123!@#"
    Then I close Browser
