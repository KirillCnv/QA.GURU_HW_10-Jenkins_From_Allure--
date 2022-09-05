package com.demoqa.utils;

import com.github.javafaker.Faker;

import static java.lang.String.format;

public class TestData {


    Faker faker = new Faker();
    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = "Male",
            mobileNumber = faker.phoneNumber().subscriberNumber(10),
            day = faker.number().numberBetween(20, 30) + "",
            month = "May",
            year = faker.number().numberBetween(1990, 2022) + "",
            hobbie = "Sports",
            subject = "Computer Science",
            uploadFoto = "src/test/resources/1.jpg",
            address = faker.address().fullAddress(),
            state = "NCR",
            city = "Delhi",
            verificationFoto = "1.jpg";

    public String fullName = format("%s %s", firstName, lastName),
            fullDate = format("%s %s,%s", day, month, year),
            stateAndCity = format("%s %s", state, city);

}
