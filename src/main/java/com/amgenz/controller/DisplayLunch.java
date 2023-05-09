package com.amgenz.controller;

import com.amgenz.entity.Recipe;
import com.amgenz.persistence.GenericDao;

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
        urlPatterns = {"/displayLunch"}
)

public class DisplayLunch extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao recipeDao = new GenericDao(Recipe.class);
        req.setAttribute("recipes", recipeDao.getByPropertyEqual("type", "Lunch"));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/lunchRecipes.jsp");
        dispatcher.forward(req, resp);
    }
}