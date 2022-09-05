package com.demoqa.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SelectCityComponent {

        public SelectCityComponent selectCity(String value){
            $(byText("Select City")).click();
            $(byText(value)).click();
            return this;
        }
}
