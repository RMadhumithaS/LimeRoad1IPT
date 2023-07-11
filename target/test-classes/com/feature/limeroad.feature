@smoketest
Feature: Limeroad Order

Scenario: To search a product for men

Given User launch the url "https://www.limeroad.com/"
And User Click on Shop Men and it navigates to men page

@smoketest
Scenario: Shop a Shirt and add to cart

Given User click on Shirt icon
And User selects Celeb On Trend Train
And User picks Red Solid Casual Shirt
And User Selects the size of the shirt
And User click on Add to cart 