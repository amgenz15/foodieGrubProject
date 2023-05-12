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
 * A simple servlet to delete a recipe.
 * @author amgenz
 */

@WebServlet(
        urlPatterns = {"/deleteRecipe"}
)

public class DeleteRecipe extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.error("In the doGet to delete a recipe.");
        GenericDao recipeDao = new GenericDao(Recipe.class);

        if (req.getParameter("submit").equals("deleteRecipe")) {
            logger.error("In the if statement where recipe details button was pushed.");
            int recipeId = Integer.parseInt(req.getParameter("recipeId"));
            Recipe recipe = (Recipe) recipeDao.getById(recipeId);
            recipeDao.delete(recipe);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/confirmationDelete.jsp");
            dispatcher.forward(req, resp);

        }

    }
}
