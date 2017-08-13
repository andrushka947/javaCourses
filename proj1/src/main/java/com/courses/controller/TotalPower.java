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
        req.setAttribute("totalPower", applianceUtil.getTotalPower());
        req.setAttribute("appliances", applianceUtil.getPluggedInAppliances());
        req.getRequestDispatcher("totalPower.jsp").forward(req, resp);
    }

}
