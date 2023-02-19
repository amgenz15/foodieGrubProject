package com.amgenz.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Recipe ingredients.
 */
@Entity(name = "RecipeInstructions")
@Table(name = "recipe_instructions")
public class RecipeIngredients {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @ManyToOne
    private Recipe recipe;

    @Column(name = "ingredient_1")
    private String ingredient1;

    @Column(name = "ingredient_2")
    private String ingredient2;

    @Column(name = "ingredient_3")
    private String ingredient3;

    @Column(name = "ingredient_4")
    private String ingredient4;

    @Column(name = "ingredient_5")
    private String ingredient5;

    @Column(name = "ingredient_6")
    private String ingredient6;

    @Column(name = "ingredient_7")
    private String ingredient7;

    @Column(name = "ingredient_8")
    private String ingredient8;

    @Column(name = "ingredient_9")
    private String ingredient9;

    @Column(name = "ingredient_10")
    private String ingredient10;

    @Column(name = "ingredient_11")
    private String ingredient11;

    @Column(name = "ingredient_12")
    private String ingredient12;

    @Column(name = "ingredient_13")
    private String ingredient13;

    @Column(name = "ingredient_14")
    private String ingredient14;

    @Column(name = "ingredient_15")
    private String ingredient15;

    @Column(name = "ingredient_16")
    private String ingredient16;

    @Column(name = "ingredient_17")
    private String ingredient17;

    @Column(name = "ingredient_18")
    private String ingredient18;

    @Column(name = "ingredient_19")
    private String ingredient19;

    @Column(name = "ingredient_20")
    private String ingredient20;

    @Column(name = "ingredient_21")
    private String ingredient21;

    @Column(name = "ingredient_22")
    private String ingredient22;

    @Column(name = "ingredient_23")
    private String ingredient23;

    @Column(name = "ingredient_24")
    private String ingredient24;

    @Column(name = "ingredient_25")
    private String ingredient25;

    /**
     * Instantiates a new Recipe ingredients.
     */
    public RecipeIngredients() {
    }

