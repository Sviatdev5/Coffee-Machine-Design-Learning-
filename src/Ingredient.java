public abstract class Ingredient {
    protected String name;
    protected int quantity;

    public Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public boolean hasEnough(int amount) { return quantity >= amount; }
    public void consume(int amount) { this.quantity -= amount; }
    public String getName() { return name; }
}
 

