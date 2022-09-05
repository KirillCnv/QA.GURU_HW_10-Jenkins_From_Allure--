package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.HobbiesComponent;
import com.demoqa.pages.components.SelectCityComponent;
import com.demoqa.pages.components.SelectStateComponent;
import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstTestPage {

    // Elements

    private CalendarComponent calendarComponent = new CalendarComponent();
    private HobbiesComponent hobbiesComponent = new HobbiesComponent();
    private SelectStateComponent selectState = new SelectStateComponent();
    private SelectCityComponent selectCity = new SelectCityComponent();


    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            phoneInput = $("#userNumber");


    // Actions
    @Step("Открыть страницу")
    public FirstTestPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }
    @Step("Ввести имя")
    public FirstTestPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }
    @Step("Ввести фамилию")
    public FirstTestPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }
    @Step("Ввести email")
    public FirstTestPage setLastEmail(String value) {
        emailInput.setValue(value);
        return this;
    }
    @Step("Задать пол")
    public FirstTestPage setLastGender(String value) {
        $(byText(value)).click();
        return this;
    }
    @Step("Ввести номер телефона")
    public FirstTestPage setLastPhone(String value) {
        phoneInput.setValue(value);
        return this;
    }
    @Step("Ввести дату рождения")
    public FirstTestPage setBirtDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
        return this;
    }
    @Step("Ввести хобби")
    public FirstTestPage setHobbies(String value) {
        hobbiesComponent.setHobbies(value);

        return this;
    }
    @Step("Ввести предмет")
    public FirstTestPage setSubjects(String value) {
        $("#subjectsInput").setValue(value).pressEnter();

        return this;
    }
    @Step("Загрузить фото")
    public FirstTestPage uploadFile(String src) {
        $("#uploadPicture").uploadFile(new File(src));

        return this;
    }
    @Step("Ввести адрес")
    public FirstTestPage setAddress(String value) {
        $("#currentAddress").setValue(value);

        return this;
    }
    @Step("Выбрать Штат")
    public FirstTestPage selectState(String value) {
        selectState.selectState(value);
        return this;
    }
    @Step("Выбрать город")
    public FirstTestPage selectCity(String value) {
        selectCity.selectCity(value);
        return this;
    }
    @Step("Нажать кнопку \"отправить\"")
    public void submit() {
        $("#submit").click();
    }


}
