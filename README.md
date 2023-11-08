<h1 >Проект по автоматизации тестирования мобильного приложения <a href="https://github.com/wikimedia/apps-android-wikipedia/">Wikipedia</a></h1>

<p align="center">  
<img src="images/logo/WikiLogo.png" alt="MainLogo" width="950"/></a>  
</p>

# 🧾 Содержание:

- [Технологии и инструменты](#технологии-и-инструменты)
- [Реализованные проверки](#Реализованные-проверки)
- [Запуск тестов (Сборка в Jenkins)](#запуск-тестов-сборка-в-jenkins)
- [Запуск тестов (Из терминала)](#запуск-тестов-из-терминала)
- [Интеграция с Allure Report](#allure-report)
- [Интеграция с Allure TestOps](#интеграция-с-allure-testops)
- [Интеграция с Jira](#интеграция-с-jira)
- [Уведомление в Telegram о результатах выполнения автоматизированных тестов](#уведомление-в-telegram-о-результатах-выполнения-автоматизированных-тестов)
- [Видеопример прохождения тестов Browserstack](#видеопример-прохождения-тестов-browserstack)

<a id="технологии-и-инструменты"></a>

## 🔨 Технологии и инструменты:

| Java                                                                                                     | IntelliJ  <br>  Idea                                                                                               | GitHub                                                                                                     | JUnit 5                                                                                                           | Gradle                                                                                                     | Selenide                                                                                                         | Selenoid                                                                                                                  | Allure <br> Report                                                                                                         | Appium                                                                                                    | Browserstack                                                                                                                    | Jenkins                                                                                                          | Jira                                                                                                                                    | Telegram                                                                                                            |                                                                                            Allure <br> TestOps |
|:---------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://github.com/allure-framework"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> | <a href="https://appium.io//"><img src="images\logo\Appium.svg" width="50" height="50" alt="Appium"/></a> | <a href="https://www.browserstack.com/"><img src="images\logo\Browserstack.svg" width="50" height="50" alt="Browserstack"/></a> | <a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://www.atlassian.com/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50" alt="Java" title="Java"/></a> | <a href="https://web.telegram.org/"><img src="images\logo\Telegram.svg" width="50" height="50" alt="Telegram"/></a> | <a href="https://qameta.io/"><img src="images\logo\Allure_TO.svg" width="50" height="50" alt="Allure_TO"/></a> |

В данном проекте автоматизированные тесты написаны на языке программирования **Java**, с использованием фреймворка для
тестирования **Selenide**. Для сборки проекта в интегрированной среде разработки IntelliJ IDEA используется сборщик
проектов
**Gradle**.
Для модульного тестирования приложения используется фреймворк **JUnit 5**. Запуск тестов осуществляется с использованием
системы сборки и автоматизации **Jenkins**.
Важно отметить, что для локального тестирования приложения на мобильных устройствах используется **Android Studio**, а
для
удаленного тестирования в различных платформах - **Browserstack**.
**Allure Report**, **AllureTestOps** и **Telegram Bot** используются для визуализации результатов тестирования.

<a id="Реализованные-проверки"></a>

## 🏁 Реализованные проверки:

### При запуске локально (local):

- Проверка экранов вводной информации приложения
- Проверка поиска
- Проверка страниц Explore, Saved, Edits, More

### При запуске удаленно (remote):

- Проверка поиска
- Проверка страницы Авторизации
- Проверка смены языка

<a id="запуск-тестов-сборка-в-jenkins"></a>

## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/wikipedia-product-autotests/)

<p align="center">  
<img src="images/screen/JenkinsBuild.png" alt="Jenkins" width="950"/></a>  
</p>

<a id="запуск-тестов-из-терминала"></a>

## 🚀 Команда для запуска автотестов из терминала

Запуск локально (local):

```bash  
gradle clean local_test -DdeviceHost=local
```

> Внимание! Для запуска локальных тестов на компьютере должны быть установлены Android Studio, Appium Server и Appium

Запуск удаленно (remote):

```bash  
gradle clean remote_test -DdeviceHost=remote
```

<a id="allure-report"></a>

## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://jenkins.autotests.cloud/job/wikipedia-product-autotests/allure/">Allure Report</a>

## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/AllureOverview.png" width="850">  
</p>  

## 📄 Тест-кейсы

<p align="center">  
<img title="Allure Tests" src="images/screen/AllureCases.png" width="850">   
</p>

## 📊 Графики

<p align="center">   
<img title="Allure Graphics1" src="images/screen/AllureG1.png" width="850">  
<img title="Allure Graphics2" src="images/screen/AllureG2.png" width="850">  
</p>

<a id="интеграция-с-allure-testops"></a>

## <img alt="Allure_TO" height="25" src="images/logo/Allure_TO.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3732/dashboards">Allure TestOps</a>

## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screen/OpsDashView.png" width="850">  
</p>  

## 📄 Авто и Ручные тест-кейсы

<p align="center">  
<img title="Allure Tests" src="images/screen/OpsCasesView.png" width="850">  
</p>

<a id="интеграция-с-jira"></a>

## <img alt="Allure" height="25" src="images/logo/Jira.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-920">Jira</a>

<p align="center">  
<img title="Jira" src="images/screen/JiraView.png" width="">  
</p>

____

<a id="уведомление-в-telegram-о-результатах-выполнения-автоматизированных-тестов"></a>

## <img alt="Allure" height="25" src="images/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота

____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/TelegView.png" width="550">  
</p>

____

<a id="видеопример-прохождения-тестов-browserstack"></a>

## <img alt="Browserstack" height="25" src="images/logo/Browserstack.svg" width="25"/></a> Видеопример выполнения теста Browserstack

____
<p align="center">
<img title="Browserstack Video" src="images/screen/Browserstack.gif" width="550" height="350"  alt="video">   
</p>

