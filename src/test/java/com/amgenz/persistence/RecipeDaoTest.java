package com.amgenz.persistence;

import com.amgenz.entity.Recipe;
import com.amgenz.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type recipe dao test.
 */
class RecipeDaoTest {
    GenericDao dao;

    /**
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new GenericDao(Recipe.class);
    }

    /**
     * Verifies gets all recipe's success.
     */
    @Test
    void getAllRecipesSuccess() {
        List<Recipe> recipes = dao.getAll();
        assertEquals(3, recipes.size());
    }

    /**
     * Verifies a recipe is returned correctly based on id search.
     */
    @Test
    void getByIdSuccess() {
        Recipe retrievedRecipe = (Recipe) dao.getById(1);
        assertNotNull(retrievedRecipe);
        assertEquals("Homemade Chicken Alfredo", retrievedRecipe.getRecipeName());
    }
    /**
     * Verify successful insert of a recipe
     */
    @Test
    void insertSuccess() {

        Recipe newRecipe = new Recipe("Garlic Butter Baked Salmon", null, 448, 37,
                13, 28, 30, "Dinner", 4);
        int id = dao.insert(newRecipe);
        assertNotEquals(0,id);
        Recipe insertedRecipe = (Recipe) dao.getById(id);
        assertEquals(newRecipe, insertedRecipe);
    }

    /**
     * Verify successful delete of recipe
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));
    }

    @Test
    void updateSuccess() {
        int newServing = 4;
        Recipe updateRecipe = (Recipe) dao.getById(1);
        updateRecipe.setServing(newServing);
        dao.saveOrUpdate(updateRecipe);
        Recipe retrievedRecipe = (Recipe) dao.getById(1);
        assertEquals(updateRecipe, retrievedRecipe);
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Recipe> recipes = dao.getByPropertyEqual("type", "Breakfast");
        assertEquals(1, recipes.size());
        assertEquals(3, recipes.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Recipe> recipes = dao.getByPropertyLike("recipeName", "h");
        assertEquals(2, recipes.size());
    }
}