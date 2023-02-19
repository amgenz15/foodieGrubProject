package com.amgenz.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Recipe ingredients.
 */
@Entity(name = "RecipeInstruction")
@Table(name = "recipe_instruction")
public class RecipeIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @ManyToOne
    private Recipe recipe;

    @Column(name = "ingredient_1")
    private String ingredient1;


}
