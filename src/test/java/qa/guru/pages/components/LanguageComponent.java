package qa.guru.pages.components;

import com.codeborne.selenide.ElementsCollection;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class LanguageComponent {

    private final ElementsCollection
        languageChoice = $$(AppiumBy.id("org.wikipedia.alpha:id/localized_language_name"));

    public LanguageComponent selectLanguage(String value) {
        languageChoice.findBy(text(value)).click();

        return this;
    }
}
