package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardsPage {
	public Webdriver driver;
	static String PageText = "Gift Cards & Top Up";
	
	@FindBy(xpath = "//h1[contains(text(),'Gift Cards & Top Up')]")
	WebElement giftCardsPageTitle;
	@FindBy(xpath = "//a[@id='a-autoid-2-announce']")
	WebElement TopUpBalance;
	


	// Initialization
	public GiftCardsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickTopUpBalanceButton() {
		String ActualPageTitle = driver.getTitle(giftCardsPageTitle);
		Assert.assertEquals(PageText, ActualPageTitle);
		TopUpBalance.click();
	}



}