package qa.guru.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import qa.guru.pages.*;
import qa.guru.pages.components.NavigationComponents;

import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.CRITICAL;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Owner("Голиков Евгений")
@Epic(value = "Тестирование мобильного приложения Wikipedia")
@Feature(value = "Новая фунциональность мобильного приложения Wikipedia")
@Story("Главная функциональность")
@Tag("local")
public class WikiLocalTest extends TestBase {

    protected OnboardingScreenPage onboardingScreenPage = new OnboardingScreenPage();
    protected NavigationComponents navigationComponents = new NavigationComponents();
    protected SearchPage searchPage = new SearchPage();
    protected ExplorePage explorePage = new ExplorePage();
    protected SavedPage savedPage = new SavedPage();
    protected EditsPage editsPage = new EditsPage();
    protected MoreMenuPage moreMenuPage = new MoreMenuPage();
    protected SearchResultPage searchResultPage = new SearchResultPage();

    @Severity(NORMAL)
    @Test
    @DisplayName("Проверка экранов вводной информации приложения")
    void onboardingScreenTest() {

        step("Проверка отображения заголовка на первой странице", () -> {
            onboardingScreenPage.checkTittle("The Free Encyclopedia …in over 300 languages");
        });

        step("Проверка наличия кнопки +Add or edit language на первой странице", () -> {
            onboardingScreenPage.checkAddOrEditLanguageButton();
        });

        step("Переход на вторую страницу", () -> {
            onboardingScreenPage.clickContinueButton();
        });

        step("Проверка отображения текста на второй странице", () -> {
            onboardingScreenPage.checkTittle("New ways to explore");
        });

        step("Переход на третью страницу", () -> {
            onboardingScreenPage.clickContinueButton();
        });

        step("Проверка отображения текста на третьей странице", () -> {
            onboardingScreenPage.checkTittle("Reading lists with sync");
        });

        step("Переход на четвертую страницу", () -> {
            onboardingScreenPage.clickContinueButton();
        });

        step("Проверка отображения текста на четвертой странице", () -> {
            onboardingScreenPage.checkTittle("Send anonymous data");
        });

        step("Проверка наличия кнопки Accept на четвертой странице", () -> {
            onboardingScreenPage.checkAcceptButton();
        });

        step("Проверка наличия кнопки Reject на четвертой странице", () -> {
            onboardingScreenPage.checkRejectButton();
        });
    }

    @Severity(CRITICAL)
    @Test
    @DisplayName("Проверка поиска")
    void searchPageTest() {

        step("Нажатие на кнопку Skip", () -> {
            onboardingScreenPage.clickSkipButton();
        });

        step("Нажатие на кнопку Search на панели Меню", () -> {
            navigationComponents.clickSearchComponentButton();
        });

        step("Нажатие на кнопку Поиска на странице", () -> {
            searchPage.clickSearchButton();
        });

        step("Ввод текста в поле Поиска", () -> {
            searchPage.setSearchValue("Hockey");
        });

        step("Проверка наличия контента в списке результов поиска", () -> {
            searchResultPage.checkResultList();
        });

        step("Выбор первой статьи из списка результов поиска", () -> {
            searchResultPage.clickElementInResultList();
        });

        step("Проверка наличия контента в открытой статье", () -> {
            searchResultPage.checkSearchResultContent("Hockey");
        });
    }

    @Severity(NORMAL)
    @Test
    @DisplayName("Проверка страницы Explore")
    void explorePageTest() {

        step("Нажатие на кнопку Skip", () -> {
            onboardingScreenPage.clickSkipButton();
        });

        step("Нажатие на кнопку Explore на панели Меню", () -> {
            navigationComponents.clickExploreComponentButton();
        });

        step("Проверка наличия картинки на странице", () -> {
            explorePage.checkHeaderImage();
        });

        step("Проверка наличия текста на странице", () -> {
            explorePage.checkAnnouncementText("Customize your Explore feed\n" +
                    "\n" +
                    "You can now choose what to show on your feed, and also prioritize your favorite types of content.");
        });

        step("Проверка наличия кнопки Customize на странице", () -> {
            explorePage.checkCustomizeButton();
        });

        step("Проверка наличия кнопки Got It на странице", () -> {
            explorePage.checkGotItButton();
        });

        step("Проверка наличия кнопки Голосового поиска на странице", () -> {
            explorePage.checkVoiceSearchButton();
        });

        step("Проверка наличия кнопки Текстового поиска на странице", () -> {
            explorePage.checkSearchButton();
        });
    }

    @Severity(NORMAL)
    @Test
    @DisplayName("Проверка страницы Saved")
    void savedPageTest() {

        step("Нажатие на кнопку Skip", () -> {
            onboardingScreenPage.clickSkipButton();
        });

        step("Нажатие на кнопку Saved на панели Меню", () -> {
            navigationComponents.clickSavedComponentButton();
        });

        step("Проверка наличия картинки на странице", () -> {
            savedPage.checkMainImage();
        });

        step("Проверка наличия заголовка на странице", () -> {
            savedPage.checkTitleText("Sync reading lists");
        });

        step("Проверка наличия текста на странице", () -> {
            savedPage.checkMessageText("Reading lists can now be synced across devices. Log in to your Wikipedia account and allow your lists to be saved.");
        });

        step("Проверка наличия кнопки Log In / Join Wikipedia на странице", () -> {
            savedPage.checkLoginButton();
        });

        step("Проверка наличия кнопки Not now на странице", () -> {
            savedPage.checkNotNowButton();
        });

        step("Проверка наличия кнопки с листом на странице", () -> {
            savedPage.checkMenuSearchListButton();
        });

        step("Проверка наличия кнопки с настройками на странице", () -> {
            savedPage.checkMenuOverflowButton();
        });
    }

    @Severity(NORMAL)
    @Test
    @DisplayName("Проверка страницы Edits")
    void EditsPageTest() {

        step("Нажатие на кнопку Skip", () -> {
            onboardingScreenPage.clickSkipButton();
        });

        step("Нажатие на кнопку Edit на панели Меню", () -> {
            navigationComponents.clickEditsComponentButton();
        });

        step("Проверка наличия картинки на странице", () -> {
            editsPage.checkMainImage();
        });

        step("Проверка наличия заголовка на странице", () -> {
            editsPage.checkTitleText("Did you know that everyone can edit Wikipedia?");
        });

        step("Проверка наличия текста на странице", () -> {
            editsPage.checkMessageText("Suggested edits is a new way to edit Wikipedia on Android. It helps you make small but vital contributions to Wikipedia.\n" +
                    "Our goal is to make editing easier and more accessible for everyone! Log in or join Wikipedia to get started.");
        });

        step("Проверка наличия кнопки Log In / Join Wikipedia на странице", () -> {
            editsPage.checkLoginButton();
        });
    }

    @Severity(NORMAL)
    @Test
    @DisplayName("Проверка страницы More")
    void MoreMenuPageTest() {

        step("Нажатие на кнопку Skip", () -> {
            onboardingScreenPage.clickSkipButton();
        });

        step("Нажатие на кнопку More на панели Меню", () -> {
            navigationComponents.clickMoreComponentButton();
        });

        step("Проверка наличия кнопки Log In / Join Wikipedia на странице", () -> {
            moreMenuPage.checkLoginButton();
        });

        step("Проверка наличия кнопки Settings на странице", () -> {
            moreMenuPage.checkSettingsButton();
        });

        step("Проверка наличия кнопки Donate на странице", () -> {
            moreMenuPage.checkDonateButton();
        });
    }
}