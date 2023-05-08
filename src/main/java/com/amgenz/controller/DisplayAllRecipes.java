package com.amgenz.controller;

import com.amgenz.persistence.GenericDao;
import com.amgenz.entity.Recipe;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A simple servlet to display all recipes.
 * @author amgenz
 */

@WebServlet(
        urlPatterns = {"/displayRecipe"}
)

public class DisplayAllRecipes extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao recipeDao = new GenericDao(Recipe.class);
        req.setAttribute("recipes", recipeDao.getAll());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/browseAll.jsp");
        dispatcher.forward(req, resp);
    }
}