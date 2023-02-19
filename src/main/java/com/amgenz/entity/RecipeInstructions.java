package com.amgenz.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Recipe instructions.
 */
@Entity(name = "RecipeInstructions")
@Table(name = "recipe_instructions")
public class RecipeInstructions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @ManyToOne
    private Recipe recipe;

    @Column(name = "instruction_1")
    private String instruction1;

    @Column(name = "instruction_2")
    private String instruction2;

    @Column(name = "instruction_3")
    private String instruction3;

    @Column(name = "instruction_4")
    private String instruction4;

    @Column(name = "instruction_5")
    private String instruction5;

    @Column(name = "instruction_6")
    private String instruction6;

    @Column(name = "instruction_7")
    private String instruction7;

    @Column(name = "instruction_8")
    private String instruction8;

    @Column(name = "instruction_9")
    private String instruction9;

    @Column(name = "instruction_10")
    private String instruction10;

    @Column(name = "instruction_11")
    private String instruction11;

    @Column(name = "instruction_12")
    private String instruction12;

    @Column(name = "instruction_13")
    private String instruction13;

    @Column(name = "instruction_14")
    private String instruction14;

    @Column(name = "instruction_15")
    private String instruction15;

    @Column(name = "instruction_16")
    private String instruction16;

    @Column(name = "instruction_17")
    private String instruction17;

    @Column(name = "instruction_18")
    private String instruction18;

    @Column(name = "instruction_19")
    private String instruction19;

    @Column(name = "instruction_20")
    private String instruction20;

    /**
     * Instantiates a new Recipe instructions.
     */
    public RecipeInstructions() {
    }

    /**
     * Instantiates a new Recipe instructions.
     *
     * @param recipe        the recipe
     * @param instruction1  the instruction 1
     * @param instruction2  the instruction 2
     * @param instruction3  the instruction 3
     * @param instruction4  the instruction 4
     * @param instruction5  the instruction 5
     * @param instruction6  the instruction 6
     * @param instruction7  the instruction 7
     * @param instruction8  the instruction 8
     * @param instruction9  the instruction 9
     * @param instruction10 the instruction 10
     * @param instruction11 the instruction 11
     * @param instruction12 the instruction 12
     * @param instruction13 the instruction 13
     * @param instruction14 the instruction 14
     * @param instruction15 the instruction 15
     * @param instruction16 the instruction 16
     * @param instruction17 the instruction 17
     * @param instruction18 the instruction 18
     * @param instruction19 the instruction 19
     * @param instruction20 the instruction 20
     */
    public RecipeInstructions(Recipe recipe, String instruction1, String instruction2, String instruction3,
                              String instruction4, String instruction5, String instruction6, String instruction7,
                              String instruction8, String instruction9, String instruction10, String instruction11,
                              String instruction12, String instruction13, String instruction14, String instruction15,
                              String instruction16, String instruction17, String instruction18, String instruction19,
                              String instruction20) {
        this.recipe = recipe;
        this.instruction1 = instruction1;
        this.instruction2 = instruction2;
        this.instruction3 = instruction3;
        this.instruction4 = instruction4;
        this.instruction5 = instruction5;
        this.instruction6 = instruction6;
        this.instruction7 = instruction7;
        this.instruction8 = instruction8;
        this.instruction9 = instruction9;
        this.instruction10 = instruction10;
        this.instruction11 = instruction11;
        this.instruction12 = instruction12;
        this.instruction13 = instruction13;
        this.instruction14 = instruction14;
        this.instruction15 = instruction15;
        this.instruction16 = instruction16;
        this.instruction17 = instruction17;
        this.instruction18 = instruction18;
        this.instruction19 = instruction19;
        this.instruction20 = instruction20;
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
     * Gets instruction 1.
     *
     * @return the instruction 1
     */
    public String getInstruction1() {
        return instruction1;
    }

    /**
     * Sets instruction 1.
     *
     * @param instruction1 the instruction 1
     */
    public void setInstruction1(String instruction1) {
        this.instruction1 = instruction1;
    }

    /**
     * Gets instruction 2.
     *
     * @return the instruction 2
     */
    public String getInstruction2() {
        return instruction2;
    }

    /**
     * Sets instruction 2.
     *
     * @param instruction2 the instruction 2
     */
    public void setInstruction2(String instruction2) {
        this.instruction2 = instruction2;
    }

    /**
     * Gets instruction 3.
     *
     * @return the instruction 3
     */
    public String getInstruction3() {
        return instruction3;
    }

    /**
     * Sets instruction 3.
     *
     * @param instruction3 the instruction 3
     */
    public void setInstruction3(String instruction3) {
        this.instruction3 = instruction3;
    }

    /**
     * Gets instruction 4.
     *
     * @return the instruction 4
     */
    public String getInstruction4() {
        return instruction4;
    }

    /**
     * Sets instruction 4.
     *
     * @param instruction4 the instruction 4
     */
    public void setInstruction4(String instruction4) {
        this.instruction4 = instruction4;
    }

    /**
     * Gets instruction 5.
     *
     * @return the instruction 5
     */
    public String getInstruction5() {
        return instruction5;
    }

    /**
     * Sets instruction 5.
     *
     * @param instruction5 the instruction 5
     */
    public void setInstruction5(String instruction5) {
        this.instruction5 = instruction5;
    }

    /**
     * Gets instruction 6.
     *
     * @return the instruction 6
     */
    public String getInstruction6() {
        return instruction6;
    }

    /**
     * Sets instruction 6.
     *
     * @param instruction6 the instruction 6
     */
    public void setInstruction6(String instruction6) {
        this.instruction6 = instruction6;
    }

    /**
     * Gets instruction 7.
     *
     * @return the instruction 7
     */
    public String getInstruction7() {
        return instruction7;
    }

    /**
     * Sets instruction 7.
     *
     * @param instruction7 the instruction 7
     */
    public void setInstruction7(String instruction7) {
        this.instruction7 = instruction7;
    }

    /**
     * Gets instruction 8.
     *
     * @return the instruction 8
     */
    public String getInstruction8() {
        return instruction8;
    }

    /**
     * Sets instruction 8.
     *
     * @param instruction8 the instruction 8
     */
    public void setInstruction8(String instruction8) {
        this.instruction8 = instruction8;
    }

    /**
     * Gets instruction 9.
     *
     * @return the instruction 9
     */
    public String getInstruction9() {
        return instruction9;
    }

    /**
     * Sets instruction 9.
     *
     * @param instruction9 the instruction 9
     */
    public void setInstruction9(String instruction9) {
        this.instruction9 = instruction9;
    }

    /**
     * Gets instruction 10.
     *
     * @return the instruction 10
     */
    public String getInstruction10() {
        return instruction10;
    }

    /**
     * Sets instruction 10.
     *
     * @param instruction10 the instruction 10
     */
    public void setInstruction10(String instruction10) {
        this.instruction10 = instruction10;
    }

    /**
     * Gets instruction 11.
     *
     * @return the instruction 11
     */
    public String getInstruction11() {
        return instruction11;
    }

    /**
     * Sets instruction 11.
     *
     * @param instruction11 the instruction 11
     */
    public void setInstruction11(String instruction11) {
        this.instruction11 = instruction11;
    }

    /**
     * Gets instruction 12.
     *
     * @return the instruction 12
     */
    public String getInstruction12() {
        return instruction12;
    }

    /**
     * Sets instruction 12.
     *
     * @param instruction12 the instruction 12
     */
    public void setInstruction12(String instruction12) {
        this.instruction12 = instruction12;
    }

    /**
     * Gets instruction 13.
     *
     * @return the instruction 13
     */
    public String getInstruction13() {
        return instruction13;
    }

    /**
     * Sets instruction 13.
     *
     * @param instruction13 the instruction 13
     */
    public void setInstruction13(String instruction13) {
        this.instruction13 = instruction13;
    }

    /**
     * Gets instruction 14.
     *
     * @return the instruction 14
     */
    public String getInstruction14() {
        return instruction14;
    }

    /**
     * Sets instruction 14.
     *
     * @param instruction14 the instruction 14
     */
    public void setInstruction14(String instruction14) {
        this.instruction14 = instruction14;
    }

    /**
     * Gets instruction 15.
     *
     * @return the instruction 15
     */
    public String getInstruction15() {
        return instruction15;
    }

    /**
     * Sets instruction 15.
     *
     * @param instruction15 the instruction 15
     */
    public void setInstruction15(String instruction15) {
        this.instruction15 = instruction15;
    }

    /**
     * Gets instruction 16.
     *
     * @return the instruction 16
     */
    public String getInstruction16() {
        return instruction16;
    }

    /**
     * Sets instruction 16.
     *
     * @param instruction16 the instruction 16
     */
    public void setInstruction16(String instruction16) {
        this.instruction16 = instruction16;
    }

    /**
     * Gets instruction 17.
     *
     * @return the instruction 17
     */
    public String getInstruction17() {
        return instruction17;
    }

    /**
     * Sets instruction 17.
     *
     * @param instruction17 the instruction 17
     */
    public void setInstruction17(String instruction17) {
        this.instruction17 = instruction17;
    }

    /**
     * Gets instruction 18.
     *
     * @return the instruction 18
     */
    public String getInstruction18() {
        return instruction18;
    }

    /**
     * Sets instruction 18.
     *
     * @param instruction18 the instruction 18
     */
    public void setInstruction18(String instruction18) {
        this.instruction18 = instruction18;
    }

    /**
     * Gets instruction 19.
     *
     * @return the instruction 19
     */
    public String getInstruction19() {
        return instruction19;
    }

    /**
     * Sets instruction 19.
     *
     * @param instruction19 the instruction 19
     */
    public void setInstruction19(String instruction19) {
        this.instruction19 = instruction19;
    }

    /**
     * Gets instruction 20.
     *
     * @return the instruction 20
     */
    public String getInstruction20() {
        return instruction20;
    }

    /**
     * Sets instruction 20.
     *
     * @param instruction20 the instruction 20
     */
    public void setInstruction20(String instruction20) {
        this.instruction20 = instruction20;
    }

    @Override
    public String toString() {
        return "RecipeInstructions{" +
                "id=" + id +
                ", recipe=" + recipe +
                ", instruction1='" + instruction1 + '\'' +
                ", instruction2='" + instruction2 + '\'' +
                ", instruction3='" + instruction3 + '\'' +
                ", instruction4='" + instruction4 + '\'' +
                ", instruction5='" + instruction5 + '\'' +
                ", instruction6='" + instruction6 + '\'' +
                ", instruction7='" + instruction7 + '\'' +
                ", instruction8='" + instruction8 + '\'' +
                ", instruction9='" + instruction9 + '\'' +
                ", instruction10='" + instruction10 + '\'' +
                ", instruction11='" + instruction11 + '\'' +
                ", instruction12='" + instruction12 + '\'' +
                ", instruction13='" + instruction13 + '\'' +
                ", instruction14='" + instruction14 + '\'' +
                ", instruction15='" + instruction15 + '\'' +
                ", instruction16='" + instruction16 + '\'' +
                ", instruction17='" + instruction17 + '\'' +
                ", instruction18='" + instruction18 + '\'' +
                ", instruction19='" + instruction19 + '\'' +
                ", instruction20='" + instruction20 + '\'' +
                '}';
    }
}
