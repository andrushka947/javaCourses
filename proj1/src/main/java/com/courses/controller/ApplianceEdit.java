package com.courses.controller;

import com.courses.model.util.ApplianceUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ApplianceEdit extends HttpServlet {
    private ApplianceUtil applianceUtil = ApplianceUtil.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        applianceUtil.getAppliances().get(id).changeState();

        System.out.println("id : " + id + " changed : " + applianceUtil.getAppliances().get(id).isPluggedIn());
        resp.sendRedirect("/");
    }
}
