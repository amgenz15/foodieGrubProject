package com.amgenz.controller;

import com.amgenz.entity.RecipeIngredient;
import com.amgenz.entity.RecipeInstruction;
import com.amgenz.persistence.GenericDao;
import com.amgenz.entity.Recipe;
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
        urlPatterns = {"/recipeDetails"}
)

public class DisplayDetails extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao recipeDao = new GenericDao(Recipe.class);
        int recipeId;

        if (req.getParameter("submit").equals("recipeDetails")) {
            recipeId = Integer.parseInt(req.getParameter("recipeId"));
            Recipe recipeToDisplay = (Recipe) recipeDao.getById(recipeId);

            req.setAttribute("recipeToDisplay", recipeToDisplay);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/recipeDetails.jsp");
        dispatcher.forward(req, resp);
    }
}