package view;

import model.Model;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    private static ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("ru", "RU"));

    public static String WRONG_INPUT = bundle.getString("wrongInput");
    public static String NAME_INPUT = bundle.getString("nameInput");
    public static String SURNAME_INPUT = bundle.getString("surnameInput");
    public static String SECOND_NAME_INPUT = bundle.getString("secondNameInput");
    public static String NICK_NAME_INPUT = bundle.getString("nickNameInput");
    public static String GROUP_INPUT = bundle.getString("groupInput");
    public static String HOME_NUMBER_INPUT = bundle.getString("homeNumberInput");
    public static String MOBILE_NUMBER_INPUT = bundle.getString("mobileNumberInput");
    public static String MOBILE_NUMBER_2_INPUT = bundle.getString("mobileNumber2Input");
    public static String EMAIL_INPUT = bundle.getString("emailWrongInput");
    public static String SKYPE_INPUT = bundle.getString("skypeInput");

    public static String CITY_INPUT = bundle.getString("cityInput");
    public static String INDEX_INPUT = bundle.getString("indexInput");
    public static String STREET_INPUT = bundle.getString("streetInput");
    public static String HOUSE_NUMBER_INPUT = bundle.getString("houseNumberInput");
    public static String FLAT_NUMBER_INPUT = bundle.getString("flatNumberInput");


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
