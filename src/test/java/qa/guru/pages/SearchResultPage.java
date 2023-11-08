package qa.guru.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.className;
import static io.appium.java_client.AppiumBy.id;

public class SearchResultPage {

    private final SelenideElement
            searchResultContent = $(className("android.view.View")),
            searchResultItem = $(id("org.wikipedia.alpha:id/page_list_item_description"));

    private final ElementsCollection
            searchResultListItems = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    public SearchResultPage checkResultList() {
        searchResultListItems.shouldHave(sizeGreaterThan(0));

        return this;
    }

    public SearchResultPage clickElementInResultList() {
        searchResultItem.click();

        return this;
    }

    public SearchResultPage checkSearchResultContent(String value) {
        searchResultContent.shouldHave(text(value));

        return this;
    }
}
