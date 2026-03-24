import java.util.*;
class Latte extends Drink {
    public Latte() { super("Latte", 2.50); }
    @Override
    public Map<String, Integer> getRecipe() {
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("Coffee Beans", 7);
        recipe.put("Water", 30);
        recipe.put("Milk", 150);
        recipe.put("Cup", 1);
        return recipe;
    }
}
