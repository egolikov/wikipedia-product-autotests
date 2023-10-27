package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class MoreMenuPage {

    private final SelenideElement
            loginButton = $(id("org.wikipedia.alpha:id/main_drawer_account_container")),
            settingsButton = $(id("org.wikipedia.alpha:id/main_drawer_settings_container")),
            donateButton = $(id("org.wikipedia.alpha:id/main_drawer_donate_container"));

    public MoreMenuPage checkLoginButton() {
        loginButton.shouldBe(visible);

        return this;
    }

    public MoreMenuPage checkSettingsButton() {
        settingsButton.shouldBe(visible);

        return this;
    }

    public MoreMenuPage checkDonateButton() {
        donateButton.shouldBe(visible);

        return this;
    }
}
