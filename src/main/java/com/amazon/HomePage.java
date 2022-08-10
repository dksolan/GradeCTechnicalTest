package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.TestBase.TestBase;


public class HomePage extends TestBase{
	@FindBy(linkText="Gift Cards")
	WebElement Footer_giftCards;


		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void clickGiftCardsLink() {
			Footer_giftCards.click();
		}

}
