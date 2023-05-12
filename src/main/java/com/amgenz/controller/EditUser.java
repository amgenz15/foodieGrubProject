package com.amgenz.controller;

import com.amgenz.entity.User;
import com.amgenz.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * A simple servlet to edit a user.
 * @author amgenz
 */

@WebServlet(
        urlPatterns = {"/editUser"}
)

public class EditUser extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao userDao = new GenericDao(User.class);
        int userId;

        if (req.getParameter("submit").equals("editUser")) {
            userId = Integer.parseInt(req.getParameter("userId"));
            User user = (User) userDao.getById(userId);
            req.setAttribute("userId", user.getId());
            req.setAttribute("firstname", user.getFirstName());
            req.setAttribute("lastName", user.getLastName());
            req.setAttribute("fullName", user.getFullName());
            req.setAttribute("email", user.getEmail());
        }
        logger.info("Grabbed all of the user attributes to automatically display in edit form.");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/editUser.jsp");
        dispatcher.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao userDao = new GenericDao(User.class);

        int id = Integer.parseInt(req.getParameter("userId"));
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
        logger.info("User had been updated in the database.");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/editConfirmation.jsp");
        dispatcher.forward(req, resp);
    }
}