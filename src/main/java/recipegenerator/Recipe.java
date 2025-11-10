package recipegenerator;

public class Recipe {
    private String name;
    private int spiceLevel;
    private int serves;
    private int calories;
    private int cookingTime;
    private String[] ingredients;
    private String instructions;

    //constructor
    public Recipe(String name, int spiceLevel, int serves, int calories, int cookingTime, String[] ingredients, String instructions) {
        this.name = name;
        this.spiceLevel = spiceLevel;
        this.serves = serves;
        this.calories = calories;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    //getters - won't change so doesn't need setters
    public String getName() {
        return name;
    }
    public int getSpiceLevel() {
        return spiceLevel;
    }
    public int getServes() {
        return serves;
    }
    public int getCalories() {
        return calories;
    }
    public int getCookingTime() {
        return cookingTime;
    }
    public String[] getIngredients() {
        return ingredients;
    }
    public String getInstructions() {
        return instructions;
    }

    //display recipe
    public void displayRecipe() {
        System.out.println("Recipe: " + name);

        System.out.print("Spice Level: ");
        if (spiceLevel == 0){
            System.out.print("Mild \uD83E\uDDCA");
        } else {
            for(int i = 0; i < spiceLevel; i++) {
                System.out.print("\uD83C\uDF36\uFE0F");
            }
        }

        System.out.println("\nServes: " + serves);
        System.out.println("Calories: " + calories);
        System.out.println("Cooking Time: " + cookingTime + " minutes");
        System.out.println("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Instructions:\n" + instructions);
    }
}

/*
TODO
- make recipe look nicely presented
 */
