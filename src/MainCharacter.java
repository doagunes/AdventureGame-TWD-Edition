public class MainCharacter extends Character{
    public MainCharacter(String name, Inventory inventory, double power,
                         double criticalRate, double defenseRate, String goodQuote, String badQuote) {
        super(name, inventory, power, criticalRate, defenseRate, goodQuote, badQuote);
        health = 300;
    }
}
