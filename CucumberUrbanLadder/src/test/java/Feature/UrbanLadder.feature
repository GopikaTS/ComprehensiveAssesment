Feature: UrbanLadder Feature

Scenario: UrbanLadder LoginTest Scenario

Given User is already in Login Page
Then User need to click on LogIn
Then User enters username
Then User enters password
Then User clicks on Loginbutton

Scenario: UrbanLadder GetAddressOfChennaiStore Scenario

Given User is already in given URL
Then User need to click on store
Then User need to get address of chennai store
Then user need click on Google Map 

Scenario: UrbanLadder AddingWishList Scenario

Given User is already in Login Page
Then User need to click on LogIn
Then User enters username 
Then User enters password
Then User clicks on Loginbutton
And User enters bed in searchbox 
And User clicks on the items need to be added wishlist

Scenario: UrbanLadder GetGitCards Scenario

Given User is already in Login Page
Then User need to click on LogIn
Then User enters username 
Then User enters password
Then User clicks on Loginbutton
Then User clicks on Giftcard
Then User clicks on WeddingCard
Then User clicks on Money
Then User hovers on Month and clicks on Next Button
Then User enters the Recipitent Name and Email
Then User enters the Username and Useremail
 
Scenario: UrbanLadder FilterTheChair Scenario

Given User is already in Login Page
Then User need to click on LogIn
Then User enters username 
Then User enters password
Then User clicks on Loginbutton
And User enters Dinnig Chair in searchbox
Then User need to select the Category
Then User need to select the Price
Then User need to select the Chair



