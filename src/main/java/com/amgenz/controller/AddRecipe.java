package com.amgenz.controller;

import com.amgenz.entity.Recipe;
import com.amgenz.entity.RecipeIngredient;
import com.amgenz.entity.RecipeInstruction;
import com.amgenz.entity.User;
import com.amgenz.persistence.GenericDao;
import com.amgenz.persistence.RecipeParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * A simple servlet to display all recipes.
 * @author amgenz
 */

@WebServlet(
        urlPatterns = {"/addRecipe"}
)

public class AddRecipe extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(req.getParameter("submit").equals("addRecipe")) {
            String recipeName = req.getParameter("recipeName");
            String userName = req.getParameter("userName");
            int calories = Integer.parseInt(req.getParameter("calories"));
            int protein = Integer.parseInt(req.getParameter("protein"));
            int carbohydrates = Integer.parseInt(req.getParameter("carbohydrates"));
            int fat = Integer.parseInt(req.getParameter("fat"));
            int totalTime = Integer.parseInt(req.getParameter("totalTime"));
            String type = req.getParameter("type");
            int serving = Integer.parseInt(req.getParameter("serving"));
            String ingredientsToAdd = req.getParameter("ingredients");
            String directionsToAdd = req.getParameter("directions");

            addRecipe(recipeName, userName, calories, protein, carbohydrates, fat, totalTime, type, serving, ingredientsToAdd, directionsToAdd);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/addConfirmation.jsp");
            dispatcher.forward(req, resp);
        }

    }

    public static void addRecipe(String recipeName, String userName, int calories, int protein, int carbohydrates, int fat,
                                 int totalTime, String type, int serving, String ingredients, String directions) {
        GenericDao userDao = new GenericDao(User.class);
        GenericDao recipeDao = new GenericDao(Recipe.class);
        GenericDao ingredientDao = new GenericDao(RecipeIngredient.class);
        GenericDao directionDao = new GenericDao(RecipeInstruction.class);

        List<User>  users = userDao.getByPropertyEqual("username", userName);
        User user = users.get(0);

        Recipe newRecipe = new Recipe(recipeName, user, calories, protein, carbohydrates, fat, totalTime, type, serving);
        recipeDao.insert(newRecipe);

        RecipeIngredient newRecipeIngredient = new RecipeIngredient(newRecipe, ingredients, null, null);
        ingredientDao.insert(newRecipeIngredient);



        RecipeInstruction newRecipeInstruction = new RecipeInstruction(newRecipe, directions, 1);
        directionDao.insert(newRecipeInstruction);


    }
}