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
        urlPatterns = {"/editUser"}
)

public class EditUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao userDao = new GenericDao(User.class);
        int userId;

        if (req.getParameter("submit").equals("editUser")) {
            userId = Integer.parseInt(req.getParameter("userId"));
            User user = (User) userDao.getById(userId);

            req.setAttribute("firstname", user);
            req.setAttribute("lastName", user);
            req.setAttribute("fullName", user);
            req.setAttribute("email", user);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/editUser.jsp");
        dispatcher.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao userDao = new GenericDao(User.class);

        int id = Integer.parseInt(req.getParameter("recipeId"));
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");

        User userToUpdate = (User) userDao.getById(id);

        userToUpdate.setFirstName(firstName);
        userToUpdate.setLastName(lastName);
        userToUpdate.setFullName(fullName);
        userToUpdate.setEmail(email);

        userDao.saveOrUpdate(userToUpdate);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/editConfirmation.jsp");
        dispatcher.forward(req, resp);
    }
}