package controller;

import model.Address;
import model.Group;
import model.Model;
import view.View;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Special controller that allow u to create a model object, fill it with data and return
 */
public class InputNoteController {

    private View view;
    private Scanner sc;

    public InputNoteController(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }


    /** The method, that create new model object, fill it with data and return
     * @return model object
     */
    public Model inputDataAndReturn() {

        Model model = new Model();
        model.setName(inputStringWithScanner(View.NAME_INPUT, InputConstants.NAME_INPUT));
        model.setSurname(inputStringWithScanner(View.SURNAME_INPUT, InputConstants.SURNAME_INPUT));
        model.setSecondName(inputStringWithScanner(View.SECOND_NAME_INPUT, InputConstants.SECOND_NAME_INPUT));
        model.setNickName(inputStringWithScanner(View.NICK_NAME_INPUT, InputConstants.NICK_NAME_INPUT));
        model.setGroup(inputGroupName(View.GROUP_INPUT));
        model.setHomeNumber(inputStringWithScanner(View.HOME_NUMBER_INPUT, InputConstants.HOME_NUMBER_INPUT));
        model.setMobileNumber(inputStringWithScanner(View.MOBILE_NUMBER_INPUT, InputConstants.MOBILE_NUMBER_INPUT));
        model.setMobileNumber2(inputSecondMobileNumber(View.MOBILE_NUMBER_2_INPUT, InputConstants.MOBILE_NUMBER_INPUT));
        model.setEmail(inputStringWithScanner(View.EMAIL_INPUT, InputConstants.EMAIL_INPUT));
        model.setSkype(inputStringWithScanner(View.SKYPE_INPUT, InputConstants.SKYPE_INPUT));
        model.setSaveDate(LocalDateTime.now());
        model.setAddress(inputAddress());
        return model;
    }


    /**Input string from console.
     * Asks to repeat input if the prev input was wrong
     * @param message -string that will be printed on every step
     * @param regex - the input string will be checked with regexp
     * @return String to be put in model object
     */
    private String inputStringWithScanner(String message, String regex) {
        view.print(message);
        String res;
        while (!(sc.hasNext() && (res = sc.next()).matches(regex))) {
            view.wrongInput(message);
        }
        return res;
    }


    /**Input integer number from console
     * Asks to repeat input if the prev input was wrong
     * @param message - string that will be printed on every step
     * @param maxNumberCount - max number that can be inputted
     * @return int to be put in Model
     */
    private int inputIntegerWithScanner(String message, int maxNumberCount){
        view.print(message);
        int res = -1;
        while(res == -1) {
            try {
                sc.nextLine();
                res = sc.nextInt();
                if (isBetweenZeroAndMax(res, maxNumberCount)) return res;
                view.wrongInput(message);
            } catch (Exception e) {
                view.wrongInput(message);
            }
        }
        return res;
    }


    /**Check integer for matching conditions of being
     * less than number of maxNumberCount digits
     * and more then 0
     * @param numberToCompare - number to compare
     * @param maxNumberCount - number of digits in maxValue
     * @return true if number matches conditions
     */
    private boolean isBetweenZeroAndMax(int numberToCompare, int maxNumberCount) {
        return 0 < numberToCompare && numberToCompare <= Math.pow(10, maxNumberCount) - 1;
    }

    /** Special method for input second mobile number
     * @param message - string that will be printed on every step
     * @param regex - the input string will be checked with regexp
     * @return String of second mobile number or empty string
     */
    private String inputSecondMobileNumber(String message, String regex) {
        view.print(message);
        String res = sc.next();
        while (true) {
            if (res.equalsIgnoreCase(".")) return "";
            else if (res.matches(regex)) return res;
            view.wrongInput(message);
            res = sc.next();
        }
    }


    /**Method that get user's input and returns a Group representation of input string
     * @param message - string that will be printed on every step
     * @return Group value to be set in model
     */
    private Group inputGroupName(String message) {
        view.print(message);
        String res = sc.next();
        while (!(res.equalsIgnoreCase("family") || res.equalsIgnoreCase("friends") || res.equalsIgnoreCase("work"))) {
            view.wrongInput(message);
            res = sc.next();
        }
        return Group.valueOf(res.toUpperCase());
    }

    /**Method to create Address instance
     * @return Address instance to be saved in Model
     */
    private Address inputAddress(){
        Address address = new Address();
        address.setCity(inputStringWithScanner(View.CITY_INPUT, InputConstants.CITY_INPUT));
        address.setIndex(inputIntegerWithScanner(View.INDEX_INPUT, 5));
        address.setStreet(inputStringWithScanner(View.STREET_INPUT, InputConstants.STREET_INPUT));
        address.setHouse_Number(inputIntegerWithScanner(View.HOUSE_NUMBER_INPUT, 3));
        address.setFlatNumber(inputIntegerWithScanner(View.FLAT_NUMBER_INPUT, 2));
        return address;
    }

    public Scanner getModel() {
        return sc;
    }

    public void setModel(Scanner sc) {
        this.sc = sc;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

}
