package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class EditsPage {

    private final SelenideElement
            mainImage = $(id("org.wikipedia.alpha:id/imageView")),
            titleText = $(id("org.wikipedia.alpha:id/messageTitleView")),
            messageText = $(id("org.wikipedia.alpha:id/messageTextView")),
            loginButton = $(id("org.wikipedia.alpha:id/positiveButton"));

    public EditsPage checkMainImage() {
        mainImage.shouldBe(visible);

        return this;
    }

    public EditsPage checkTitleText(String value) {
        titleText.shouldHave(text(value));

        return this;
    }

    public EditsPage checkMessageText(String value) {
        messageText.shouldHave(text(value));

        return this;
    }

    public EditsPage checkLoginButton() {
        loginButton.shouldBe(visible);

        return this;
    }
}
