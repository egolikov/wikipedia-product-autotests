package qa.guru.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import qa.guru.pages.OnboardingScreenPage;
import qa.guru.pages.SearchPage;
import qa.guru.pages.components.NavTabComponents;

import static io.qameta.allure.Allure.step;

public class WikiLocalEmulatorTest extends TestBase {

    OnboardingScreenPage onboardingScreenPage = new OnboardingScreenPage();
    NavTabComponents navTabComponents = new NavTabComponents();
    SearchPage searchPage = new SearchPage();

    @Test
    @Tag("local")
    @DisplayName("Проверка экранов ввода в приложение")
    void onboardingScreenTest() {

        step("Проверка отображения заголовка на первой странице", () -> {
            onboardingScreenPage.checkTittle("The Free Encyclopedia …in over 300 languages");
        });

        step("Проверка наличия кнопки +Add or edit language на первой странице", () -> {
            onboardingScreenPage.getAddOrEditLanguageButton();
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
            onboardingScreenPage.getAcceptButton();
        });

        step("Проверка наличия кнопки Reject на четвертой странице", () -> {
            onboardingScreenPage.getRejectButton();
        });
    }

    @Test
    @Tag("local")
    @DisplayName("Проверка поиска")
    void searchTest() {

        step("Нажатие на кнопку Skip", () -> {
            onboardingScreenPage.clickSkipButton();
        });

        step("Нажатие на кнопку Поиска на панели Меню", () -> {
            navTabComponents.clickSearchComponentButton();
        });

        step("Нажатие на кнопку Поиска на странице", () -> {
            searchPage.clickSearchButton();
        });

        step("Ввод текста в поле Поиска", () -> {
            searchPage.setSearchValue("Hockey");
        });

        step("Проверка наличия контента в списке результов поиска", () -> {
            searchPage.checkResultList();
        });

        step("Выбор первой статьи из списка результов поиска", () -> {
            searchPage.clickFirstElementResultList();
        });

        step("Проверка наличия контента в открытой статье", () -> {
            searchPage.checkSearchResultContent();
        });
    }
}