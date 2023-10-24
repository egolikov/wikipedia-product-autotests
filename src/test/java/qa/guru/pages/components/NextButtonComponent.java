package qa.guru.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class NextButtonComponent {

    private final SelenideElement nextButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));

    public NextButtonComponent clickNextButton() {
        nextButton.click();

        return this;
    }
}
