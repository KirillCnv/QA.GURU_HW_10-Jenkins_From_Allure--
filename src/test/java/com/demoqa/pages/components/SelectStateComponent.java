package com.demoqa.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SelectStateComponent {
    public SelectStateComponent selectState(String value) {
        $(byText("Select State")).click();
        $(byText(value)).click();
        return this;
    }
}
