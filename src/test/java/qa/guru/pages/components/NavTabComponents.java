package qa.guru.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class NavTabComponents {

    private final SelenideElement
            exploreComponentButton = $(id("org.wikipedia.alpha:id/nav_tab_explore")),
            savedComponentButton = $(id("org.wikipedia.alpha:id/nav_tab_reading_lists")),
            searchComponentButton = $(id("org.wikipedia.alpha:id/nav_tab_search")),
            editsComponentButton = $(id("org.wikipedia.alpha:id/nav_tab_edits")),
            moreComponentButton = $(id("org.wikipedia.alpha:id/nav_more_container"));

    public NavTabComponents clickExploreComponentButton() {
        exploreComponentButton.click();

        return this;
    }

    public NavTabComponents clickSavedComponentButton() {
        savedComponentButton.click();

        return this;
    }

    public NavTabComponents clickSearchComponentButton() { //todo may be void method ?
        searchComponentButton.click();

        return this;
    }

    public NavTabComponents clickEditsComponentButton() {
        editsComponentButton.click();

        return this;
    }

    public NavTabComponents clickMoreComponentButton() {
        moreComponentButton.click();

        return this;
    }
}
