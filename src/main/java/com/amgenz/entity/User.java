package com.amgenz.entity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The type User.
 */
@Entity (name = "Users")
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "username")
    private String username;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Recipe> recipes = new HashSet<>();


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    public User(String firstName, String lastName, String username, String fullName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.fullName = fullName;
        this.email = email;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets user username.
     *
     * @return the user username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets user username.
     *
     * @param username the user username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Gets user full name.
     *
     * @return the user full name
     */
    public String getFullName() {
        return fullName;
    }
    /**
     * Sets user full name.
     *
     * @param fullName the user username
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    /**
     * Gets user email.
     *
     * @return the user email
     */
    public String getEmail() {
        return email;
    }
    /**
     * Sets user email.
     *
     * @param email the user email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets recipes.
     *
     * @return the recipes
     */
    public Set<Recipe> getRecipe() {
        return recipes;
    }

    /**
     * Sets recipes.
     *
     * @param recipes the recipes
     */
    public void setRecipe(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    /**
     * Add recipe.
     *
     * @param recipe the order
     */
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
        recipe.setUser(this);
    }

    /**
     * Remove recipe.
     *
     * @param recipe the recipe
     */
    public void removeRecipe(Recipe recipe) {
        recipes.remove(recipe);
        recipe.setUser(null);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", recipes=" + recipes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(username, user.username) && Objects.equals(fullName, user.fullName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, username, fullName, email);
    }
}
