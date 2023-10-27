package qa.guru.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class NavigationComponents {

    private final SelenideElement
            exploreComponentButton = $(id("org.wikipedia.alpha:id/nav_tab_explore")),
            savedComponentButton = $(id("org.wikipedia.alpha:id/nav_tab_reading_lists")),
            searchComponentButton = $(id("org.wikipedia.alpha:id/nav_tab_search")),
            editsComponentButton = $(id("org.wikipedia.alpha:id/nav_tab_edits")),
            moreComponentButton = $(id("org.wikipedia.alpha:id/nav_more_container")),
            navigationButton = $(id("org.wikipedia.alpha:id/menu_overflow_button")),
            navigationLoginButton = $(id("org.wikipedia.alpha:id/explore_overflow_account_name")),
            navigationSettingsButton = $(id("org.wikipedia.alpha:id/explore_overflow_settings"));

    public NavigationComponents clickExploreComponentButton() {
        exploreComponentButton.click();

        return this;
    }

    public NavigationComponents clickSavedComponentButton() {
        savedComponentButton.click();

        return this;
    }

    public NavigationComponents clickSearchComponentButton() {
        searchComponentButton.click();

        return this;
    }

    public NavigationComponents clickEditsComponentButton() {
        editsComponentButton.click();

        return this;
    }

    public NavigationComponents clickMoreComponentButton() {
        moreComponentButton.click();

        return this;
    }

    public NavigationComponents clickNavigationButton() {
        navigationButton.click();

        return this;
    }

    public NavigationComponents clickLogInNavigationButton() {
        navigationLoginButton.click();

        return this;
    }

    public NavigationComponents clickSettingsNavigationButton() {
        navigationSettingsButton.click();

        return this;
    }
}
