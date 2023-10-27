package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class SavedPage {

    private final SelenideElement
            mainImage = $(id("org.wikipedia.alpha:id/imageView")),
            titleText = $(id("org.wikipedia.alpha:id/messageTitleView")),
            messageText = $(id("org.wikipedia.alpha:id/messageTextView")),
            loginButton = $(id("org.wikipedia.alpha:id/positiveButton")),
            notNowButton = $(id("org.wikipedia.alpha:id/negativeButton")),
            menuSearchListButton = $(id("org.wikipedia.alpha:id/menu_search_lists")),
            menuOverflowButton = $(id("org.wikipedia.alpha:id/menu_overflow_button"));

    public SavedPage checkMainImage() {
        mainImage.shouldBe(visible);

        return this;
    }

    public SavedPage checkTitleText(String value) {
        titleText.shouldHave(text(value));

        return this;
    }

    public SavedPage checkMessageText(String value) {
        messageText.shouldHave(text(value));

        return this;
    }

    public SavedPage checkLoginButton() {
        loginButton.shouldBe(visible);

        return this;
    }

    public SavedPage checkNotNowButton() {
        notNowButton.shouldBe(visible);

        return this;
    }

    public SavedPage checkMenuSearchListButton() {
        menuSearchListButton.shouldBe(visible);

        return this;
    }

    public SavedPage checkMenuOverflowButton() {
        menuOverflowButton.shouldBe(visible);

        return this;
    }
}
