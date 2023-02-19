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

    @Column(name = "instruction")
    private String instruction;

    @Column(name = "instruction_order")
    private int instructionOrder;
    /**
     * Instantiates a new Recipe instruction.
     */
    public RecipeInstruction() {
    }

    /**
     * Instantiates a new Recipe instruction.
     *
     * @param recipe           the recipe
     * @param instruction      the instruction
     * @param instructionOrder the instruction order
     */
    public RecipeInstruction(Recipe recipe, String instruction, int instructionOrder) {
        this.recipe = recipe;
        this.instruction = instruction;
        this.instructionOrder = instructionOrder;
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
     * Gets instruction.
     *
     * @return the instruction
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Sets instruction.
     *
     * @param instruction the instruction
     */
    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    /**
     * Gets instruction order.
     *
     * @return the instruction order
     */
    public int getInstructionOrder() {
        return instructionOrder;
    }

    /**
     * Sets instruction order.
     *
     * @param instructionOrder the instruction order
     */
    public void setInstructionOrder(int instructionOrder) {
        this.instructionOrder = instructionOrder;
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "id=" + id +
                ", recipe=" + recipe +
                ", instruction='" + instruction + '\'' +
                ", instructionOrder=" + instructionOrder +
                '}';
    }
}