    /**
     * Instantiates a new Recipe ingredients.
     *
     * @param recipe       the recipe
     * @param ingredient1  the ingredient 1
     * @param ingredient2  the ingredient 2
     * @param ingredient3  the ingredient 3
     * @param ingredient4  the ingredient 4
     * @param ingredient5  the ingredient 5
     * @param ingredient6  the ingredient 6
     * @param ingredient7  the ingredient 7
     * @param ingredient8  the ingredient 8
     * @param ingredient9  the ingredient 9
     * @param ingredient10 the ingredient 10
     * @param ingredient11 the ingredient 11
     * @param ingredient12 the ingredient 12
     * @param ingredient13 the ingredient 13
     * @param ingredient14 the ingredient 14
     * @param ingredient15 the ingredient 15
     * @param ingredient16 the ingredient 16
     * @param ingredient17 the ingredient 17
     * @param ingredient18 the ingredient 18
     * @param ingredient19 the ingredient 19
     * @param ingredient20 the ingredient 20
     * @param ingredient21 the ingredient 21
     * @param ingredient22 the ingredient 22
     * @param ingredient23 the ingredient 23
     * @param ingredient24 the ingredient 24
     * @param ingredient25 the ingredient 25
     */
    public RecipeIngredients(Recipe recipe, String ingredient1, String ingredient2, String ingredient3,
                             String ingredient4, String ingredient5, String ingredient6, String ingredient7,
                             String ingredient8, String ingredient9, String ingredient10, String ingredient11,
                             String ingredient12, String ingredient13, String ingredient14, String ingredient15,
                             String ingredient16, String ingredient17, String ingredient18, String ingredient19,
                             String ingredient20, String ingredient21, String ingredient22, String ingredient23,
                             String ingredient24, String ingredient25) {
        this.recipe = recipe;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
        this.ingredient4 = ingredient4;
        this.ingredient5 = ingredient5;
        this.ingredient6 = ingredient6;
        this.ingredient7 = ingredient7;
        this.ingredient8 = ingredient8;
        this.ingredient9 = ingredient9;
        this.ingredient10 = ingredient10;
        this.ingredient11 = ingredient11;
        this.ingredient12 = ingredient12;
        this.ingredient13 = ingredient13;
        this.ingredient14 = ingredient14;
        this.ingredient15 = ingredient15;
        this.ingredient16 = ingredient16;
        this.ingredient17 = ingredient17;
        this.ingredient18 = ingredient18;
        this.ingredient19 = ingredient19;
        this.ingredient20 = ingredient20;
        this.ingredient21 = ingredient21;
        this.ingredient22 = ingredient22;
        this.ingredient23 = ingredient23;
        this.ingredient24 = ingredient24;
        this.ingredient25 = ingredient25;
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
     * Gets ingredient 1.
     *
     * @return the ingredient 1
     */
    public String getIngredient1() {
        return ingredient1;
    }

    /**
     * Sets ingredient 1.
     *
     * @param ingredient1 the ingredient 1
     */
    public void setIngredient1(String ingredient1) {
        this.ingredient1 = ingredient1;
    }

    /**
     * Gets ingredient 2.
     *
     * @return the ingredient 2
     */
    public String getIngredient2() {
        return ingredient2;
    }

    /**
     * Sets ingredient 2.
     *
     * @param ingredient2 the ingredient 2
     */
    public void setIngredient2(String ingredient2) {
        this.ingredient2 = ingredient2;
    }

    /**
     * Gets ingredient 3.
     *
     * @return the ingredient 3
     */
    public String getIngredient3() {
        return ingredient3;
    }

    /**
     * Sets ingredient 3.
     *
     * @param ingredient3 the ingredient 3
     */
    public void setIngredient3(String ingredient3) {
        this.ingredient3 = ingredient3;
    }

    /**
     * Gets ingredient 4.
     *
     * @return the ingredient 4
     */
    public String getIngredient4() {
        return ingredient4;
    }

    /**
     * Sets ingredient 4.
     *
     * @param ingredient4 the ingredient 4
     */
    public void setIngredient4(String ingredient4) {
        this.ingredient4 = ingredient4;
    }

    /**
     * Gets ingredient 5.
     *
     * @return the ingredient 5
     */
    public String getIngredient5() {
        return ingredient5;
    }

    /**
     * Sets ingredient 5.
     *
     * @param ingredient5 the ingredient 5
     */
    public void setIngredient5(String ingredient5) {
        this.ingredient5 = ingredient5;
    }

    /**
     * Gets ingredient 6.
     *
     * @return the ingredient 6
     */
    public String getIngredient6() {
        return ingredient6;
    }

    /**
     * Sets ingredient 6.
     *
     * @param ingredient6 the ingredient 6
     */
    public void setIngredient6(String ingredient6) {
        this.ingredient6 = ingredient6;
    }

    /**
     * Gets ingredient 7.
     *
     * @return the ingredient 7
     */
    public String getIngredient7() {
        return ingredient7;
    }

    /**
     * Sets ingredient 7.
     *
     * @param ingredient7 the ingredient 7
     */
    public void setIngredient7(String ingredient7) {
        this.ingredient7 = ingredient7;
    }

    /**
     * Gets ingredient 8.
     *
     * @return the ingredient 8
     */
    public String getIngredient8() {
        return ingredient8;
    }

    /**
     * Sets ingredient 8.
     *
     * @param ingredient8 the ingredient 8
     */
    public void setIngredient8(String ingredient8) {
        this.ingredient8 = ingredient8;
    }

    /**
     * Gets ingredient 9.
     *
     * @return the ingredient 9
     */
    public String getIngredient9() {
        return ingredient9;
    }

    /**
     * Sets ingredient 9.
     *
     * @param ingredient9 the ingredient 9
     */
    public void setIngredient9(String ingredient9) {
        this.ingredient9 = ingredient9;
    }

    /**
     * Gets ingredient 10.
     *
     * @return the ingredient 10
     */
    public String getIngredient10() {
        return ingredient10;
    }

    /**
     * Sets ingredient 10.
     *
     * @param ingredient10 the ingredient 10
     */
    public void setIngredient10(String ingredient10) {
        this.ingredient10 = ingredient10;
    }

    /**
     * Gets ingredient 11.
     *
     * @return the ingredient 11
     */
    public String getIngredient11() {
        return ingredient11;
    }

    /**
     * Sets ingredient 11.
     *
     * @param ingredient11 the ingredient 11
     */
    public void setIngredient11(String ingredient11) {
        this.ingredient11 = ingredient11;
    }

    /**
     * Gets ingredient 12.
     *
     * @return the ingredient 12
     */
    public String getIngredient12() {
        return ingredient12;
    }

    /**
     * Sets ingredient 12.
     *
     * @param ingredient12 the ingredient 12
     */
    public void setIngredient12(String ingredient12) {
        this.ingredient12 = ingredient12;
    }

    /**
     * Gets ingredient 13.
     *
     * @return the ingredient 13
     */
    public String getIngredient13() {
        return ingredient13;
    }

    /**
     * Sets ingredient 13.
     *
     * @param ingredient13 the ingredient 13
     */
    public void setIngredient13(String ingredient13) {
        this.ingredient13 = ingredient13;
    }

    /**
     * Gets ingredient 14.
     *
     * @return the ingredient 14
     */
    public String getIngredient14() {
        return ingredient14;
    }

    /**
     * Sets ingredient 14.
     *
     * @param ingredient14 the ingredient 14
     */
    public void setIngredient14(String ingredient14) {
        this.ingredient14 = ingredient14;
    }

    /**
     * Gets ingredient 15.
     *
     * @return the ingredient 15
     */
    public String getIngredient15() {
        return ingredient15;
    }

    /**
     * Sets ingredient 15.
     *
     * @param ingredient15 the ingredient 15
     */
    public void setIngredient15(String ingredient15) {
        this.ingredient15 = ingredient15;
    }

    /**
     * Gets ingredient 16.
     *
     * @return the ingredient 16
     */
    public String getIngredient16() {
        return ingredient16;
    }

    /**
     * Sets ingredient 16.
     *
     * @param ingredient16 the ingredient 16
     */
    public void setIngredient16(String ingredient16) {
        this.ingredient16 = ingredient16;
    }

    /**
     * Gets ingredient 17.
     *
     * @return the ingredient 17
     */
    public String getIngredient17() {
        return ingredient17;
    }

    /**
     * Sets ingredient 17.
     *
     * @param ingredient17 the ingredient 17
     */
    public void setIngredient17(String ingredient17) {
        this.ingredient17 = ingredient17;
    }

    /**
     * Gets ingredient 18.
     *
     * @return the ingredient 18
     */
    public String getIngredient18() {
        return ingredient18;
    }

    /**
     * Sets ingredient 18.
     *
     * @param ingredient18 the ingredient 18
     */
    public void setIngredient18(String ingredient18) {
        this.ingredient18 = ingredient18;
    }

    /**
     * Gets ingredient 19.
     *
     * @return the ingredient 19
     */
    public String getIngredient19() {
        return ingredient19;
    }

    /**
     * Sets ingredient 19.
     *
     * @param ingredient19 the ingredient 19
     */
    public void setIngredient19(String ingredient19) {
        this.ingredient19 = ingredient19;
    }

    /**
     * Gets ingredient 20.
     *
     * @return the ingredient 20
     */
    public String getIngredient20() {
        return ingredient20;
    }

    /**
     * Sets ingredient 20.
     *
     * @param ingredient20 the ingredient 20
     */
    public void setIngredient20(String ingredient20) {
        this.ingredient20 = ingredient20;
    }

    /**
     * Gets ingredient 21.
     *
     * @return the ingredient 21
     */
    public String getIngredient21() {
        return ingredient21;
    }

    /**
     * Sets ingredient 21.
     *
     * @param ingredient21 the ingredient 21
     */
    public void setIngredient21(String ingredient21) {
        this.ingredient21 = ingredient21;
    }

    /**
     * Gets ingredient 22.
     *
     * @return the ingredient 22
     */
    public String getIngredient22() {
        return ingredient22;
    }

    /**
     * Sets ingredient 22.
     *
     * @param ingredient22 the ingredient 22
     */
    public void setIngredient22(String ingredient22) {
        this.ingredient22 = ingredient22;
    }

    /**
     * Gets ingredient 23.
     *
     * @return the ingredient 23
     */
    public String getIngredient23() {
        return ingredient23;
    }

    /**
     * Sets ingredient 23.
     *
     * @param ingredient23 the ingredient 23
     */
    public void setIngredient23(String ingredient23) {
        this.ingredient23 = ingredient23;
    }

    /**
     * Gets ingredient 24.
     *
     * @return the ingredient 24
     */
    public String getIngredient24() {
        return ingredient24;
    }

    /**
     * Sets ingredient 24.
     *
     * @param ingredient24 the ingredient 24
     */
    public void setIngredient24(String ingredient24) {
        this.ingredient24 = ingredient24;
    }

    /**
     * Gets ingredient 25.
     *
     * @return the ingredient 25
     */
    public String getIngredient25() {
        return ingredient25;
    }

    /**
     * Sets ingredient 25.
     *
     * @param ingredient25 the ingredient 25
     */
    public void setIngredient25(String ingredient25) {
        this.ingredient25 = ingredient25;
    }

    @Override
    public String toString() {
        return "RecipeIngredients{" +
                "id=" + id +
                ", recipe=" + recipe +
                ", ingredient1='" + ingredient1 + '\'' +
                ", ingredient2='" + ingredient2 + '\'' +
                ", ingredient3='" + ingredient3 + '\'' +
                ", ingredient4='" + ingredient4 + '\'' +
                ", ingredient5='" + ingredient5 + '\'' +
                ", ingredient6='" + ingredient6 + '\'' +
                ", ingredient7='" + ingredient7 + '\'' +
                ", ingredient8='" + ingredient8 + '\'' +
                ", ingredient9='" + ingredient9 + '\'' +
                ", ingredient10='" + ingredient10 + '\'' +
                ", ingredient11='" + ingredient11 + '\'' +
                ", ingredient12='" + ingredient12 + '\'' +
                ", ingredient13='" + ingredient13 + '\'' +
                ", ingredient14='" + ingredient14 + '\'' +
                ", ingredient15='" + ingredient15 + '\'' +
                ", ingredient16='" + ingredient16 + '\'' +
                ", ingredient17='" + ingredient17 + '\'' +
                ", ingredient18='" + ingredient18 + '\'' +
                ", ingredient19='" + ingredient19 + '\'' +
                ", ingredient20='" + ingredient20 + '\'' +
                ", ingredient21='" + ingredient21 + '\'' +
                ", ingredient22='" + ingredient22 + '\'' +
                ", ingredient23='" + ingredient23 + '\'' +
                ", ingredient24='" + ingredient24 + '\'' +
                ", ingredient25='" + ingredient25 + '\'' +
                '}';
    }
}
