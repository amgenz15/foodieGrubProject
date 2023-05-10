package com.amgenz.controller;

import com.amgenz.persistence.GenericDao;
import com.amgenz.entity.Recipe;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A simple servlet to search for recipies.
 * @author amgenz
 */

@WebServlet(
        urlPatterns = {"/searchRecipe"}
)

public class SearchRecipe extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.error("In the doGet to search recipes.");
        GenericDao dao = new GenericDao(Recipe.class);
        if (req.getParameter("submit").equals("search")) {
            logger.error("In the if statement where search button was pushed.");
            req.setAttribute("recipes", dao.getByPropertyLike("recipeName", req.getParameter("searchRecipeName")));
            logger.error("Here is the found recipe:");

        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}
