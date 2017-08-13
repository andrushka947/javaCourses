package com.courses.controller;

import com.courses.model.util.ApplianceUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/totalPower")
public class TotalPower extends HttpServlet {
    private ApplianceUtil applianceUtil = ApplianceUtil.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //doPost(req, resp);
        req.setAttribute("totalPower", applianceUtil.getTotalPower());
        req.setAttribute("appliances", applianceUtil.getPluggedInAppliances());
        req.getRequestDispatcher("totalPower.jsp").forward(req, resp);
    }

    /*@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("totalPower", applianceUtil.getTotalPower());
        System.out.println(applianceUtil.getTotalPower());

        req.setAttribute("appliances", applianceUtil.getPluggedInAppliances());
        System.out.println(applianceUtil.getPluggedInAppliances().size());

        req.getRequestDispatcher("totalPower.jsp").forward(req, resp);
    }*/
}
