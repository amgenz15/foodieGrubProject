package com.amgenz.controller;

import com.amgenz.entity.RecipeIngredient;
import com.amgenz.entity.RecipeInstruction;
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
 * A simple servlet to display recipe details.
 * @author amgenz
 */

@WebServlet(
        urlPatterns = {"/recipeDetails"}
)

public class RecipeDetails extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("In the doGet to display recipe details.");
        GenericDao recipeDao = new GenericDao(Recipe.class);

        if (req.getParameter("submit").equals("recipeDetails")) {
            logger.info("In the if statement where recipe details button was pushed.");
            int recipeId = Integer.parseInt(req.getParameter("recipeId"));
            req.setAttribute("recipe", recipeDao.getById(recipeId));
            logger.info("Recipe details have been grabbed from the database.");
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/recipeDetails.jsp");
        dispatcher.forward(req, resp);
    }
}