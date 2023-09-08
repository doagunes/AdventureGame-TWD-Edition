public class Zombie extends BadCharacters{
    public Zombie(String name, Inventory inventory, double power, double criticalRate,
                  double defenseRate, String goodQuote, String badQuote, boolean isBadChar) {
        super(name, inventory, power, criticalRate, defenseRate, goodQuote, badQuote, isBadChar);
        health = 100;
    }
    public void act() {
        attack();
    }




}
