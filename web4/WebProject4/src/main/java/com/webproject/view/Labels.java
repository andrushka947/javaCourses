package com.webproject.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class Labels {
    private static String login;
    private static String password;
    private static String name;
    private static String surname;
    private static String secondName;
    private static String signUpButton;
    private static String loginButton;
    private static String logoutButton;
    private static int certificateMark;

    private static String math;
    private static String ukrainianLanguage;
    private static String chemistry;
    private static String ukrainianHistory;
    private static String englishLanguage;
    private static String geography;
    private static String biology;
    private static String physics;

    public Labels(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("labels",/* locale*/ new Locale("en", "EN"));
        login = bundle.getString("login");
        password = bundle.getString("password");
        name = bundle.getString("name");
        surname = bundle.getString("surname");
        secondName  = bundle.getString("secondName");
        signUpButton = bundle.getString("signUpButton");
        loginButton = bundle.getString("loginButton");
        logoutButton = bundle.getString("logoutButton");
        certificateMark = Integer.parseInt(bundle.getString("certificateMark"));

        math = bundle.getString("subject.math");
        ukrainianHistory = bundle.getString("subject.ukrainianHistory");
        chemistry = bundle.getString("subject.chemistry");
        ukrainianLanguage= bundle.getString("subject.ukrainianLanguage");
        englishLanguage = bundle.getString("subject.englishLanguage");
        geography = bundle.getString("subject.geography");
        biology = bundle.getString("subject.biology");
        physics = bundle.getString("subject.physics");
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        Labels.login = login;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Labels.password = password;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Labels.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Labels.surname = surname;
    }

    public static String getSecondName() {
        return secondName;
    }

    public static void setSecondName(String secondName) {
        Labels.secondName = secondName;
    }

    public static String getSignUpButton() {
        return signUpButton;
    }

    public static void setSignUpButton(String signUpButton) {
        Labels.signUpButton = signUpButton;
    }

    public static String getLoginButton() {
        return loginButton;
    }

    public static void setLoginButton(String loginButton) {
        Labels.loginButton = loginButton;
    }

    public static String getLogoutButton() {
        return logoutButton;
    }

    public static void setLogoutButton(String logoutButton) {
        Labels.logoutButton = logoutButton;
    }

    public static int getCertificateMark() {
        return certificateMark;
    }

    public static void setCertificateMark(int certificateMark) {
        Labels.certificateMark = certificateMark;
    }

    public static String getMath() {
        return math;
    }

    public static void setMath(String math) {
        Labels.math = math;
    }

    public static String getUkrainianLanguage() {
        return ukrainianLanguage;
    }

    public static void setUkrainianLanguage(String ukrainianLanguage) {
        Labels.ukrainianLanguage = ukrainianLanguage;
    }

    public static String getChemistry() {
        return chemistry;
    }

    public static void setChemistry(String chemistry) {
        Labels.chemistry = chemistry;
    }

    public static String getUkrainianHistory() {
        return ukrainianHistory;
    }

    public static void setUkrainianHistory(String ukrainianHistory) {
        Labels.ukrainianHistory = ukrainianHistory;
    }

    public static String getEnglishLanguage() {
        return englishLanguage;
    }

    public static void setEnglishLanguage(String englishLanguage) {
        Labels.englishLanguage = englishLanguage;
    }

    public static String getGeography() {
        return geography;
    }

    public static void setGeography(String geography) {
        Labels.geography = geography;
    }

    public static String getBiology() {
        return biology;
    }

    public static void setBiology(String biology) {
        Labels.biology = biology;
    }

    public static String getPhysics() {
        return physics;
    }

    public static void setPhysics(String physics) {
        Labels.physics = physics;
    }
}
