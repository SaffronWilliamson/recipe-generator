package recipegenerator;

public class VegetarianRecipe extends Recipe {
    private boolean isVeggie;

    //constructor
    public VegetarianRecipe(String name, int spiceLevel, int serves, int calories, int cookingTime, String[] ingredients, String instructions, boolean isVeggie) {
        super(name, spiceLevel, serves, calories, cookingTime, ingredients, instructions);
        this.isVeggie = isVeggie;
    }
    //getter
    public boolean isVeggie(){
        return isVeggie;
    }
}