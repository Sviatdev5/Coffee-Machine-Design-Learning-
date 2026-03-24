public class CoffeeMachine {
    private  final InventoryManager inventory;
    private final DrinkMaker maker;
    private boolean isOn = false;

    public CoffeeMachine(InventoryManager inv, DrinkMaker m) {
        this.inventory = inv;
        this.maker = m;
    }

    public void powerOn() {
        this.isOn = true;
        System.out.println("[System] Coffee Machine is ON and ready.");
    }

    public void processOrder(Drink drink, Payment payment) {
        if (!isOn) return;
        System.out.println("\n[System] New Order: " + drink.getName() + " | Price: $" + drink.getPrice());
        
        if (inventory.checkStock(drink)) {
            if (payment.authorize()) {
                inventory.updateStock(drink);
                maker.brew(drink);
                System.out.println("[System] Enjoy your " + drink.getName() + "!");
            }
        }
    }
}