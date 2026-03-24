import java.util.*;

public class InventoryManager {
    private final  List<Ingredient> inventory = new ArrayList<>();

    public void addIngredient(Ingredient ing) { inventory.add(ing); }

    public boolean checkStock(Drink drink) {
        Map<String, Integer> recipe = drink.getRecipe();
        for (Ingredient ing : inventory) {
            if (recipe.containsKey(ing.getName()) && !ing.hasEnough(recipe.get(ing.getName()))) {
                System.out.println("[Inventory] Error: Not enough " + ing.getName());
                return false;
            }
        }
        return true;
    }

    public void updateStock(Drink drink) {
        Map<String, Integer> recipe = drink.getRecipe();
        for (Ingredient ing : inventory) {
            if (recipe.containsKey(ing.getName())) {
                ing.consume(recipe.get(ing.getName()));
            }
        }
    }
}