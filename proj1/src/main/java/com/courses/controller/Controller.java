package com.courses.controller;

import com.courses.model.util.ApplianceUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    private static ApplianceUtil applianceUtil = ApplianceUtil.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("appliances", applianceUtil.getAppliances());
        req.getRequestDispatcher("/view.jsp").forward(req, resp);
    }

}
