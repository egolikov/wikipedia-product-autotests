package qa.guru.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import qa.guru.pages.*;
import qa.guru.pages.components.LanguageComponent;
import qa.guru.pages.components.NavigationComponents;

import static io.qameta.allure.Allure.step;

public class WikiRemoteTest extends TestBase {

    SearchPage searchPage = new SearchPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    ErrorsResultPage errorsResultPage = new ErrorsResultPage();
    NavigationComponents navigationComponents = new NavigationComponents();
    LoginPage loginPage = new LoginPage();
    SettingsPage settingsPage = new SettingsPage();
    LanguageComponent languageComponent = new LanguageComponent();

    @Test
    @Tag("remote")
    @DisplayName("Проверка поиска")
    void successfulWikiSearchTest() {

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
            searchResultPage.clickFirstElementResultList();
        });

        step("Проверка наличия кнопки Go Back", () -> {
            errorsResultPage.checkGoBackButton();
        });

        step("Проверка наличия текста с ошибкой", () -> {
            errorsResultPage.checkErrorText("An error occurred");
        });
    }

    @Test
    @Tag("remote")
    @DisplayName("Проверка страницы Авторизации")
    void checkLogInButtonTest() {

        step("Нажатие на кнопку навигации", () -> {
            navigationComponents.clickNavigationButton();
        });

        step("Нажатие на кнопку Login в меню навигации", () -> {
            navigationComponents.clickLogInNavigationButton();
        });

        step("Проверка наличия поля Login на странице Авторизации", () -> {
            loginPage.checkLoginField();
        });

        step("Проверка наличия поля Password на странице Авторизации", () -> {
            loginPage.checkPasswordField();
        });

        step("Проверка наличия кнопки Login на странице Авторизации", () -> {
            loginPage.checkLoginButton();
        });

        step("Проверка наличия ссылки Privacy policy на странице Авторизации", () -> {
            loginPage.checkPolicyLink();
        });

        step("Проверка наличия ссылки Don't have an account? Join Wikipedia на странице Авторизации", () -> {
            loginPage.checkJoinWikipediaLink();
        });
    }

    @Test
    @Tag("remote")
    @DisplayName("Смена языка")
    void changeLanguage() {

        step("Нажатие на кнопку навигации", () -> {
            navigationComponents.clickNavigationButton();
        });

        step("Открытие пункта меню Настройки", () -> {
            navigationComponents.clickSettingsNavigationButton();
        });

        step("Открытие панели выбораа языка", () -> {
            settingsPage.clickLanguageField();
        });

        step("Выбор язык", () -> {
            languageComponent.selectLanguage("Svenska");
        });

        step("Проверка смены языка", () -> {
            settingsPage.checkLanguage("Svenska");
        });
    }
}

