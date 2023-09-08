public class GoodCharacters extends Character{
    public GoodCharacters(String name, Inventory inventory, double power, double criticalRate,
                          double defenseRate, String goodQuote, String badQuote, boolean isBadChar) {
        super(name, inventory, power, criticalRate, defenseRate, goodQuote, badQuote, isBadChar);
        health = 200;
    }
    public void act() {
        talk();
    }

}
