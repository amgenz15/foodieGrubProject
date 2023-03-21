package com.amgenz.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

/**
 * The type Recipe ingredients.
 */
@Entity(name = "RecipeIngredient")
@Table(name = "recipe_ingredient")
public class RecipeIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @ManyToOne
    private Recipe recipe;

    @Column(name = "ingredient")
    private String ingredient;

    @Column(name = "ingredient_amount")
    private String ingredientAmount;

    @Column(name = "ingredient_amount_measurement")
    private String ingredientAmountMeasurement;

    /**
     * Instantiates a new Recipe ingredient.
     */
    public RecipeIngredient() {
    }

    /**
     * Instantiates a new Recipe ingredient.
     *
     * @param recipe                      the recipe
     * @param ingredient                  the ingredient
     * @param ingredientAmount            the ingredient amount
     * @param ingredientAmountMeasurement the ingredient amount measurement
     */
    public RecipeIngredient(Recipe recipe, String ingredient, String ingredientAmount, String ingredientAmountMeasurement) {
        this.recipe = recipe;
        this.ingredient = ingredient;
        this.ingredientAmount = ingredientAmount;
        this.ingredientAmountMeasurement = ingredientAmountMeasurement;
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
     * Gets ingredient.
     *
     * @return the ingredient
     */
    public String getIngredient() {
        return ingredient;
    }

    /**
     * Sets ingredient.
     *
     * @param ingredient the ingredient
     */
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    /**
     * Gets ingredient amount.
     *
     * @return the ingredient amount
     */
    public String getIngredientAmount() {
        return ingredientAmount;
    }

    /**
     * Sets ingredient amount.
     *
     * @param ingredientAmount the ingredient amount
     */
    public void setIngredientAmount(String ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    /**
     * Gets ingredient amount measurement.
     *
     * @return the ingredient amount measurement
     */
    public String getIngredientAmountMeasurement() {
        return ingredientAmountMeasurement;
    }

    /**
     * Sets ingredient amount measurement.
     *
     * @param ingredientAmountMeasurement the ingredient amount measurement
     */
    public void setIngredientAmountMeasurement(String ingredientAmountMeasurement) {
        this.ingredientAmountMeasurement = ingredientAmountMeasurement;
    }

    @Override
    public String toString() {
        return "RecipeIngredient{" +
                "id=" + id +
                ", recipe=" + recipe +
                ", ingredient='" + ingredient + '\'' +
                ", ingredientAmount=" + ingredientAmount +
                ", ingredientAmountMeasurement='" + ingredientAmountMeasurement + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredient that = (RecipeIngredient) o;
        return id == that.id && ingredientAmount == that.ingredientAmount && Objects.equals(recipe, that.recipe) && Objects.equals(ingredient, that.ingredient) && Objects.equals(ingredientAmountMeasurement, that.ingredientAmountMeasurement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recipe, ingredient, ingredientAmount, ingredientAmountMeasurement);
    }
}
