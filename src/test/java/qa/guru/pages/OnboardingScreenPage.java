package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingScreenPage {

    private final SelenideElement
            baseScreen = $(id("org.wikipedia.alpha:id/primaryTextView")),
            addOrEditLanguageButton = $(id("org.wikipedia.alpha:id/addLanguageButton")),
            acceptButton = $(id("org.wikipedia.alpha:id/acceptButton")),
            rejectButton = $(id("org.wikipedia.alpha:id/rejectButton"));

    public OnboardingScreenPage checkTittle(String value) {
        baseScreen.shouldHave(text(value));

        return this;
    }

    public SelenideElement getAddOrEditLanguageButton() {
        return addOrEditLanguageButton;
    }

    public SelenideElement getAcceptButton() {
        return acceptButton;
    }

    public SelenideElement getRejectButton() {
        return rejectButton;
    }
}
