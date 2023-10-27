package qa.guru.pages;

import com.codeborne.selenide.ElementsCollection;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class SettingsPage {

    private final ElementsCollection
        baseLanguage = $$(AppiumBy.className("android.widget.TextView"));


    public SettingsPage clickLanguageField() {
        baseLanguage.findBy(text("Wikipedia language")).click();

        return this;
    }

    public SettingsPage checkLanguage(String value) {
        baseLanguage.findBy(text(value)).shouldBe(visible);

        return this;
    }
}
