package com.amgenz.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeParser {
    private final Logger logger= LogManager.getLogger(this.getClass());
    private Map<String, List<String>> ingredients = new HashMap<>();
    private Map<String, List<String>> directions = new HashMap<>();

    private int counterIngredient = 0;

    private int counterDirection = 0;

    public RecipeParser() {

    }

    public Map<String, List<String>> parseIngredients(String ingredientBody) {
        try {
            BufferedReader reader = new BufferedReader(new StringReader(ingredientBody));
            String line = reader.readLine();
            while(line != null) {
                counterIngredient++;
                parseIngredientLine(line);
            }
        } catch (IOException ioe){
            logger.error("There was an error :" + ioe);
        }
        return ingredients;
    }

    public void parseIngredientLine(String line) {
        String[] ingredientParts = line.split(" ", 3);
        String item = "ingredient " + counterIngredient;
        ingredients.put(item, Arrays.asList(ingredientParts[0], ingredientParts[1], ingredientParts[2]));


    }

    public Map<String, List<String>> parseDirections(String directionBody) {
        try {
            BufferedReader reader = new BufferedReader(new StringReader(directionBody));
            String line = reader.readLine();
            while(line != null) {
                counterDirection++;
                parseDirectionLine(line);
            }
        } catch (IOException ioe){
            logger.error("There was an error :" + ioe);
        }
        return ingredients;
    }

    public void parseDirectionLine(String line) {
        String[] directionParts = line.split(" ", 2);
        String item = "direction " + counterDirection;
        ingredients.put(item, Arrays.asList(directionParts[0], directionParts[1]));
    }
}
