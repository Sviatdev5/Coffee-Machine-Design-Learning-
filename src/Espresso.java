import java.util.*;
class Espresso extends Drink {
    public Espresso() { super("Espresso", 1.50); }
    @Override
    public Map<String, Integer> getRecipe() {
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("Coffee Beans", 7);
        recipe.put("Water", 30);
        recipe.put("Cup", 1);
        return recipe;
    }
}
