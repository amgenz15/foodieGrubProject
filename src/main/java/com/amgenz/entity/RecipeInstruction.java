package com.amgenz.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Recipe instructions.
 */
@Entity(name = "RecipeInstruction")
@Table(name = "recipe_instruction")
public class RecipeInstruction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @ManyToOne
    private Recipe recipe;

    @Column(name = "instruction_1")
    private String instruction1;




}
