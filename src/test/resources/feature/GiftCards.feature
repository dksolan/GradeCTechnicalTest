Feature: Amazon Application Test 


Scenario Outline: vaidate giftCard functionality

	Given user opens the browser 
	When user click on Gift Cards from the footer
	Then user click on top-up balance
	Then user enter the <amount>
	Then user click on BuyNow button
	Then user navigate to signIn page
	Then user enter <email>
	Then user clicks on continue
	Then page throws invalid account error
	
	Examples:
	|amount|email|
	|£150.05|selenium@kpmg.co.uk|