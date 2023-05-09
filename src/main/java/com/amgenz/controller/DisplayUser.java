package com.amgenz.controller;

import com.amgenz.entity.User;
import com.amgenz.persistence.GenericDao;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * A simple servlet to display all recipes.
 * @author amgenz
 */

@WebServlet(
        urlPatterns = {"/userDetails"}
)

public class DisplayUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao userDao = new GenericDao(User.class);
        int userId;

        if (req.getParameter("submit").equals("userDetails")) {
            userId = Integer.parseInt(req.getParameter("userId"));
            User userToDisplay = (User) userDao.getById(userId);

            req.setAttribute("userToDisplay", userToDisplay);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/userProfile.jsp");
        dispatcher.forward(req, resp);
    }
}
