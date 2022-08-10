package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.TestBase.TestBase;

public class SigninPage extends TestBase{

		public static String SignInTitle = "Sign In";
		
		@FindBy(xpath = "//h1[contains(text(),'Sign In')]")
		WebElement SignInPageTitle;
		@FindBy(xpath = "//input[@id='ap_email']")
		WebElement enterEmail;
		@FindBy(id = "continue")
		WebElement cont;
		@FindBy(id = "//h4[contains(text(),'There was a problem')]")
		WebElement ErrorMessage;
		


		public SigninPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		
		public void verifySignInPage() {
			String ActualTitle = driver.getText(SignInPageTitle);
			Assert.assertEquals(SignInTitle, ActualTitle);
		}
		
		public void enterSignInDetails(String email) {
			enterEmail.sendKeys(email);
		}

		public void clickContinue() {
			cont.click();
		}
		
		public void InvalidAccountError(String invalidAccountError) {
			String Acutal = ErrorMessage.getText();
			Assert.assertEquals(invalidAccountError, Acutal);
		}

	

}
