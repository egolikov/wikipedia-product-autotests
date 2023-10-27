package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class ExplorePage {

    private final SelenideElement
            headerImage = $(id("org.wikipedia.alpha:id/view_announcement_header_image")),
            announcementText = $(id("org.wikipedia.alpha:id/view_announcement_text")),
            customizeButton = $(id("org.wikipedia.alpha:id/view_announcement_action_positive")),
            gotItButton = $(id("org.wikipedia.alpha:id/view_announcement_action_negative")),
            voiceSearchButton = $(id("org.wikipedia.alpha:id/voice_search_button")),
            searchButton = $(accessibilityId("Search Wikipedia"));

    public ExplorePage checkHeaderImage() {
        headerImage.shouldBe(visible);

        return this;
    }

    public ExplorePage checkAnnouncementText(String value) {
        announcementText.shouldHave(text(value));

        return this;
    }

    public ExplorePage checkCustomizeButton() {
        customizeButton.shouldBe(visible);

        return this;
    }

    public ExplorePage checkGotItButton() {
        gotItButton.shouldBe(visible);

        return this;
    }

    public ExplorePage checkVoiceSearchButton() {
        voiceSearchButton.shouldBe(visible);

        return this;
    }

    public ExplorePage checkSearchButton() {
        searchButton.shouldBe(visible);

        return this;
    }
}
