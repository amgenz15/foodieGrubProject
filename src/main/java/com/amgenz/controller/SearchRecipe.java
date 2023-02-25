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
 * A simple servlet to search for recipies.
 * @author amgenz
 */

@WebServlet(
        urlPatterns = {"/searchRecipe"}
)

public class SearchRecipe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao dao = new GenericDao(Recipe.class);
        if (req.getParameter("submit").equals("search")) {
            req.setAttribute("recipes", dao.getByPropertyLike("RecipeName", req.getParameter("searchRecipeName")));
        } else {
            req.setAttribute("recipes", dao.getAll());
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}
