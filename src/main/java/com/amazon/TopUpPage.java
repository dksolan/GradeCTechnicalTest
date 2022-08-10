package com.amazon;

import java.math.BigDecimal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopUpPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//label[contains(text(),'Amount')]")
	WebElement AmountText;
	@FindBy(xpath = "//input[@id='gcui-asv-reload-form-custom-amount']")
	WebElement enterAmount_textbox;
	@FindBy(name = "submit.gc-buy-now")
	WebElement buynow;

	
	public TopUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public BigDecimal AddAmount(BigDecimal Amount) {
		driver.getText(AmountText);
		enterAmount_textbox.sendKeys(Amount);
		
	}
	
	public void clickOnBuyNow() {
		buynow.click();
	}

	


}
