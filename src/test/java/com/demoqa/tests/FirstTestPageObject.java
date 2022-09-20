package com.demoqa.tests;

import com.demoqa.pages.FirstTestPage;
import com.demoqa.pages.components.ResultComponent;
import com.demoqa.utils.TestConfig;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.demoqa.tests.TestData.*;


public class FirstTestPageObject extends TestConfig {

    FirstTestPage firstTestPage = new FirstTestPage();
    ResultComponent result = new ResultComponent();


    @Feature("Проверка веб формы https://demoqa.com")
    @Story("Заполнение формы")
    @Owner("KirillCnv")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "Testing", url = "https://demoqa.com/automation-practice-form")
    @DisplayName("Проверка веб формы https://demoqa.com (Jenkins)")
    @Tag("all")
    @Test
    void autoTest() {
        firstTestPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setLastEmail(email)
                .setLastGender(gender)
                .setLastPhone(mobileNumber)
                .setBirtDate(day, month, year)
                .setHobbies(hobbie)
                .setSubjects(subject)
                .uploadFile(uploadFoto)
                .setAddress(address)
                .selectState(state)
                .selectCity(city)
                .submit();
        result.checkTitle()
                .checkResult("Student Name", fullName)
                .checkResult("Student Email", email)
                .checkResult("Gender", gender)
                .checkResult("Mobile", mobileNumber)
                .checkResult("Date of Birth", fullDate)
                .checkResult("Subjects", subject)
                .checkResult("Hobbies", hobbie)
                .checkResult("Picture", verificationFoto)
                .checkResult("Address", address)
                .checkResult("State and City", stateAndCity);
    }
}





