Feature: Shopping cart modification

Scenario: A user must be able to add or remove products

Given A user is on the landing page of demowebshop
When he clicks on books
And he adds the first product
And he adds the second product
And he adds the third product
And he removes one of the products
Then he verifies the shopping cart.