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
        System.out.println("\nYour recipe is...");
        System.out.println("\n==============================");
        System.out.println("\033[0;34m" + name.toUpperCase() + "\033[0m");
        System.out.println("==============================");

        System.out.print("\u001B[1mSpice Level:\033[0m ");
        if (spiceLevel == 0){
            System.out.print("Mild \uD83C\uDF36\uFE0F");
        } else {
            for(int i = 0; i < spiceLevel; i++) {
                System.out.print("\uD83C\uDF36\uFE0F");
            }
        }

        System.out.println("\n\u001B[1m\uD83D\uDC65Serves:\033[0m " + serves);
        System.out.println("\u001B[1m⚖\uFE0FCalories:\033[0m " + calories);
        System.out.println("\u001B[1m⏰Cooking Time:\033[0m " + cookingTime + " minutes");
        System.out.println("------------------------------");
        System.out.println("\u001B[1m\uD83D\uDCCBIngredients:\033[0m ");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println("------------------------------");
        System.out.println("\u001B[1m\uD83D\uDC69\u200D\uD83C\uDF73Instructions:\033[0m\n" + instructions);
        System.out.println("------------------------------");
    }
}

/*
TODO
- make recipe look nicely presented
 */
