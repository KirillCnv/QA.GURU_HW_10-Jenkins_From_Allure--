package com.demoqa.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HobbiesComponent {
    public HobbiesComponent setHobbies(String value){
        $(byText(value)).click();

        return this;
    }
}
