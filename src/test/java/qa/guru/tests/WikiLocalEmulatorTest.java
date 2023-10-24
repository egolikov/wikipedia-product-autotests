package qa.guru.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import qa.guru.pages.OnboardingScreenPage;
import qa.guru.pages.components.NextButtonComponent;

import static io.qameta.allure.Allure.step;

public class WikiLocalEmulatorTest extends TestBase {

    OnboardingScreenPage onboardingScreenPage = new OnboardingScreenPage();
    NextButtonComponent nextButtonComponent = new NextButtonComponent();

    @Test
    @Tag("local")
    @DisplayName("Проверка экранов ввода в приложение")
    void onboardingScreenTest() {

        step("Проверка отображения текста на первой странице", () -> {
            onboardingScreenPage.checkTittle("The Free Encyclopedia …in over 300 languages");
        });

        step("Проверка наличия кнопки +Add or edit language на первой странице странице", () -> {
            onboardingScreenPage.getAddOrEditLanguageButton();
        });

        step("Переход на вторую страницу Википедии", () -> {
            nextButtonComponent.clickNextButton();
        });

        step("Проверка отображения текста на второй странице", () -> {
            onboardingScreenPage.checkTittle("New ways to explore");
        });

        step("Переход на третью страницу Википедии", () -> {
            nextButtonComponent.clickNextButton();
        });

        step("Проверка отображения текста на третьей странице", () -> {
            onboardingScreenPage.checkTittle("Reading lists with sync");
        });

        step("Переход на четвертую страницу Википедии", () -> {
            nextButtonComponent.clickNextButton();
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
}