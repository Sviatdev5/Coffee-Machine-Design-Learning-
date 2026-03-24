public class Main {
    public static void main(String[] args) {
        InventoryManager inv = new InventoryManager();
        inv.addIngredient(new Water(1000));
        inv.addIngredient(new CoffeeBeans(200));
        inv.addIngredient(new Milk(500));
        inv.addIngredient(new Cup(50));

        CoffeeMachine machine = new CoffeeMachine(inv, new DrinkMaker());
        machine.powerOn();

        machine.processOrder(new Latte(), new CardPayment(2.50));
    }
}