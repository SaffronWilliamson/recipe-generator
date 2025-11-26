package recipegenerator;

public class MeatRecipe extends Recipe{
    private String meatType;

    //constructor
    public MeatRecipe (String name, int spiceLevel, int serves, int calories, int cookingTime, String[] ingredients, String instructions, String meatType){
        super(name, spiceLevel, serves, calories, cookingTime, ingredients, instructions);
        this.meatType = meatType;
    }

    //getter
    public String getMeatType(){
        return meatType;
    }
}