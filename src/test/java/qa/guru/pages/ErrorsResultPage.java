package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class ErrorsResultPage {

    private final SelenideElement
            errorButton = $(id("org.wikipedia.alpha:id/view_wiki_error_button")),
            errorText = $(id("org.wikipedia.alpha:id/view_wiki_error_text"));

    public ErrorsResultPage checkGoBackButton() {
        errorButton.shouldBe(visible);

        return this;
    }

    public ErrorsResultPage checkErrorText(String value) {
        errorText.shouldHave(text(value));

        return this;
    }
}
