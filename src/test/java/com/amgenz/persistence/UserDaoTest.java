package com.amgenz.persistence;


import com.amgenz.entity.User;
import com.amgenz.entity.Recipe;
import com.amgenz.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {
    GenericDao dao;

    /**
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new GenericDao(User.class);
    }

    /**
     * Verifies gets all user's success.
     */
    @Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAll();
        assertEquals(10, users.size());
    }

    /**
     * Verifies a user is returned correctly based on id search.
     */
    @Test
    void getByIdSuccess() {
        User retrieveUser = (User) dao.getById(5);
        assertNotNull(retrieveUser);
        assertEquals("Ashley", retrieveUser.getFirstName());
    }
    /**
     * Verify successful insert of a user
     */
    @Test
    void insertSuccess() {

        User newUser = new User("Steve", "Flower", "stflow");
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = (User) dao.getById(id);
        assertEquals(newUser, insertedUser);
    }

    /**
     * Verify successful insert of a user with a recipe
     */
    @Test
    void insertWithRecipeSuccess() {

        User newUser = new User("Sandra", "Bullex", "sandbull");

        Recipe recipe = new Recipe("Chicken and Sausage Gumbo", newUser, 1611, 50, 57, 131, 90, "Dinner", 6);

        newUser.addRecipe(recipe);

        int id = dao.insert(newUser);

        assertNotEquals(0,id);
        User insertedUser = (User) dao.getById(id);
        assertEquals(newUser, insertedUser);
        assertEquals(1, insertedUser.getRecipe().size());

    }


    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));
    }

    @Test
    void saveOrUpdateSuccess() {
        String newEmail = "halouis";
        User updateUser = (User) dao.getById(1);
        updateUser.setEmail(newEmail);
        dao.saveOrUpdate(updateUser);
        User retrievedUser = (User) dao.getById(1);
        assertEquals(updateUser, retrievedUser);
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = dao.getByPropertyEqual("lastName", "Smith");
        assertEquals(1, users.size());
        assertEquals(10, users.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = dao.getByPropertyLike("lastName", "w");
        assertEquals(4, users.size());
    }
}