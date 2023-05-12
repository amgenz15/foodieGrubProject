package com.amgenz.controller;

import com.amgenz.entity.Recipe;
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
 * A simple servlet to display a user profile.
 * @author amgenz
 */

@WebServlet(
        urlPatterns = {"/userDetails"}
)

public class DisplayUser extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao userDao = new GenericDao(User.class);
        GenericDao recipeDao = new GenericDao(Recipe.class);
        int userId;

        if (req.getParameter("submit").equals("userDetails")) {
            userId = Integer.parseInt(req.getParameter("userId"));
            User userToDisplay = (User) userDao.getById(userId);
            req.setAttribute("user", userToDisplay);
            req.setAttribute("userRecipes", recipeDao.getByPropertyEqualEntity("user", userToDisplay));
        }
        logger.info("The user info and their added recipes have been grabbed from the database.");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/userProfile.jsp");
        dispatcher.forward(req, resp);
    }
}
