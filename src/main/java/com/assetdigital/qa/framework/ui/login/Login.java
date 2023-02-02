package com.assetdigital.qa.framework.ui.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public class LoginPage  extends PageBase    {

        @FindBy(id="username")
        private WebElement usernameInput;

        @FindBy(id="password")
        private WebElement passwordInput;

        @FindBy(id="submit")
        private WebElement submitButton;

        public LoginPage(WebDriver webDriver) {
            this.webDriver = webDriver;
            PageFactory.initElements(webDriver, this);
        }

        public void setUsernameInput(String username) {
            usernameInput.sendKeys(username);
        }

        public void setPasswordInput(String password) {
            passwordInput.sendKeys(password);
        }

        public void clickSubmitButton() {
            submitButton.click();
        }

    }
}
