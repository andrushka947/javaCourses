package com.courses.controller;

import com.courses.model.util.ApplianceUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sublist")
public class ApplianceSubList extends HttpServlet {

    private ApplianceUtil applianceUtil = ApplianceUtil.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int from = Integer.parseInt(req.getParameter("powerFrom"));
        int to = Integer.parseInt(req.getParameter("powerTo"));
        if (from > to) {
            req.setAttribute("wrongValues", "The \'from\' value cant be bigger than \'to\'");

            req.setAttribute("appliances", applianceUtil.getAppliances());
            req.getRequestDispatcher("view.jsp").forward(req, resp);
        }

        req.setAttribute("condition", "Appliances with power from: " + from + ", to : " + to);
        req.setAttribute("appliances", applianceUtil.getAppliancesBetweenMaxAndMinPower(from, to));
        req.getRequestDispatcher("sublist.jsp").forward(req, resp);
    }
}
