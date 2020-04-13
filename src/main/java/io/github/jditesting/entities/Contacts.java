package io.github.jditesting.entities;

public class Contacts {

    public String name, lastName, position, gender, religion, weather, description;
    public String passportNumber, passportSeria;
    public String passport, acceptConditions;
    public Contacts() {}
    public Contacts(String name, String lastName, String position, String gender,
               String religion, String weather, String description, String passportNumber,
            String passportSeria, String passport, String acceptConditions) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.gender = gender;
        this.religion = religion;
        this.weather = weather;
        this.description = description;
        this.passportNumber = passportNumber;
        this.passportSeria = passportSeria;
        this.passport = passport;
        this.acceptConditions = acceptConditions;
    }
    public Contacts setName(String name) {
        this.name = name;
        return this;
    }
    public Contacts setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public Contacts setPosition(String position) {
        this.position = position;
        return this;
    }
    public Contacts setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public Contacts setReligion(String religion) {
        this.religion = religion;
        return this;
    }
    public Contacts setWeather(String weather) {
        this.weather = weather;
        return this;
    }
    public Contacts setDescription(String description) {
        this.description = description;
        return this;
    }
    public Contacts setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
        return this;
    }
    public Contacts setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
        return this;
    }
    public Contacts setPassport(String passport) {
        this.passport = passport;
        return this;
    }
    public Contacts setAcceptConditions(String acceptConditions) {
        this.acceptConditions = acceptConditions;
        return this;
    }
}