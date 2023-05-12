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
 * A simple servlet to display all recipes.
 * @author amgenz
 */

@WebServlet(
        urlPatterns = {"/displayRecipes"}
)

public class DisplayAllRecipes extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("In the doGet to display all recipes.");
        GenericDao recipeDao = new GenericDao(Recipe.class);
        req.setAttribute("recipes", recipeDao.getAll());
        logger.info("All recipes have been grabbed from the database.");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/browseAll.jsp");
        dispatcher.forward(req, resp);
    }
}