package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchPage {

    private final SelenideElement
            searchButton = $(accessibilityId("Search Wikipedia")),
            searchInputField = $(id("org.wikipedia.alpha:id/search_src_text"));

    public SearchPage clickSearchButton() {
        searchButton.click();

        return this;
    }

    public SearchPage setSearchValue(String value) {
        searchInputField.sendKeys(value);

        return this;
    }
}
