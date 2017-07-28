package controller;

public interface InputConstants {

    String NAME_INPUT = "^[A-Za-z]{1,15}$";
    String SURNAME_INPUT = "^[A-Za-z]{1,20}$";
    String SECOND_NAME_INPUT = "^[A-Za-z]{1,20}$";
    String NICK_NAME_INPUT = "^[A-Za-z]{1,20}$";
    String GROUP_INPUT = "^((Family) | (Friends) | (Work))$";

    String HOME_NUMBER_INPUT = "^\\+?([0-9]{2})?\\(?[0-9]{3}\\)?[0-9]{3}\\-?[0-9]{2}\\-?[0-9]{2}$";
    String MOBILE_NUMBER_INPUT = "^\\+?([0-9]{2})?\\(?[0-9]{3}\\)?[0-9]{3}\\-?[0-9]{2}\\-?[0-9]{2}$";

    String EMAIL_INPUT = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,5})$";
    String SKYPE_INPUT = "^[A-Za-z0-9]{1,20}$";

    String CITY_INPUT = "^[A-Za-z]{1,20}$";
    String INDEX_INPUT = "^[0-9]{5}$";
    String STREET_INPUT = "^[A-Za-z]{1,20}$";
    String HOUSE_NUMBER_INPUT = "^[0-9]{1,3}$";
    String FLAT_NUMBER_INPUT = "^[0-9]{1,3}$";
}
