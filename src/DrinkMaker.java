public class DrinkMaker {
    public void brew(Drink drink) {
        System.out.println("[Hardware] Heating water to 95°C...");
        System.out.println("[Hardware] Grinding coffee beans...");
        System.out.println("[Hardware] Mixing ingredients for " + drink.getName() + "...");
        System.out.println("[Hardware] Dispensing drink. Done!");
    }
}