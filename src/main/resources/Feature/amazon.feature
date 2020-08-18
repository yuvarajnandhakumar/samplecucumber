Feature: Title of your feature
		
		@tags="sanity"
  Scenario Outline: Launch fb
    Given Launching chrome browser
    When User enters in fb "<url>"
    Then user Enters "<username>"
    And user Enter "<pwd>"
    Then user click on submit button

    Examples: 
      | url           | username          | pwd         |
      | http://fb.com | yuvaraj@gamil.com | asddf@12321 |
