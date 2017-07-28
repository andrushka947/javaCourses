package view;

import model.Model;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    private static ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("ru", "RU"));

    public static String WRONG_INPUT = /*"Wrong input. ";*/ bundle.getString("wrongInput");
    public static String NAME_INPUT = /*"Input name in format [A-Za-z]{1,15}"; */bundle.getString("nameInput");
    public static String SURNAME_INPUT = /*"Input surname in format [A-Za-z]{1,20}";*/ bundle.getString("surnameInput");
    public static String SECOND_NAME_INPUT = /*"Input second name in format [A-Za-z]{1,20}";*/ bundle.getString("secondNameInput");
    public static String NICK_NAME_INPUT = /*"Input nick name in format [A-Za-z]{1,20}";*/ bundle.getString("nickNameInput");
    public static String GROUP_INPUT = /*"Input group name(family, friends, work)"; */bundle.getString("groupInput");
    public static String HOME_NUMBER_INPUT = /*"Input home number in format +38(044)000-00-00"; */bundle.getString("homeNumberInput");
    public static String MOBILE_NUMBER_INPUT = /*"Input mobile number in format +38(000)000-00-00"; */bundle.getString("mobileNumberInput");
    public static String MOBILE_NUMBER_2_INPUT = /*"Input second mobile number in format +38(000)000-00-00, or input dot symbol to skip it"; */bundle.getString("mobileNumber2Input");
    public static String EMAIL_INPUT = /*"Input email in format email@email.com"; */bundle.getString("emailWrongInput");
    public static String SKYPE_INPUT = /*"Input skype login in format [A-Za-z]{1,20}"; */bundle.getString("skypeInput");

    public static String CITY_INPUT = /*"Input town in format [A-Za-z]{1,20}";*/ bundle.getString("cityInput");
    public static String INDEX_INPUT = /*"Input index in format [0-9]{5}";*/ bundle.getString("indexInput");
    public static String STREET_INPUT = /*"Input street in format [A-Za-z]{1,20}";*/ bundle.getString("streetInput");
    public static String HOUSE_NUMBER_INPUT = /* "Input house number in format [0-9]{1,3}";*/ bundle.getString("houseNumberInput");
    public static String FLAT_NUMBER_INPUT = /* "Input flat number in format [0-9]{1,3}";*/ bundle.getString("flatNumberInput");


    public View() {}

    public void print(String message) {
        System.out.println(message);
    }

    public void printModel(Model model) {
        System.out.println(model.toString());
    }

    public void wrongInput(String message) {
        System.out.println(WRONG_INPUT + message);
    }

}
