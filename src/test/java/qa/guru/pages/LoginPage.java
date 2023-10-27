package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class LoginPage {

    private final SelenideElement
        loginField = $(id("org.wikipedia.alpha:id/login_username_text")),
        passwordField = $(id("org.wikipedia.alpha:id/text_input_password_toggle")),
        loginButton = $(id("org.wikipedia.alpha:id/login_button")),
        policyLink = $(id("org.wikipedia.alpha:id/privacy_policy_link")),
        joinWikipediaLink = $(id("org.wikipedia.alpha:id/login_create_account_link"));

    public LoginPage checkLoginField() {
        loginField.shouldBe(visible);

        return this;
    }

    public LoginPage checkPasswordField() {
        passwordField.shouldBe(visible);

        return this;
    }

    public LoginPage checkLoginButton() {
        loginButton.shouldBe(visible);

        return this;
    }

    public LoginPage checkPolicyLink() {
        policyLink.shouldBe(visible);

        return this;
    }

    public LoginPage checkJoinWikipediaLink() {
        joinWikipediaLink.shouldBe(visible);

        return this;
    }
}
