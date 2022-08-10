package com.amazon.stepDef;

import java.math.BigDecimal;

import org.openqa.selenium.By;

import com.amazon.GiftCardsPage;
import com.amazon.HomePage;
import com.amazon.SigninPage;
import com.amazon.TopUpPage;
import com.amazon.TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GiftCardsStepDef extends TestBase {
	SigninPage spPage = new SigninPage(driver);
	GiftCardsPage gcpage = new GiftCardsPage(driver);
	HomePage hmpage = new HomePage(driver);
	TopUpPage tpPage = new TopUpPage(driver);

	@Given("^user opens the browser$")
	public void user_opens_the_browser() throws Throwable {
		TestBase.init_browser();
	}

	@When("^user click on Gift Cards from the footer$")
	public void user_clicks_on_Gift_Cards_from_the_footer() throws Throwable {
		hmpage.clickGiftCardsLink();
	}
	
	@When("^user click on top-up balance$")
	public void user_click_on_topup_balance() throws Throwable {
		gcpage.clickTopUpBalanceButton();
	}

	@Then("^user enter the amount \"(.*)\\\"$\"$")
	public void user_enter_the_amount(BigDecimal amount) throws Throwable {
		tpPage.AddAmount(amount);
	}

	@Then("^user click on BuyNow button$")
	public void user_click_on_BuyNow_button() throws Throwable {
		tpPage.clickOnBuyNow();
		
	}

	@Then("^user navigate to signIn page$")
	public void user_navigate_to_signIn_page() throws Throwable {
		spPage.verifySignInPage();
		
	}

	@Then("^user enter email \"(.*)\\\"$\"$")
	public void user_enter_email(String email) throws Throwable {
		spPage.enterSignInDetails(email);
	}

	@Then("^user clicks on continue$")
	public void user_clicks_on_continue() throws Throwable {
		spPage.clickContinue();
	}
	
	@Then("^page throws message \"(.*)\\\"$\"$")
	public void page_throws_meesage(String message) throws Throwable {
		spPage.InvalidAccountError(message);
	}


}
