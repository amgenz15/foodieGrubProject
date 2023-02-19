package com.amgenz.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Recipe quick facts.
 */
@Entity(name = "RecipeQuickFacts")
@Table(name = "recipe_quick_facts")
public class RecipeQuickFacts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @ManyToOne
    private Recipe recipe;

    private int calories;

    private int protein;

    private int fat;

    private int carbohydrates;

    private int servings;

    @Column(name = "total_time_min")
    private int totalTimeInMin;

    @Column(name = "recipe_type")
    private String recipeType;

    /**
     * Instantiates a new Recipe quick facts.
     */
    public RecipeQuickFacts() {
    }

    /**
     * Instantiates a new Recipe quick facts.
     *
     * @param recipe         the recipe
     * @param calories       the calories
     * @param protein        the protein
     * @param fat            the fat
     * @param carbohydrates  the carbohydrates
     * @param servings       the servings
     * @param totalTimeInMin the total time in min
     * @param recipeType     the recipe type
     */
    public RecipeQuickFacts(Recipe recipe, int calories, int protein, int fat, int carbohydrates, int servings,
                            int totalTimeInMin, String recipeType) {
        this.recipe = recipe;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.servings = servings;
        this.totalTimeInMin = totalTimeInMin;
        this.recipeType = recipeType;
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
     * Gets recipe.
     *
     * @return the recipe
     */
    public Recipe getRecipe() {
        return recipe;
    }

    /**
     * Sets recipe.
     *
     * @param recipe the recipe
     */
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
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
     * Gets servings.
     *
     * @return the servings
     */
    public int getServings() {
        return servings;
    }

    /**
     * Sets servings.
     *
     * @param servings the servings
     */
    public void setServings(int servings) {
        this.servings = servings;
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
     * Gets recipe type.
     *
     * @return the recipe type
     */
    public String getRecipeType() {
        return recipeType;
    }

    /**
     * Sets recipe type.
     *
     * @param recipeType the recipe type
     */
    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }

    @Override
    public String toString() {
        return "RecipeQuickFacts{" +
                "id=" + id +
                ", recipe=" + recipe +
                ", calories=" + calories +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbohydrates=" + carbohydrates +
                ", servings=" + servings +
                ", totalTimeInMin=" + totalTimeInMin +
                ", recipeType='" + recipeType + '\'' +
                '}';
    }
}
