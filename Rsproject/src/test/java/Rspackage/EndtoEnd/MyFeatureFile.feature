Feature: To validate the RScomponent website

Scenario: To validate click on our brand Tab
Given     User is on the Rs component website
When      User clicks on our brand Tab
Then      user should access different brand types
Then close
Scenario: To validate click on our new product Tab
Given      User is on the Rs component website
When       User clicks on our new product Tab
Then       User should access different product types
Then close
Scenario: To validate the search field
Given      User is on the Rs component website
When       User types search products in the search field
Then       User should be able to view results
Then close
Scenario: To validate the search field
Given     User is on the Rs component website
When      User types search connectors in the search field
Then      User should be able to view results
Then close
Scenario: To validate the search field
Given      User is on Rs component website
When       User types search relays in the search field
Then       User should be able to view results