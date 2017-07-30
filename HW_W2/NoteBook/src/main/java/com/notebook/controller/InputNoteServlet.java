package com.notebook.controller;

import com.notebook.model.Address;
import com.notebook.model.Group;
import com.notebook.model.entity.Note;
import com.notebook.view.View;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *  Additional Servlet that allow u to creates a note object, fill it with input data and return
 */
@WebServlet("/addNote")
public class InputNoteServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("inputNoteForm.jsp").forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Note note = new Note();
        Address address = new Address();
        note.setAddress(address);
        req.setAttribute("note", note);
        if (!checkInputNote(req, note)) {
            req.getRequestDispatcher("inputNoteForm.jsp").forward(req, resp);
            return;
        }
        System.out.println(note);
        req.getRequestDispatcher("view.jsp").forward(req, resp);
    }


    public boolean checkInputNote(HttpServletRequest req, Note note) {
        boolean res = true;

        if (req.getParameter("name").matches(InputConstants.NAME_INPUT)) note.setName(req.getParameter("name"));
        else {
            res = false;
            req.setAttribute("wrongName", View.WRONG_INPUT + View.NAME_INPUT);
        }

        if (req.getParameter("surname").matches(InputConstants.SURNAME_INPUT)) note.setSurname(req.getParameter("surname"));
        else {
            res = false;
            req.setAttribute("wrongSurname", View.WRONG_INPUT + View.SURNAME_INPUT);
        }

        if (req.getParameter("secondName").matches(InputConstants.SECOND_NAME_INPUT)) note.setSecondName(req.getParameter("secondName"));
        else {
            res = false;
            req.setAttribute("wrongSecondName", View.WRONG_INPUT + View.SECOND_NAME_INPUT);
        }

        if (req.getParameter("nickName").matches(InputConstants.NICK_NAME_INPUT)) note.setNickName(req.getParameter("nickName"));
        else {
            res = false;
            req.setAttribute("wrongNickname", View.WRONG_INPUT + View.NICK_NAME_INPUT);
        }

        String group = req.getParameter("group");
        if (group.equals("Work") || group.equals("Family") || group.equals("Friends") ) note.setGroup(Group.valueOf(req.getParameter("group").toUpperCase()));
        else {
            System.out.println(req.getParameter("group"));
            res = false;
            req.setAttribute("wrongGroup", View.WRONG_INPUT + View.GROUP_INPUT);
        }

        if (req.getParameter("homeNumber").matches(InputConstants.HOME_NUMBER_INPUT)) note.setHomeNumber(req.getParameter("homeNumber"));
        else {
            res = false;
            req.setAttribute("wrongHomeNumber", View.WRONG_INPUT + View.HOME_NUMBER_INPUT);
        }

        if (req.getParameter("mobileNumber").matches(InputConstants.MOBILE_NUMBER_INPUT)) note.setMobileNumber(req.getParameter("mobileNumber"));
        else {
            res = false;
            req.setAttribute("wrongHomeNumber", View.WRONG_INPUT + View.MOBILE_NUMBER_INPUT);
        }
        String mobileNumber2 = req.getParameter("mobileNumber2");
        if (mobileNumber2.matches(InputConstants.MOBILE_NUMBER_INPUT) || mobileNumber2.length() == 0) note.setMobileNumber2(req.getParameter("mobileNumber2"));
        else {
            res = false;
            req.setAttribute("wrongMobileNumber2", View.WRONG_INPUT + View.MOBILE_NUMBER_2_INPUT);
        }

        if (req.getParameter("email").matches(InputConstants.EMAIL_INPUT)) note.setEmail(req.getParameter("email"));
        else {
            res = false;
            req.setAttribute("wrongEmail", View.WRONG_INPUT + View.EMAIL_INPUT);
        }

        if (req.getParameter("skype").matches(InputConstants.SKYPE_INPUT)) note.setSkype(req.getParameter("skype"));
        else {
            res = false;
            req.setAttribute("wrongSkype", View.WRONG_INPUT + View.SKYPE_INPUT);
        }
        checkAddress(req, note.getAddress());

        return res ;
    }

    private boolean checkAddress(HttpServletRequest req, Address address) {
        boolean res = true;
        if (req.getParameter("index").matches(InputConstants.INDEX_INPUT)) address.setIndex(Integer.parseInt(req.getParameter("index")));
        else {
            res = false;
            req.setAttribute("wrongIndex", View.WRONG_INPUT + View.INDEX_INPUT);
        }

        if (req.getParameter("city").matches(InputConstants.CITY_INPUT)) address.setCity(req.getParameter("city"));
        else {
            res = false;
            req.setAttribute("wrongCity", View.WRONG_INPUT + View.CITY_INPUT);
        }

        if (req.getParameter("street").matches(InputConstants.STREET_INPUT)) address.setStreet(req.getParameter("street"));
        else {
            res = false;
            req.setAttribute("wrongStreet", View.WRONG_INPUT + View.STREET_INPUT);
        }

        if (req.getParameter("houseNumber").matches(InputConstants.HOUSE_NUMBER_INPUT)) address.setHouseNumber(Integer.parseInt(req.getParameter("houseNumber")));
        else {
            res = false;
            req.setAttribute("wrongHouseNumber", View.WRONG_INPUT + View.HOUSE_NUMBER_INPUT);
        }

        if (req.getParameter("flatNumber").matches(InputConstants.FLAT_NUMBER_INPUT)) address.setFlatNumber(Integer.parseInt(req.getParameter("flatNumber")));
        else {
            res = false;
            req.setAttribute("wrongFlatNumber", View.WRONG_INPUT + View.FLAT_NUMBER_INPUT);
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


}
