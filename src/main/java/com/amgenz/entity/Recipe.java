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
    @Column(name = "recipe_title")
    private String recipeName;
    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "recipes", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<RecipeInstruction> instructions = new HashSet<>();

    @OneToMany(mappedBy = "recipes", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<RecipeIngredient> ingredients = new HashSet<>();



}
