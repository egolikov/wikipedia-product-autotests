package qa.guru.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchPage {

    private final SelenideElement
            searchButton = $(accessibilityId("Search Wikipedia")),
            searchInputField = $(id("org.wikipedia.alpha:id/search_src_text")),
            searchResultContent = $(id("org.wikipedia.alpha:id/page_web_view"));

    private final ElementsCollection
            searchResultListItems = $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")),
            searchResultListDescriptions = $$(id("org.wikipedia.alpha:id/page_list_item_description"));

    public SearchPage clickSearchButton() {
        searchButton.click();

        return this;
    }

    public SearchPage setSearchValue(String value) {
        searchInputField.sendKeys(value);
        return this;
    }

    public SearchPage checkResultList() {
        searchResultListItems.shouldHave(sizeGreaterThan(0));
        return this;
    }

    public SearchPage clickFirstElementResultList() {
        searchResultListDescriptions.first().click();
        return this;
    }

    public SearchPage checkSearchResultContent() {
        searchResultContent.shouldBe(visible);
        return this;
    }
}
