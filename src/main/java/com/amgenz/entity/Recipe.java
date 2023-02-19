package com.amgenz.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Recipe.
 */
@Entity(name = "Recipe")
@Table(name = "recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;
    @Column(name = "recipe_name")
    private String recipeName;
    @ManyToOne
    private User user;

    private int calories;

    private int protein;

    private int carbohydrates;

    private int fat;

    @Column(name = "total_time_in_min")
    private int totalTimeInMin;

    private String type;

    @OneToMany(mappedBy = "recipes", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<RecipeInstruction> instructions = new HashSet<>();

    @OneToMany(mappedBy = "recipes", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<RecipeIngredient> ingredients = new HashSet<>();

    /**
     * Instantiates a new Recipe.
     */
    public Recipe() {
    }

    /**
     * Instantiates a new Recipe.
     *
     * @param recipeName     the recipe name
     * @param user           the user
     * @param calories       the calories
     * @param protein        the protein
     * @param carbohydrates  the carbohydrates
     * @param fat            the fat
     * @param totalTimeInMin the total time in min
     * @param type           the type
     */
    public Recipe(String recipeName, User user, int calories, int protein, int carbohydrates, int fat,
                  int totalTimeInMin, String type) {
        this.recipeName = recipeName;
        this.user = user;
        this.calories = calories;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.totalTimeInMin = totalTimeInMin;
        this.type = type;
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
     * Gets recipe name.
     *
     * @return the recipe name
     */
    public String getRecipeName() {
        return recipeName;
    }

    /**
     * Sets recipe name.
     *
     * @param recipeName the recipe name
     */
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets calories.
     *
     * @return the calories
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Sets calories.
     *
     * @param calories the calories
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * Gets protein.
     *
     * @return the protein
     */
    public int getProtein() {
        return protein;
    }

    /**
     * Sets protein.
     *
     * @param protein the protein
     */
    public void setProtein(int protein) {
        this.protein = protein;
    }

    /**
     * Gets carbohydrates.
     *
     * @return the carbohydrates
     */
    public int getCarbohydrates() {
        return carbohydrates;
    }

    /**
     * Sets carbohydrates.
     *
     * @param carbohydrates the carbohydrates
     */
    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    /**
     * Gets fat.
     *
     * @return the fat
     */
    public int getFat() {
        return fat;
    }

    /**
     * Sets fat.
     *
     * @param fat the fat
     */
    public void setFat(int fat) {
        this.fat = fat;
    }

    /**
     * Gets total time in min.
     *
     * @return the total time in min
     */
    public int getTotalTimeInMin() {
        return totalTimeInMin;
    }

    /**
     * Sets total time in min.
     *
     * @param totalTimeInMin the total time in min
     */
    public void setTotalTimeInMin(int totalTimeInMin) {
        this.totalTimeInMin = totalTimeInMin;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeName='" + recipeName + '\'' +
                ", user=" + user +
                ", calories=" + calories +
                ", protein=" + protein +
                ", carbohydrates=" + carbohydrates +
                ", fat=" + fat +
                ", totalTimeInMin=" + totalTimeInMin +
                ", type='" + type + '\'' +
                '}';
    }
}
