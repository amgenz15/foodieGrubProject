package com.amgenz.persistence;


import com.amgenz.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {
    UserDao dao;

    /**
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {

        com.amgenz.util.Database database = com.amgenz.util.Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new UserDao();
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
        User retrieveUser = dao.getById(5);
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
        User insertedUser = dao.getById(id);
        assertEquals("Steve", insertedUser.getFirstName());
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
        User updateUser = dao.getById(1);
        updateUser.setUserName("halouis");
        dao.saveOrUpdate(updateUser);
        assertEquals("halouis", updateUser.getUserName());
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
        assertEquals(3, users.size());
    }
}