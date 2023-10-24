package qa.guru.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class NavTabComponents {

    private final SelenideElement searchComponentButton = $(id("org.wikipedia.alpha:id/nav_tab_search"));

    public NavTabComponents clickSearchComponentButton() {
        searchComponentButton.click();

        return this;
    }
}
