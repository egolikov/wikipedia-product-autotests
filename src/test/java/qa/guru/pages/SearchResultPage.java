package qa.guru.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class SearchResultPage {

    private final SelenideElement
            searchResultContent = $(id("org.wikipedia.alpha:id/page_web_view"));

    private final ElementsCollection
            searchResultListItems = $$(id("org.wikipedia.alpha:id/page_list_item_title")),
            searchResultListDescriptions = $$(id("org.wikipedia.alpha:id/page_list_item_description"));

    public SearchResultPage checkResultList() {
        searchResultListItems.shouldHave(sizeGreaterThan(0));

        return this;
    }

    public SearchResultPage clickFirstElementResultList() {
        searchResultListDescriptions.first().click();

        return this;
    }

    public SearchResultPage checkSearchResultContent() {
        searchResultContent.shouldBe(visible);

        return this;
    }
}
