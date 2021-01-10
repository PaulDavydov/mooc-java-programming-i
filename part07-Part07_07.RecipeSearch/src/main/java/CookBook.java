import java.util.ArrayList;

public class CookBook {
    private String recipeName;
    private int cookTime;
    private ArrayList<String> ingredients = new ArrayList<>();

    public CookBook(String recipeName, int cookTime, ArrayList<String> ingredients ) {
        this.recipeName = recipeName;
        this.cookTime = cookTime;
        for (String i : ingredients) {
            this.ingredients.add(i);
        }
    }
     public String getRecipeName() {
        return this.recipeName;
     }
     public int getCookTime() {
        return this.cookTime;
     }
    public String getIngredients(int i) {
        return this.ingredients.get(i);
    }
    public void getList() {
        System.out.println(ingredients);
    }
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookTime;
    }

}
