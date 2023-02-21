package com.amgenz.persistence;

import com.amgenz.entity.RecipeIngredient;
import com.amgenz.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type recipe ingredient dao test.
 */
class RecipeIngredientDaoTest {
    GenericDao dao;

    /**
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new GenericDao(RecipeIngredient.class);
    }

    /**
     * Verifies gets all recipe's ingredients success.
     */
    @Test
    void getAllRecipesSuccess() {
        List<RecipeIngredient> recipes = dao.getAll();
        assertEquals(3, recipes.size());
    }

    /**
     * Verifies a recipe ingredient is returned correctly based on id search.
     */
    @Test
    void getByIdSuccess() {
        RecipeIngredient retrievedRecipe = (RecipeIngredient) dao.getById(1);
        assertNotNull(retrievedRecipe);
        assertEquals("Homemade Chicken Alfredo", retrievedRecipe.getRecipeName());
    }
    /**
     * Verify successful insert of a recipe ingredient
     */
    @Test
    void insertSuccess() {

        RecipeIngredient newRecipe = new RecipeIngredient();
        int id = dao.insert(newRecipe);
        assertNotEquals(0,id);
        RecipeIngredient insertedRecipe = (RecipeIngredient) dao.getById(id);
        assertEquals(newRecipe, insertedRecipe);
    }

    /**
     * Verify successful delete of recipe ingredient
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));
    }

    /**
     * Update a recipe ingredient
     */
    @Test
    void updateSuccess() {
        int newServing = 4;
        RecipeIngredient updateRecipe = (RecipeIngredient) dao.getById(1);
        updateRecipe.setServing(newServing);
        dao.saveOrUpdate(updateRecipe);
        RecipeIngredient retrievedRecipe = (RecipeIngredient) dao.getById(1);
        assertEquals(updateRecipe, retrievedRecipe);
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<RecipeIngredient> recipes = dao.getByPropertyEqual("type", "Breakfast");
        assertEquals(1, recipes.size());
        assertEquals(3, recipes.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<RecipeIngredient> recipes = dao.getByPropertyLike("recipeName", "h");
        assertEquals(2, recipes.size());
    }
}